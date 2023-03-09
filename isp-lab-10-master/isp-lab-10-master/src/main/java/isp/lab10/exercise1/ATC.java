package isp.lab10.exercise1;

import java.util.ArrayList;

public class ATC {
    private ArrayList<Aircraft> avioane;
    public ATC(){
        avioane=new ArrayList<>();
    }
    public void addAircraft(Aircraft a)
    {
        avioane.add(a);
    }
    public void ShowAircrafts()
    {
        for(Aircraft f : avioane)
        {
            System.out.println(f.toString());
        }
    }
    public void SendCommand(String id,AtcCommand command)
    {
        for(Aircraft f : avioane)
        {
            if(f.getId()==id)
            {
                f.ReceiveAtcMessage(command);
            }
        }
    }
}
