/**
 * This tests various states of a SecureBankAccount object 
 * 
 * @author Lauren Buchholz 
 * 13 March 2021
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SecureBankAccountTest {
	// Declare fields 
	SecureBankAccount account;
	
	/**
	 * Need to create a new SecureBankAccount object before each test,
	 * and since the class doesn't have a no-arg constructor, I arbitrarily 
	 * chose $1500 as the amount to instantiate the object.
	 */
	@BeforeEach 
	void createAccount(){
		account = new SecureBankAccount(1500.00);
	}
	
	
	/**
	 * Make sure that the reset method is returning the proper values. (The other 
	 * tests below will ensure that the values within the reset method are being 
	 * reset as expected)
	 */
	@Test
	void testResetMethod() {
		// Try and reset an unfrozen account
		assertEquals(account.reset(), false);
		
		// Freeze that account
		account.getBalance();
		account.getBalance();
		
		// Try and reset the now-frozen account
		assertEquals(account.reset(), true);
	} // testResetMethod
	
	
	/**
	 * Make sure that the getBalance method is functioning properly 
	 */
	@Test
	void testGetBalance() {
		// Check the balance for the first time. Should return initializing value
		assertEquals(account.getBalance(), 1500.00);
		
		// Check the balance a second time. Should still return initializing value
		assertEquals(account.getBalance(), 1500.00);
		
		// Check the balance a third time. This should return -1, since the previous
		// check above should have locked the account (-1 returns when account 
		// is locked).
		assertEquals(account.getBalance(), -1);
		
		// Reset the account
		account.reset();
		
		// Now ensure that you can get the balance after resetting (Woo caught logic error!)
		assertEquals(account.getBalance(), 1500.00);
		
	} // testGetBalance
	
	
	/**
	 * Make sure that the withdraw method is functioning properly
	 */
	@Test 
	void testWithdraw() {
		// Try withdrawing a negative number. Nothing should be withdrawn.
		assertEquals(account.withdraw(-500), 0);
		
		// Try withdrawing less than $500
		assertEquals(account.withdraw(100), 100);
		
		// Bring withdrawal total up to $500. This should successfully withdraw, 
		// then lock the account 
		assertEquals(account.withdraw(400), 400);
		
		// Try to withdraw $1. This should fail, as the account should be frozen
		assertEquals(account.withdraw(1), -1);
		
		// Reset the object
		account.reset();
		
		// Withdraw $501. Should be successful (since we're not constraining the 
		// amount withdrawn to $500), but then immediately locks the account
		assertEquals(account.withdraw(501), 501);
		
		// Try to withdraw $1. The last withdrawal should have frozen the account, 
		// so this should be unsuccessful 
		assertEquals(account.withdraw(1), -1);
	} // testWithdraw
	
	
	/**
	 * Make sure that the deposit method is functioning properly
	 */
	@Test
	void testDeposit() {
		// Try depositing a negative number. Should deposit 0.
		assertEquals(account.deposit(-500), 0);
		
		// Now deposit a positive number. Should go through.
		assertEquals(account.deposit(500),500);
		
		// Confirm that the balance is now $2000
		assertEquals(account.getBalance(), 2000);
		
		// Get the balance again to lock the account
		account.getBalance();
		
		// Try and deposit funds. Since the account is now locked, this should
		// be unsuccessful 
		assertEquals(account.deposit(1), -1);
		
		// Reset account 
		account.reset();
		
		// Try and deposit funds again. Should work now that account's reset
		account.deposit(1000);
		
		// Check that the deposit was successful 
		assertEquals(account.getBalance(),3000);
		
	} // testDeposit method

} // class





