package isp.lab4.exercise6;
import isp.lab4.exercise6.Employee;
public class CommisionEmployee extends  Employee{
    private double grossSales;
    private double commisionSales;
    public CommisionEmployee(String LastName,String FirstName,double grossSales, double commisionSales)
    {
        super(FirstName,LastName);
        this.grossSales=grossSales;
        this.commisionSales=commisionSales;
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

    public double getCommisionSales() {
        return commisionSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    public void setCommisionSales(double commisionSales) {
        this.commisionSales = commisionSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
}
