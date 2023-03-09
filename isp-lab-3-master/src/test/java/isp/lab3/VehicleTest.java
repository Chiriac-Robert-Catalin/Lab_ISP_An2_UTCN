package isp.lab3;
import isp.lab3.exercise3.Vehicle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class VehicleTest {
    Vehicle CarTest = new Vehicle("Dacia","Logan",150,'B');
    @Test
    public void testToString()
    {
        assertEquals("The strings should be the same","Dacia(Logan) speed 150 fuel type B",CarTest.toString());
    }
}
