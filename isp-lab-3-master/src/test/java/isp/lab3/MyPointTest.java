package isp.lab3;
import org.junit.Test;
import isp.lab3.exercise4.MyPoint;

import static org.junit.Assert.assertEquals;

public class MyPointTest {
    MyPoint ptest = new MyPoint();
    @Test
    public void testDistance()
    {
        assertEquals("These 2 should be equal",3.0,ptest.distance(1,2,2),0);
    }
}
