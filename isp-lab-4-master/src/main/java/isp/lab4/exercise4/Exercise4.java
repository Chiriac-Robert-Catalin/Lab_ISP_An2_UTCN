package isp.lab4.exercise4;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;
import isp.lab4.exercise3.Controller;

public class Exercise4 {
    public static void main(String args[]){
        TemperatureSensor Sensor1 = new TemperatureSensor(40,"Dormitor");
        TemperatureSensor Sensor2 = new TemperatureSensor(50,"Sufragerie");
        TemperatureSensor Sensor3 = new TemperatureSensor(25,"Baie");
        FireAlarm fire = new FireAlarm(false);
        Controler control = new Controler(Sensor1,Sensor2,Sensor3,fire);
        control.ControlStep();
    }
}
