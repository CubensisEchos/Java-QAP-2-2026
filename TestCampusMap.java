public class TestCampusMap
{
    public static void main(String[] args)
    {
        //create the map, the buildings, and fountain
        CampusMap campus = new CampusMap();

        //buildings
        MyRectangle scienceHall = new MyRectangle(400, 400, 600, 600);
        MyRectangle library = new MyRectangle(200, 400, 350, 550);
        MyRectangle lecture1 = new MyRectangle(610, 400, 650, 440);
        MyRectangle lecture2 = new MyRectangle(660, 400, 700, 440);
        MyRectangle lecture3 = new MyRectangle(710, 400, 750, 440);
        MyRectangle lecture4 = new MyRectangle(760, 400, 800, 440);
        MyRectangle lecture5 = new MyRectangle(810, 400, 850, 440);

        //fountain
        MyCircle fountain = new MyCircle(500, 650, 50);

        //add the buildings and the fountain
        campus.addBuilding(scienceHall);
        campus.addBuilding(lecture1);
        campus.addBuilding(lecture2);
        campus.addBuilding(lecture3);
        campus.addBuilding(lecture4);
        campus.addBuilding(lecture5);
        campus.addBuilding(library);

        campus.addFountain(fountain);

        //add walkways between buildings
        campus.addWalkway(scienceHall, lecture1);
        campus.addWalkway(scienceHall, lecture2);
        campus.addWalkway(scienceHall, lecture3);
        campus.addWalkway(scienceHall, lecture4);
        campus.addWalkway(scienceHall, lecture5);
        campus.addWalkway(scienceHall, library);

        //add walkways to fountain
        campus.addWalkway(scienceHall, new MyRectangle(
            fountain.getCenter().getX() - (int)fountain.getRadius(),
            fountain.getCenter().getY() - (int)fountain.getRadius(),
            fountain.getCenter().getX() + (int)fountain.getRadius(),
            fountain.getCenter().getY() + (int)fountain.getRadius()
        ));

        //Print total length and area
        System.out.println();
        System.out.println("Total walkway length: " + campus.calculateTotalWalkwayLength());
        System.out.println("Total fountain area: " + campus.calculateTotalFountainArea());
        System.out.println();

        //check walkway length
        System.out.println("Is there a walkway from the Science Hall to Lecture 1? " + campus.isWalkwayThere(scienceHall, lecture1));
        System.out.println("Is there a walkway from the Science Hall to Lecture 2? " + campus.isWalkwayThere(scienceHall, lecture2));
        System.out.println("Is there a walkway from the Science Hall to Lecture 3? " + campus.isWalkwayThere(scienceHall, lecture3));
        System.out.println("Is there a walkway from the Science Hall to Lecture 4? " + campus.isWalkwayThere(scienceHall, lecture4));
        System.out.println("Is there a walkway from the Science Hall to Lecture 5? " + campus.isWalkwayThere(scienceHall, lecture5));
        System.out.println("Is there a walkway from the Science Hall to the library? " + campus.isWalkwayThere(scienceHall, library));
    }
}
