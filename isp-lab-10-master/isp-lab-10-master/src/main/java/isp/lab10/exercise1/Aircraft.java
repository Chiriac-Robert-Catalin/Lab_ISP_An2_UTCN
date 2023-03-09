package isp.lab10.exercise1;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Aircraft implements Runnable {
    private String id;
    private int altitude;
    private int targetAltitude;
    public Aircraft(String id)
    {
        this.id=id;
        this.altitude=0;
        this.targetAltitude=0;
    }

    public void ReceiveAtcMessage(AtcCommand command)
    {
        if(command.AtcState=="TAKEOFF" && this.altitude==0)
        {

            this.setTargetAltitude(command.AtcAltitude);
            this.run();
        }
        else
        if(command.AtcState=="LAND"&&this.altitude==this.targetAltitude)
        {

            this.setTargetAltitude(0);
            this.run();
        }
        else
        {
            System.out.println("The plane is already flying and not in cruise altitude");
        }
    }

    public int getTargetAltitude() {
        return targetAltitude;
    }

    public void setTargetAltitude(int targetAltitude) {
        this.targetAltitude = targetAltitude;
    }

    @Override
    public void run() {

        if(this.altitude==0&&this.targetAltitude!=0) {
            System.out.println("Taxing");
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Taking off");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Ascending");
            try {
                TimeUnit.SECONDS.sleep(10 * (this.targetAltitude / 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.altitude=this.targetAltitude;
            System.out.println("Cruising");
        }
        if(this.targetAltitude==0&&this.altitude!=0) {
            System.out.println("Descending");
            try {
                TimeUnit.SECONDS.sleep(10 * (this.altitude / 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.altitude=0;
            System.out.println("successfuly landed");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "id='" + id + '\'' +
                ", altitude=" + altitude +
                '}';
    }
}
