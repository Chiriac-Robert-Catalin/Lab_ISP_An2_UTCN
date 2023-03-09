package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        SensorReading sensor1apa = new SensorReading(30,"Galati",Type.HUMIDITY);
        SensorReading sensor1temp= new SensorReading(20,"Braila",Type.TEMPERATURE);
        SensorReading sensor1presiune = new SensorReading(35,"Constanta",Type.PRESSURE);
        SensorReading sensor2apa = new SensorReading(45,"Galati",Type.HUMIDITY);
        SensorReadingList ListaSenzori = new SensorReadingList();
        ListaSenzori.addReading(sensor1apa);
        ListaSenzori.addReading(sensor1presiune);
        ListaSenzori.addReading(sensor1temp);
        ListaSenzori.addReading(sensor2apa);
        System.out.println(ListaSenzori.getAverageValueByType(Type.HUMIDITY,"Galati"));
        List<SensorReading> Senzori_gasiti = new ArrayList<SensorReading>();
        Senzori_gasiti = ListaSenzori.getReadingsByType(Type.PRESSURE);
        int i;
        for(i=0;i<Senzori_gasiti.size();i++)
        {
            System.out.println(Senzori_gasiti.get(i).getValue());
        }
        ListaSenzori.ShowAllSensors();
        System.out.println("-----------------------------------------------");
     ListaSenzori.listSortedByLocation();
        ListaSenzori.ShowAllSensors();
        System.out.println("-----------------------------------------------");
        ListaSenzori.listSortedByValue();
        ListaSenzori.ShowAllSensors();
        System.out.println(ListaSenzori.Lista_Senzori.size());
        System.out.println("Test implementation here.");
    }
}
