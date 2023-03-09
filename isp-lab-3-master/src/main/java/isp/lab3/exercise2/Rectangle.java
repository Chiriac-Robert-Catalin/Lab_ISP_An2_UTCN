package isp.lab3.exercise2;

public class Rectangle {
    private int width=1,length=2;
    private String colour = "red";
    public Rectangle()
    {

    }
    public Rectangle(int x,int y)
    {
        length=x;
        width=y;
    }
    public Rectangle(int x,int y,String z)
    {
        length=x;
        width=y;
        colour=z;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getColour() {
        return colour;
    }
    public int getPerimeter(){
        return 2*(length+width);
    }
    public int getArea(){
        return length*width;
    }
    public static void main(String[] args)
    {
        Rectangle Dreptunghi = new Rectangle();
        System.out.println(Dreptunghi.getColour());
        System.out.println(Dreptunghi.getPerimeter());
        System.out.println(Dreptunghi.getArea());
        Rectangle Patrat = new Rectangle(4,4,"yellow");
        System.out.println(Patrat.getColour());
        System.out.println(Patrat.getPerimeter());
        System.out.println(Patrat.getArea());
        System.out.println(Dreptunghi.getLength()+" "+Patrat.getLength());
    }
}
