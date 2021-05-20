/**
 * @author (Atharva Manjrekar) 
 * @version (1.0)
 */
public class AccountNameComparable implements Comparable<AccountNameComparable>
{
    private double balance;
    private String name;
    private long account;

    public AccountNameComparable(double bal, String n, long num)
    {
        balance = bal;
        name = n;
        account = num;
    }

    public double getBalance(){return balance;}

    public String getName(){return name;}

    public long getAccount(){return account;}

    public boolean equals (AccountNameComparable other)
    {   
        return this.getName() == other.getName();
    }

    public int compareTo(AccountNameComparable other)
    {           
        if (getName().compareTo(other.getName())>0)
        {
            return 1;
        }
        else if (getName().compareTo(other.getName())<0)
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