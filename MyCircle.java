public class MyCircle
{
    //variables
    private MyPoint center;
    private double radius;

    //constructors
    public MyCircle()
    {
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }

    public MyCircle(int x, int y, double radius)
    {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, double radius)
    {
        this.center = center;
        this.radius = radius;
    }

    //get and set stuff
    public MyPoint getCenter()
    {
        return center;
    }
    public void setCenter(MyPoint center)
    {
        this.center = center;
    }

    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    //calculations
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    //string rep
    public String toString()
    {
        return "Center: " + center + ", Radius: " + radius;
    }
}
