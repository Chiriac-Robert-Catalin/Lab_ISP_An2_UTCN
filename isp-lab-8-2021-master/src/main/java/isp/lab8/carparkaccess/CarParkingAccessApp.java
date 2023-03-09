package isp.lab8.carparkaccess;

import isp.lab8.carparkaccess.file.ParkingAccessFileControl;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CarParkingAccessApp {
    public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
        System.out.println("It works!");
        

        

        
        ////////////////////////////////
        
        ParkingAccessControl fpac = new ParkingAccessControl();

        Car c1 = new Car("CJ-01-AAA", System.currentTimeMillis());
        fpac.carEntry(c1);
        TimeUnit.SECONDS.sleep(3);
        int price = fpac.carExit("CJ-01-AAA");

        System.out.println("Price for parking is ="+price);
        Car c2 = new Car("CJ-02-AAA", System.currentTimeMillis());
        Car c3 = new Car("CJ-02-BBB", System.currentTimeMillis());
        Car c4 = new Car("CJ-02-CCC", System.currentTimeMillis());
        fpac.carEntry(c2);
        fpac.carEntry(c3);
        fpac.carEntry(c4);
        TimeUnit.SECONDS.sleep(5);

        price = fpac.carExit("CJ-02-CCC");

        System.out.println("Price to be payed = "+price);
        fpac.viewCurrentCars();
        System.out.println("Some time later");
        fpac.carEntry(c4);
        fpac.viewCurrentCars();
        TimeUnit.SECONDS.sleep(10);
        fpac.carExit("CJ-02-CCC");
        fpac.viewPastEntriesForCar("CJ-02-CCC");
        fpac.viewPastUniqueEntries();
    }
}
