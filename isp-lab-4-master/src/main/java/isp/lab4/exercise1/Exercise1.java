package isp.lab4.exercise1;
import isp.lab4.exercise1.TemperatureSensor;
//import isp.lab4.exercise0.CarAlarm; //NU ASA

public class Exercise1 {

    public static void main(String[] args) {
        //instantiati obiect
        TemperatureSensor Bosch = new TemperatureSensor(30,"Sufragerie");
        System.out.println(Bosch.getValue());
        System.out.println(Bosch.toString());
    }
}
