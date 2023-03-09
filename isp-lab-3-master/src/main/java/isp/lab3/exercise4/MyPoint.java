package isp.lab3.exercise4;

public class MyPoint {
    private int x,y,z;
    public MyPoint()
    {
        x= 0;
        y=0;
        z=0;
    }
    public MyPoint(int xc,int yc, int zc)
    {
        x=xc;
        y=yc;
        z=zc;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public void setXYZ(int xc,int yc, int zc)
    {
        this.x=xc;
        this.y=yc;
        this.z=zc;
    }
    public double distance(int x,int y, int z)
    {
        return Math.sqrt(Math.pow((x-this.x),2)+Math.pow((y-this.y),2)+Math.pow((z-this.z),2));
    }
    public double distance(MyPoint point)
    {
        return Math.sqrt(Math.pow((point.x-this.x),2)+Math.pow((point.y-this.y),2)+Math.pow((point.z-this.z),2));
    }
    @Override
    public String toString() {
        return "(" + x +", " + y +", "+ z + ')';
    }
    public static void main(String args[])
    {
        MyPoint p1 = new MyPoint();
        System.out.println(p1.toString());
        p1.setXYZ(4,3,4);
        System.out.println(p1.toString());
        System.out.println(p1.distance(5,5,5));
        MyPoint p2 = new MyPoint(6,8,8);
        System.out.println(p1.distance(p2));
    }
}
