package isp.lab10.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        ATC atc = new ATC();
        Aircraft avion1 = new Aircraft("0001");
        Aircraft avion2 = new Aircraft("0002");
        Aircraft avion3 = new Aircraft("0003");
        atc.addAircraft(avion1);
        atc.addAircraft(avion2);
        atc.addAircraft(avion3);
        avion1.run();
        avion2.run();
        avion3.run();
        atc.ShowAircrafts();
        TakeoffCommand T1000= new TakeoffCommand(1000);
        LandCommand LAND = new LandCommand();
        atc.SendCommand("0001",T1000);
        atc.SendCommand("0001",LAND);
    }
}
