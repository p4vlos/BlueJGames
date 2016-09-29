
/**
 * A Vendor supplies goods provided that a bank account agrees to pay
 * 
 * @author Richard Jones 
 * @version September 2003
 */
public class Vendor
{
        public static final int PRICE = 10;    // A constant
        private String name;
        private BankAccount income; 
    
        /**
         * Create a new vendor
         *
         * @param name the name of the vendor
         */
        public Vendor (String name) {
                this.name = name;
                income = new BankAccount(name);
        }
        
        /**
         * Get the name of the vendor
         *
         * @return the name
         */
        public String getName() {
                return name;
        }
    
	/**
	 * Buy an item
	 * 
	 * @param  account the account to debit
	 * @param  sum the cost of the item
	 * @return null if transaction fails 
	 */
	public Object buy (BankAccount account, int price)
	{
		if (account != null) {
		    if (account.debit(price)) {
		        income.credit(price);
		        return new Object();
		    }
		}
		return null;
	}
	
	/**
	 * Get the price of an object
	 * 
	 * @return the price
	 */
	public int getPrice() {
	    return PRICE;
	}
}
