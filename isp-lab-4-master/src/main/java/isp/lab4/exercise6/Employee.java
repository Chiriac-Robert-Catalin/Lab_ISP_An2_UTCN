package isp.lab4.exercise6;

public class Employee {
    private String FirstName;
    private String LastName;
    public Employee(){
        //does nothing but it fixes something, so this exists now
    }
    public Employee(String prenume,String nume){
        this.FirstName = prenume;
        this.LastName=nume;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public double getPaymentAmount(){
        return 0.0;
    }
}
