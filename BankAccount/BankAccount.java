
/**
 * BankAccount.
 * 
 * @author Richard Jones
 * @version September 2003
 */
public class BankAccount
{
    private int balance;
    private String name;
    private int limit;

    /**
     * Constructors for objects of class BankAccount
     */
    public BankAccount(String name)
    {
        this(name, 0);
    }
    
    public BankAccount(String name, int sum)
    {
        this.name = name;
        if (sum >= 0)
            balance = sum;
    }
    
    // ACCESSORS
    
    /**
     * Get the name
     * 
     * @return the name
     */
    public String getName()
    {
        return name;
    }   
    
    /**
     * Get the balance
     * 
     * @return the balance
     */
    public int getBalance()
    {
        return balance;
    }
    
    // MUTATORS
    
    /**
     * Credit the account
     * 
     * @param  sum   the sum to credit
     */
    public void credit(int sum)
    {
        if (sum > 0)
            balance += sum;
    }

    /**
     * Debit the account
     * 
     * @param  sum   the sum to debit
     * @return true if the debt succeeds
     */
    public boolean debit(int sum)
    {
        if ((sum > 0) && (balance >= sum)) {
            balance -= sum;
            return true;
        }
        //setLimit(sum);
        return false;
    }

    public void setLimit(int limit) {
        limit = 1000;
        if (balance > limit)
           balance = limit;
    }
    
    public int getLimit() {
        return limit;
    }
    
}
