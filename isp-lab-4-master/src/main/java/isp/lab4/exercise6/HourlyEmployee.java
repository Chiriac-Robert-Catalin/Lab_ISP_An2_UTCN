package isp.lab4.exercise6;

public class HourlyEmployee extends  Employee{
    private double wage;
    private double hours;
    public HourlyEmployee(String LastName,String FirstName,double wage,double hours){
        super(FirstName,LastName);
        this.wage=wage;
        this.hours=hours;
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public double getPaymentAmount() {
        return super.getPaymentAmount();
    }

    public double getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
}
