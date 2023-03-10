package aut.utcluj.isp.ex2;

/**
 * @author stefan
 */
public class Person {
    protected String firstName;
    protected String lastName;

    public Person(String firstName) {
        this.lastName = "";
        this.firstName = firstName;
    }

    public Person(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object obj)
    {
        //Check for null and compare run-time types.
        final Person other = (Person) obj;
        if ((this.firstName==other.firstName)&&(this.lastName==other.lastName))
        {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return  firstName +" "+ lastName ;
    }
}
