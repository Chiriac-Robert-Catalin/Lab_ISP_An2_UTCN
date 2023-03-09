package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SensorReadingList implements IReadingRepository{
    ArrayList<SensorReading> Lista_Senzori;
    public SensorReadingList(){
        this.Lista_Senzori= new ArrayList<>();
    }
    @Override
    public void addReading(SensorReading reading) {
        this.Lista_Senzori.add(reading);
    }

    @Override
    public double getAverageValueByType(Type type, String location) {
        double S=0,n=0;
        for(int i=0;i<Lista_Senzori.size();i++)
        {
            if(Lista_Senzori.get(i).getType()==type&&Lista_Senzori.get(i).getLocation()==location)
            {
                S+=Lista_Senzori.get(i).getValue();
                n++;
            }
        }
        S=S/n;
        return S;
    }

    @Override
    public List<SensorReading> getReadingsByType(Type type) {
        ArrayList<SensorReading> Senzori_gasiti = new ArrayList<>();
        SensorReading object;
        for(int i=0;i<Lista_Senzori.size();i++)
        {
            if(Lista_Senzori.get(i).getType()==type)
            {
                object = Lista_Senzori.get(i);
                Senzori_gasiti.add(object);
            }
        }
        return Senzori_gasiti;
    }

    @Override
    public void listSortedByLocation() {
        Lista_Senzori.sort((o1, o2) -> o1.getLocation().compareTo(o2.getLocation()));
    }

    @Override
    public void listSortedByValue() {
        SensorReading aux;
        for(int i=0;i<Lista_Senzori.size()-1;i++)
            for(int j=i+1;j<Lista_Senzori.size();j++)
            {
                if(Lista_Senzori.get(i).getValue()>=Lista_Senzori.get(j).getValue())
                {
                    aux = new SensorReading(Lista_Senzori.get(i).getValue(),Lista_Senzori.get(i).getLocation(),Lista_Senzori.get(i).getType());
                    Lista_Senzori.get(i).setLocation(Lista_Senzori.get(j).getLocation());
                    Lista_Senzori.get(i).setValue(Lista_Senzori.get(j).getValue());
                    Lista_Senzori.get(i).setType(Lista_Senzori.get(j).getType());
                    Lista_Senzori.get(j).setLocation(aux.getLocation());
                    Lista_Senzori.get(j).setValue(aux.getValue());
                    Lista_Senzori.get(j).setType(aux.getType());
                }
            }
    }

    @Override
    public List<SensorReading> findAllByLocationAndType(String location, Type type) {
        ArrayList<SensorReading> Senzori_gasiti = new ArrayList<>();
        for(int i=0;i<Lista_Senzori.size();i++)
        {
            if(Lista_Senzori.get(i).getType()==type&&Lista_Senzori.get(i).getLocation()==location)
            {
                Senzori_gasiti.add(Lista_Senzori.get(i));
            }
        }
        return Senzori_gasiti;
    }
    public void ShowAllSensors()
    {
        for(int i=0;i<Lista_Senzori.size();i++)
        {
            System.out.println("Senzor "+i+": location="+Lista_Senzori.get(i).getLocation()+", value="+Lista_Senzori.get(i).getValue()+", type="+Lista_Senzori.get(i).getType());
        }
    }
}
