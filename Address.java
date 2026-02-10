public class Address
{
    //variables
    private String street;
    private String city;
    private String state;
    private String zip;

    //constructors
    public Address(String street, String city, String state, String zip)
    {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    //copy constructor
    public Address(Address other)
    {
        this.street = other.street;
        this.city = other.city;
        this.state = other.state;
        this.zip = other.zip;
    }

    //string rep
    public String toString()
    {
        return street + ", " + city + ", " + state + " " + zip;
    }
}
