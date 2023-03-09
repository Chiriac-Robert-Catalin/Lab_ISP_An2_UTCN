package isp.lab10.exercise1;

public class TakeoffCommand extends AtcCommand{

    public TakeoffCommand(int altitude)
    {
        super.AtcAltitude=altitude;
        super.AtcState="TAKEOFF";
    }

}
