public class TestMyLine
{
    public static void main(String[] args)
    {
        MyLine line = new MyLine(0, 0, 3, 4);
        int[] beginXY = line.getBeginXY();
        int[] endXY = line.getEndXY();

        System.out.println("Line length: " + line.getLength());
        System.out.println("Start point: (" + beginXY[0] + ", " + beginXY[1] + ")");
        System.out.println("End point: (" + endXY[0] + ", " + endXY[1] + ")");
    }
}
