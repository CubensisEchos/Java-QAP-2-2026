public class TestMyRectangle
{
    public static void main(String[] args)
    {
        MyRectangle rect1 = new MyRectangle(0, 0, 4, 3);
        System.out.println(rect1);
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());
    }
}
