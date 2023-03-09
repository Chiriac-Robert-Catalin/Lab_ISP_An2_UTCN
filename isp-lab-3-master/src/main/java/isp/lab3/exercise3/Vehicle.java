package isp.lab3.exercise3;

public class Vehicle {
    private String Model;
    private String type;
    private int speed;
    private char fueltype;
    private static int nrcars;
    public Vehicle(String Modell,String typee,int speeed, char Fueltype)
    {
        this.Model=Modell;
        this.type=typee;
        this.speed=speeed;
        if(Fueltype=='B'||Fueltype=='D')
            this.fueltype=Fueltype;
        else
        {
            System.out.println("Introducere eronata, automat il categorisim ca fiind benzina");
            this.fueltype='B';
        }
        this.nrcars+=1;
    }

    public void setFueltype(char fueltype) {
        this.fueltype = fueltype;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getFueltype() {
        return fueltype;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return Model;
    }

    public String getType() {
        return type;
    }

    public static int getNrcars() {
        return nrcars;
    }

    @Override
    public String toString() {
        return getModel()+"("+getType()+")"+" speed "+getSpeed()+" fuel type "+getFueltype();
    }

    public boolean equal( Vehicle y)
    {
        if(this.getType()==y.getType()&&this.getModel()==y.getModel()&&this.getFueltype()==y.getFueltype()&&this.getSpeed()==y.getSpeed())
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Vehicle Dacia = new Vehicle("Dacia","Logan",150,'B');
        System.out.println(Dacia.toString());
        Vehicle Volvo = new Vehicle("Volvo","S40",180,'D');
        System.out.println(Volvo.toString());
        System.out.println(Volvo.getNrcars());
        System.out.println();
        System.out.println(Dacia.equal(Volvo));
    }
}
