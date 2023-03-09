package isp.lab4.exercise1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TemperatureSensorTest {

    TemperatureSensor BoschTest = new TemperatureSensor(25,"Sufragerie");
    @Test
    public void ValueTest(){
        assertEquals("these 2 should be the same number",25,BoschTest.getValue());
    }
    @Test
    public void LocationTest(){
        assertEquals("Sufragerie",BoschTest.getLocation());
    }
    @Test
    public void StringTest(){
        assertEquals("TemperatureSensor{value=25, location="+"'Sufragerie'"+"}",BoschTest.toString());
    }
}
