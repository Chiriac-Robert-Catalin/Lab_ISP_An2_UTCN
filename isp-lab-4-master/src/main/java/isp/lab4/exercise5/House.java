package isp.lab4.exercise5;
import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;
import isp.lab4.exercise5.Controler;
public class House {
    private Controler controler;
    public House(Controler control)
    {
        this.controler=control;
    }
    public Controler getControler() {
        return controler;
    }
}
