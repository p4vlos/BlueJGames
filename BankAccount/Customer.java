
/**
 * Customer
 * 
 * @author Richard Jones 
 * @version September 2003
 */
public class Customer
{
	private String name;
	private BankAccount account;

	/**
	 * Constructor for objects of class Customer
	 */
	public Customer(String name)
	{
		this.name = name;
	}

	/**
	 * Get customer's name
	 * 
	 * @return     the name
	 */
	public String getName()
	{
		return name;
	}
	
    /**
	 * Get account
	 * 
	 * @return     the account
	 */
	public BankAccount getAccount()
	{
		return account;
	}
	/**
	 * Open a bank account
	 * 
	 * @param sum the initial deposit
	 */
	public void openAccount(int sum) {
	    this.account = new BankAccount(name, sum);
	}
	
	/**
	 * Deposit some money
	 * 
	 * @param sum the sum to deposit
	 */
	public void deposit (int sum) {
	    if (account != null)
	        account.credit(sum);
	}
	
	/**
	 * Withdraw some money
	 * 
	 * @param sum the amount to withdraw
	 * @return true if the withdrawal succeeds
	 */
	public boolean withdraw (int sum) {
	    if (account != null)
	        return account.debit(sum);
	    return false;
	}
	
	/**
	 * Buy an object
	 * 
	 * @param vendor The vendor
	 */
	public void buy (Vendor vendor) {
	    if ((vendor == null) || (account == null))
	        return;
	    if (vendor.buy(account, vendor.getPrice()) == null)
	        System.out.println("Transaction failed - insufficient funds");
	}
}
