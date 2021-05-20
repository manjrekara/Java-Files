/**
 * @author (Atharva Manjrekar) 
 * @version (1.0)
 */
public class AccountBalanceComparable implements Comparable<AccountBalanceComparable>
{
    private double balance;
    private String name;
    private long account;
    public AccountBalanceComparable(double bal, String n, long num)
    {
        balance = bal;
        name = n;
        account = num;
    }

    public double getBalance(){return balance;}

    public String getName(){return name;}

    public long getAccount(){return account;}

    public boolean equals (AccountBalanceComparable other)
    {   
        return this.getBalance() == other.getBalance();
    }

    public int compareTo(AccountBalanceComparable other)
    {           
        if (getBalance() > other.getBalance())
        {
            return 1;
        }
        else if (getBalance() < other.getBalance())
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