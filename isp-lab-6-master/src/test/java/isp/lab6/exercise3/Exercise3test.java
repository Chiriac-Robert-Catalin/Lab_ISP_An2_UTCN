package isp.lab6.exercise3;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Exercise3test {
    @Test
    public void TestNewSensor()
    {
        SensorCluster c = new SensorCluster();
        Assert.assertEquals(0,c.sensors.size());
        c.addSensor("1",SensorType.TEMP);
        Assert.assertEquals(1,c.sensors.size());
    }
    @Test
    public void TestWriteReading()
    {
        SensorCluster c = new SensorCluster();
        c.addSensor("1",SensorType.TEMP);
        Sensor s1 = c.getSensorById("1");
        Assert.assertEquals(0,s1.readings.size());
        c.writeSensorReading("1",8,9);
        c.writeSensorReading("1",1,91);
        c.writeSensorReading("1",7,92);
        c.writeSensorReading("1",5,93);
        c.writeSensorReading("1",2,19);

        Sensor s2 = c.getSensorById("1");
        Assert.assertEquals(5,s2.readings.size());
    }
    @Test
    public void TestSortList()
    {
        SensorCluster c = new SensorCluster();
        c.addSensor("1",SensorType.TEMP);

        c.writeSensorReading("1",8,9);
        c.writeSensorReading("1",1,91);
        c.writeSensorReading("1",7,92);
        c.writeSensorReading("1",5,93);
        c.writeSensorReading("1",2,19);

        Sensor s1 = c.getSensorById("1");
        List<SensorReading> rez = s1.getSensorReadingSortedByValue();
        SensorReading r1 = new SensorReading(1.0,91);
        SensorReading r2 = new SensorReading(2.0,19);
        SensorReading r3 = new SensorReading(5.0,93);
        SensorReading r4 = new SensorReading(7.0,92);
        SensorReading r5 = new SensorReading(8.0,9);
        List<SensorReading> reztest = new ArrayList<>();
        reztest.add(r1);
        reztest.add(r2);
        reztest.add(r3);
        reztest.add(r4);
        reztest.add(r5);
        for(int i=0;i<rez.size();i++)
        {
            Assert.assertEquals(reztest.get(i).value,rez.get(i).value,0);
            Assert.assertEquals(reztest.get(i).dateAndTime,rez.get(i).dateAndTime);
        }
    }
}
