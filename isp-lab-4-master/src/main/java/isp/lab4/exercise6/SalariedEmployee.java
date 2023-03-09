package isp.lab4.exercise6;

public class SalariedEmployee extends  Employee{
    private double weeklySalary;
    public SalariedEmployee(String FirstName,String LastName, double weeklySalary){
        super(FirstName,LastName);
        this.weeklySalary=weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        return super.getPaymentAmount();
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}
