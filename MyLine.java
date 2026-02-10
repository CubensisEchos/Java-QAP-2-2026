public class MyLine
{
    //variables
    private MyPoint begin;
    private MyPoint end;

    //constructors
    public MyLine()
    {
        this.begin = new MyPoint();
        this.end = new MyPoint();
    }

    public MyLine(int x1, int y1, int x2, int y2)
    {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end)
    {
        this.begin = begin;
        this.end = end;
    }

    //get and set stuff
    public double getLength()
    {
        return begin.distance(end);
    }

    public MyPoint getBegin()
    {
        return this.begin;
    }
    public void setBegin(MyPoint begin)
    {
        this.begin = begin;
    }

    public MyPoint getEnd()
    {
        return this.end;
    }
    public void setEnd(MyPoint end)
    {
        this.end = end;
    }

    public int getBeginX()
    {
        return this.begin.getX();
    }
    public void setBeginX(int x)
    {
        this.begin.setX(x);
    }

    public int getBeginY()
    {
        return this.begin.getY();
    }
    public void setBeginY(int y)
    {
        this.begin.setY(y);
    }

    public int[] getBeginXY()
    {
        int[] a = new int[2];
        a[0] = this.begin.getX();
        a[1] = this.begin.getY();
        return a;
    }
    public void setBeginXY(int x, int y)
    {
        this.begin.setXY(x, y);
    }

    public int getEndX()
    {
        return this.end.getX();
    }
    public void setEndX(int x)
    {
        this.end.setX(x);
    }

    public int getEndY()
    {
        return this.end.getY();
    }
    public void setEndY(int y)
    {
        this.end.setY(y);
    }

    public int[] getEndXY()
    {
        int[] a = new int[2];
        a[0] = this.end.getX();
        a[1] = this.end.getY();
        return a;
    }
    public void setEndXY(int x, int y)
    {
        this.end.setXY(x, y);
    }

    //string rep
    public String toString()
    {
        return ("Begin: " + this.begin + "End" + this.end);
    }
}
