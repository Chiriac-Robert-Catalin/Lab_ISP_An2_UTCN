package isp.lab4.exercise3;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

public class Exercise3 {
    public static void main(String args[]) {
        TemperatureSensor Sensor = new TemperatureSensor(50, "Sufragerie");
        FireAlarm fire = new FireAlarm(false);
        Controller control = new Controller(Sensor, fire);
        control.ControlStep();
    }
}
