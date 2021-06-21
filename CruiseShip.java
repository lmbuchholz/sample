/**
 *  THIS CORRESPONDS WITH THE LESSON3LAB PDF
 *
 * CruiseShip extends Ship, and either directly or indirectly has fields that represent 
 * maximum number of passengers, the name of the ship, and the year the ship was built. 
 * The class also has accessors and mutators, as well as a toString method. 
 * The class also implements the Saveable interface. 
 *
 *@author Lauren Buchholz
 */
public class CruiseShip extends Ship implements Saveable {
	// Declare fields 
	private int maxPassengers;
	
	/**
	 * Arg constructor 1
	 * @param name
	 * @param year
	 * @param maxPassengers
	 */
	public CruiseShip(String name, String year, int maxPassengers) {
		// Call the superclass's constructor with the shipName & yearBuilt values
		super(name, year);
		
		// Set the number of max passengers 
		this.maxPassengers = maxPassengers;
	} // arg constructor
		
	
											/**
											 * MUTATORS
											 */
											
	/**
	 * setMaxPassengers - sets the maximum number of passengers allowed on the cruise
	 * @param maxPassengers 
	 */
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}// setMaxPassengers
	
	
											/**
											 * ACCESSORS
											 */
	

	/**
	 * getMaxNumPassengers - returns the max number of passengers
	 * @return maxNumPassengers 
	 */
	public int getMaxPassengers() {
		return maxPassengers;
	}// setMaxPassengers
	

	/**
	 * getSaveState
	 * @return saveState
	 */
	public String getSaveState() {
		// Declare field 
		String saveState = ("NavalShip#" + getName() + "#" + getYear() 
		+ "#" + maxPassengers);
		
		// Return
		return saveState;
	}
	
											/**
											 * OTHER
											 */
	
	/**
	 * @override 
	 * toString method
	 */
	public String toString() {
		// Create String variable
		String allData;
		
		// Fill the variable
		allData = ("Cruise Ship Name: " + getName() + 
				"\nMaximum Passenger Capacity: " + maxPassengers);
		
		// Return the String
		return allData;
		
	}// toString
	
	
} // class
