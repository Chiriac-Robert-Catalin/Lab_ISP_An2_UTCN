package isp.lab4.exercise5;
import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;
public class Controler {
    private TemperatureSensor sensor1,sensor2,sensor3;
    private FireAlarm beepaitor;
    public Controler(TemperatureSensor sensor1,TemperatureSensor sensor2, TemperatureSensor sensor3,FireAlarm beepaitor){
        this.sensor1=sensor1;
        this.sensor2=sensor2;
        this.sensor3=sensor3;
        this.beepaitor=beepaitor;
    }
    public void ControlStep() {
        if (sensor1.getValue() >= 50 || sensor2.getValue() >= 50 || sensor3.getValue() >= 50) {
            beepaitor.setActive(true);
            System.out.println("Fire alarm started");
        } else {
            beepaitor.setActive(false);
            System.out.println("Fire alarm not started");
        }
    }
}
