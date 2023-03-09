package isp.lab4.exercise3;
import isp.lab4.exercise2.FireAlarm;
import isp.lab4.exercise1.TemperatureSensor;
public class Controller {
    private TemperatureSensor Sensor1;
    private FireAlarm Beepaitor1;
    public Controller(TemperatureSensor sensor,FireAlarm fire){
        this.Sensor1=sensor;
        this.Beepaitor1=fire;
    }
    public void ControlStep() {
        if (Sensor1.getValue() >= 50) {
            Beepaitor1.setActive(true);
            System.out.println("Fire alarm started");
        } else {
            Beepaitor1.setActive(false);
            System.out.println("Fire alarm not started");
        }
    }
}
