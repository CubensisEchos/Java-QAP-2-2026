public class MyRectangle
{
    //variables
    private MyPoint topLeft;
    private MyPoint bottomRight;

    //constructors
    public MyRectangle()//sets up for 1x1 rectangle
    {
        this.topLeft = new MyPoint(0, 0);
        this.bottomRight = new MyPoint(1, 1);
    }

    public MyRectangle(int x1, int y1, int x2, int y2)
    {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight)
    {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    //get and set stuff
    public MyPoint getTopLeft()
    {
        return topLeft;
    }
    public void setTopLeft(MyPoint topLeft)
    {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight()
    {
        return bottomRight;
    }
    public void setBottomRight(MyPoint bottomRight)
    {
        this.bottomRight = bottomRight;
    }

    //rectangle calculations
    public double getWidth()
    {
        return bottomRight.getX() - topLeft.getX();
    }
    public double getHeight()
    {
        return bottomRight.getY() - topLeft.getY();
    }
    public double getArea()
    {
        return getWidth() * getHeight();
    }
    public double getPerimeter()
    {
        return 2 * (getWidth() + getHeight());
    }

    //string rep
    public String toString()
    {
        return "Top Left: " + topLeft + "\nBottom Right: " + bottomRight;
    }
}
