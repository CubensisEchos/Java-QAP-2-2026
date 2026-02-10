public class Person
{
    //variables
    private String lastName;
    private String firstName;
    private Address home;

    //constructor
    public Person(String lastName, String firstName, Address home)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = new Address(home);
    }

    //copy constructor
    public Person(Person other)
    {
        this.lastName = other.lastName;
        this.firstName = other.firstName;
        this.home = new Address(other.home);
    }

    //set info
    public void set(String lastName, String firstName, Address home)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = new Address(home);
    }

    //string rep
    public String toString()
    {
        return this.firstName + " " + this.lastName + ", " + this.home;
    }
}
