package isp.lab7.safehome;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DoorLockController implements ControllerInterface{
    public Door door;
    public int attempts=0;
    private String MASTER_KEY=ControllerInterface.MASTER_KEY;
    private String Master_tenant = ControllerInterface.MASTER_TENANT_NAME;
    private HashMap<Tenant,AccessKey> validAccess;
    private ArrayList<AccessLog> Log;
    public DoorLockController(Door door1)
    {
        this.door=door1;
        this.validAccess=new HashMap<>();
        this.Log=new ArrayList<>();
    }

    @Override
    public DoorStatus enterPin(String pin) throws Exception {
        LocalDateTime date = LocalDateTime.now();
        if(pin==MASTER_KEY)
        {
            attempts=0;
            AccessLog e = new AccessLog(Master_tenant,date,"enterPin",door.getStatus(),"None");
            Log.add(e);
            if(door.getStatus()==DoorStatus.OPEN)
                door.lockDoor();
            else
                door.unlockDoor();
            return door.getStatus();
        }
        if(attempts>=3)
        {
            AccessLog e = new AccessLog("Unknown",date,"enterPin",null,"Too many attempts!");
            Log.add(e);
            throw new TooManyAttemptsException("There have been too many attempts! Master key needed in order to reset!");
        }
        else {
            for (Tenant i : validAccess.keySet()){
                AccessKey j = validAccess.get(i);
                if (j.getKey() == pin) {

                    AccessLog e = new AccessLog(i.getName(),date,"enterPin",door.getStatus(),"None");
                    attempts = 0;
                    if(door.getStatus()==DoorStatus.OPEN)
                        door.lockDoor();
                    else
                        door.unlockDoor();
                    return door.getStatus();
                }
                }
            attempts++;

            if(attempts>=3)
            {
                AccessLog e = new AccessLog("Unknown",date,"enterPin",null,"Too many attempts!");
                Log.add(e);
                throw new TooManyAttemptsException("There have been too many attempts! Master key needed in order to reset!");
            }
            AccessLog e = new AccessLog("Unknown",date,"enterPin",null,"Invalid Pin");
            Log.add(e);
            throw new InvalidPinException("The pin you entered is invalid");

        }
    }

    @Override
    public void addTenant(String pin, String name) throws Exception {
        LocalDateTime date = LocalDateTime.now();
        for(Tenant i:validAccess.keySet())
        {
            if(name==i.getName())
            {
                AccessLog e = new AccessLog("Master",date,"addTenant",door.getStatus(),"Existing tenant");
                Log.add(e);

                throw new TenantAlreadyExistsException("This tenant is already in our database!");
            }
        }
        Tenant Owner=new Tenant(name);
        AccessKey Key = new AccessKey(pin);
        validAccess.put(Owner, Key);
        if(door.getStatus()==DoorStatus.OPEN)
           door.lockDoor();
        else
            door.unlockDoor();
        AccessLog e = new AccessLog("Master",date,"addTenant",door.getStatus(),"None");
        Log.add(e);

    }

    @Override
    public void removeTenant(String name) throws Exception {
        LocalDateTime date = LocalDateTime.now();
        int ok=1;
        for(Tenant i: validAccess.keySet())
        {
            if(i.getName()==name)
            {
                AccessLog e = new AccessLog(i.getName(),date,"removeTenant",door.getStatus(),"None");
                Log.add(e);
                validAccess.remove(i);
                ok=0;
            }
        }
        if(ok==1)
        {AccessLog e = new AccessLog("Master",date,"removeTenant",door.getStatus(),"Tenant doesn't exist");
        Log.add(e);
        throw new TenantNotFoundException("This Tenant is not in our database!");
        }
    }
}
