/**
 * This class mimicks a bank account, allowing users to deposit and withdraw funds.
 * If the withdrawal amount equals or passes $500, or if the balance is checked twice,
 * the account is locked. Finally, the user also has the option to reset all fields
 * within the class. 
 * 
 * @author Lauren Buchholz
 * 
 * 13 March 2021
 *
 */
public class SecureBankAccount {
	// Declare fields 
	private double balance, amountWithdrawn;
	private boolean locked;
	private int numBalanceRequests;
	

								/**
								 * CONSTRUCTOR
								 */
								
	
	/**
	 * This constructor sets the balance to the value passed. It also assigns values to
	 * the other class fields (amountWithdrawn, locked, and numBalanceRequests). 
	 * @param startingBalance
	 */
	public SecureBankAccount(double startingBalance) {
		// Set the balance to the value passed if that value is above 0; 
		// set to 0 otherwise
		if(startingBalance < 0) { 
			this.balance = 0; 
		} else {
			this.balance = startingBalance; 
		} // if-else
		
		// Set the fields to 0 or false
		locked = false;
		numBalanceRequests = 0;
		amountWithdrawn = 0;	
	} // constructor
	
								/**
								 * ACCESSORS
								 */
								
	
	/**
	 * This allows the user to get the balance of the account if it is unlocked. 
	 * Otherwise, it returns -1. (Each time the method is called, it increments 
	 * the numBalanceRequests variable; when it reaches 2 the account is locked.)
	 * @return holder
	 */
	public double getBalance() {
		// Declare variable
		double holder; // Admittedly awkward name. Returns balance if 
					   // the account is NOT locked, but -1 if it is locked
		
		// Determine whether the account is locked
		if(locked == true) {
			holder = -1;
			
		} else {
			// Set holder to the balance
			holder = this.balance;
			// Increment number of requests
			numBalanceRequests++;
			
			// Lock the account if the number of requests is two
			if(numBalanceRequests == 2) {
				locked = true;
			} // nested if
		} // else
		
		// Return balance or -1
		return holder;
		
	} // getBalance method
	
	
								/**
								 * MUTATORS
								 */
	
	/**
	 * The deposit method deposits the passed value after confirming that the
	 * account is not locked. It deposits 0 if the value passed is negative. 
	 * @param amount
	 * @return - the amount deposited (or placeholder)
	 */
	public double deposit(double amount) {
		// Declare field 
		double deposited;
		
		if(locked == false) {
			if(amount < 0) { 
				balance += 0; 
				deposited = 0;
			} else {
				balance += amount;
				deposited = amount;
			} // if-else
			
		} else {
			deposited = -1;
		} // if-else 
		
		// Return deposited
		return deposited;
	} // deposit method
	
	
	/**
	 * This method allows the user to withdraw funds if the account is not locked
	 * and if the account balance is greater than the requested amount. The fields
	 * balance and amountWithdrawn are then adjusted accordingly.
	 * If the user withdraws more than $500, the account is locked. 
	 * 
	 * If the user does not have sufficient funds to withdraw, amountWithdrawn is 
	 * set to -1.
	 * @param amount - the amount of money to withdraw 
	 * @return holder - the amount withdrawn or -1
	 */
	public double withdraw(double amount) {
		// Declare field 
		double holder;
		
		// Try to withdraw funds
		if(locked == false && balance >= amount) {
			if(amount < 0) { 
				balance -= 0; 
				amountWithdrawn += 0;
				holder = 0;
			} else {
				balance -= amount;
				amountWithdrawn += amount;
				holder = amount;
			} // if-else
			
			// Check whether the amount withdrawn is over 500. If yes, lock account
			if(amountWithdrawn >= 500) {
				locked = true;
			} // if 
			
		} else {
			holder = -1;
		} // else 
		
		// Return amountWithdrawn or -1
		return holder;
	} // withdraw method
	
								
								/**
								 * OTHER
								 */
	/**
	 * This method resets fields to their original value if the account is 
	 * currently locked. It does nothing if the account is currently unlocked. 
	 * @return reset - whether the fields were reset or not
	 */
	
	public boolean reset() {
		// Declare fields
		boolean reset;
		
		if(locked == true) {
			locked = false;
			numBalanceRequests = 0;
			amountWithdrawn = 0;
			reset = true;
		} else {
			reset = false;
		} // if-else 
		
		// Return reset
		return reset;
	} // reset method
	
} // class
