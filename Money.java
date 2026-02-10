public class Money
{
    private long dollars;
    private long cents;

    //constructors
    public Money(double money)
    {
        long totalCents = Math.round(money * 100);
        this.dollars = totalCents / 100;
        this.cents = Math.abs(totalCents % 100);
    }

    private Money(long dollars, long cents)
    {
        long totalCents = dollars * 100 + cents;
        this.dollars = totalCents / 100;
        this.cents = Math.abs(totalCents % 100);
    }

    //copy constructor
    public Money(Money other)
    {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    //get stuff
    public long getDollars()
    {
        return dollars;
    }
    public long getCents()
    {
        return cents;
    }

    //switch dollars to cents for math
    private long toCents()
    {
        return dollars * 100 + cents;
    }

    //add/remove money
    public Money add(Money other)
    {
        long totalCents = this.toCents() + other.toCents();
        return new Money(totalCents / 100, totalCents % 100);
    }

    public Money subtract(Money other)
    {
        long totalCents = this.toCents() - other.toCents();
        return new Money(totalCents / 100, totalCents % 100);
    }

    public int compareTo(Money other)
    {
        return Long.compare(this.toCents(), other.toCents());//makes compare work
    }

    //string rep
    public String toString()
    {
        return String.format("$%d.%02d", dollars, cents);
    }
}