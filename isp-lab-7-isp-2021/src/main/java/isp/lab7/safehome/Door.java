package isp.lab7.safehome;

public class Door {
    private DoorStatus status;
    public Door(DoorStatus stare)
    {
        this.status=stare;
    }
    public void setStatus(DoorStatus status) {
        this.status = status;
    }

    public DoorStatus getStatus() {
        return status;
    }
    public void lockDoor()
    {
        setStatus(DoorStatus.CLOSE);
    }
    public void unlockDoor()
    {
        setStatus(DoorStatus.OPEN);
    }
    
}
