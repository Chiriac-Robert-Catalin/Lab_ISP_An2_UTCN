package isp.lab4.exercise5;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;


public class Exercise5 {
    public static void main(String args[]){
        TemperatureSensor Sensor1 = new TemperatureSensor(40,"Dormitor");
        TemperatureSensor Sensor2 = new TemperatureSensor(49,"Sufragerie");
        TemperatureSensor Sensor3 = new TemperatureSensor(25,"Baie");
        FireAlarm fire = new FireAlarm(false);
        Controler control = new Controler(Sensor1,Sensor2,Sensor3,fire);
        House Casa = new House(control);
        Casa.getControler().ControlStep();
    }
}
