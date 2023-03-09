package isp.lab4.exercise1;

public class TemperatureSensor {

    //atribute
    private int value;
    private String location;

    //constructori
    public TemperatureSensor(int valoare, String locatie){
        this.value=valoare;
        this.location=locatie;
    }


    //metode
    public int getValue() {
        return value;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "TemperatureSensor{" +
                "value=" + value +
                ", location='" + location + '\'' +
                '}';
    }
}
