public class CreditCard
{
    //variables and objects
    private Money balance;
    private Person owner;
    private Money creditLimit;

    //copy constructor
    public CreditCard(Person owner, Money creditLimit)
    {
        this.owner = new Person(owner);
        this.creditLimit = new Money(creditLimit);
        this.balance = new Money(0);
    }

    //get copies
    public Money getBalance()
    {
        return new Money(balance);
    }

    public Money getCreditLimit()
    {
        return new Money(creditLimit);
    }

    public String getPersonals()
    {
        return owner.toString();
    }

    //charge and payment methods
    public void charge(Money amount)
    {
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) <= 0)
        {
            balance = newBalance;
            System.out.println("Approved!");
            System.out.println("Charge: " + amount);
        }
        else
        {
            System.out.println("Exceeds credit limit");
        }
    }

    public void payment(Money amount)
    {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
