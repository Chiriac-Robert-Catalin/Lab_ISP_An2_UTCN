package isp.lab4.exercise2;
import org.junit.Test;
import org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
public class FireAlarmTest {
    FireAlarm BeepaitorTest = new FireAlarm(true);
    @Test
    public void testToString(){
        assertEquals("FireAlarm{active=true}",BeepaitorTest.toString());
    }
}
