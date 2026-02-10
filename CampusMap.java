import java.util.ArrayList;

public class CampusMap
{
    //variables
    private ArrayList<MyRectangle> buildings;
    private ArrayList<MyLine> walkways;
    private ArrayList<MyCircle> fountains;

    //constructor
    public CampusMap()
    {
        buildings = new ArrayList<>();
        walkways = new ArrayList<>();
        fountains = new ArrayList<>();
    }

    //add a building
    public void addBuilding(MyRectangle building)
    {
        buildings.add(building);
    }

    //add walkway from one building to another
    public void addWalkway(MyRectangle from, MyRectangle to)
    {
        if (!buildings.contains(from) || !buildings .contains(to))
        {
            System.out.println("Error: At least one of the buildings do not exist.");
            return;
        }

        MyPoint fromCenter = getCenter(from);
        MyPoint toCenter = getCenter(to);
        MyLine walkway = new MyLine(fromCenter, toCenter);
        walkways.add(walkway);
    }

    //add a fountain
    public void addFountain(MyCircle fountain)
    {
        fountains.add(fountain);
    }

    //calculation for total length of walkways
    public double calculateTotalWalkwayLength()
    {
        double total = 0;
        for (MyLine walkway : walkways)
        {
            total += walkway.getLength();
        }
        return total;
    }

    //calculation for total area of all fountains
    public double calculateTotalFountainArea()
    {
        double total = 0;
        for (MyCircle fountain : fountains)
        {
            total += fountain.getArea();
        }
        return total;
    }

    //check for walkway between buildings
    public boolean isWalkwayThere(MyRectangle fromBuilding, MyRectangle toBuilding)
    {
        if (!buildings.contains(fromBuilding) || !buildings.contains(toBuilding))
            return false;

        MyPoint fromCenter = getCenter(fromBuilding);
        MyPoint toCenter = getCenter(toBuilding);

        for (MyLine walkway : walkways)
        {
            if ((walkway.getBegin().getX() == fromCenter.getX() &&
                walkway.getBegin().getY() == fromCenter.getY() &&
                walkway.getEnd().getX() == toCenter.getX() &&
                walkway.getEnd().getY() == toCenter.getY()) ||
                (walkway.getBegin().getX() == toCenter.getX() &&
                walkway.getBegin().getY() == toCenter.getY() &&
                walkway.getEnd().getX() == fromCenter.getX() &&
                walkway.getEnd().getY() == fromCenter.getY()))
            {
                return true;
            }
        }
        return false;
    }

    // get center point of building
    private MyPoint getCenter(MyRectangle building)
    {
        int centerX = (int)(building.getTopLeft().getX() + building.getWidth() / 2);
        int centerY = (int)(building.getTopLeft().getY() + building.getHeight() / 2);
        return new MyPoint(centerX, centerY);
    }
}