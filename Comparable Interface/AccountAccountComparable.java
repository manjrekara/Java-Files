/**
 * @author (Atharva Manjrekar) 
 * @version (1.0)
 */
public class AccountAccountComparable implements Comparable<AccountAccountComparable>
{
    private double balance;
    private String name;
    private long account;
    public AccountAccountComparable(double bal, String n, long num)
    {
        balance = bal;
        name = n;
        account = num;
    }

    public double getBalance(){return balance;}

    public String getName(){return name;}

    public long getAccount(){return account;}

    public boolean equals (AccountAccountComparable other)
    {   
        return this.getAccount() == other.getAccount();
    }

    public int compareTo(AccountAccountComparable other)
    {           
        if (getAccount() > other.getAccount())
        {
            return 1;
        }
        else if (getAccount() < other.getAccount())
        {
            return -1;
        }
        else 
        {
            return 0;
        }
    }

    public String toString()
    {
        return "Account#: " +account+ ", Owner: " +name+ ", Balance: " +balance+"; ";
    }
}