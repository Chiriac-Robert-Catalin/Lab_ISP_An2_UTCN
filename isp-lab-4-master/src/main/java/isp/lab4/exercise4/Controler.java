package isp.lab4.exercise4;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

public class Controler {
    private TemperatureSensor Sensor1;
    private TemperatureSensor Sensor2;
    private TemperatureSensor Sensor3;
    private FireAlarm Beepaitor1;
    public Controler(TemperatureSensor sensor,TemperatureSensor sensor2,TemperatureSensor sensor3,FireAlarm fire){
        this.Sensor1=sensor;
        this.Beepaitor1=fire;
        this.Sensor2=sensor2;
        this.Sensor3=sensor3;
    }
    public void ControlStep() {
        if (Sensor1.getValue() >= 50&&Sensor2.getValue()>=50&&Sensor3.getValue()>=50) {
            Beepaitor1.setActive(true);
            System.out.println("Fire alarm started");
        } else {
            Beepaitor1.setActive(false);
            System.out.println("Fire alarm not started");
        }
    }
}
