/**
 *   THIS CORRESPONDS WITH THE LESSON3LAB PDF
 * 
 * This Ship class contains fields that represent the name of the ship and the year 
 * the ship was built. The class also has accessors and mutators, as well as a
 * toString method. Lastly, the class also implements the Saveable interface.
 * 
 * @author Lauren Buchholz
 */
public class Ship implements Saveable {
	// Declare fields
	private String name, year;
	
	/**
	 * Arg constructor 
	 * @param name
	 * @param year
	 */
	public Ship(String name, String year) {
		this.name = name;
		this.year= year;
	} // Arg constructor

										/**
										 * MUTATORS
										 */
	
	/**
	 * setShipName method
	 * This method assigns the passed in String to the shipName variable
	 * @param shipName
	 */
	public void setShipName(String name) {
		this.name = name;
	} //setName
	
	/**
	 * setYearBuilt method
	 * This method assigns the passed in String to the yearBuilt variable
	 * @param yearBuilt
	 */
	public void setYear(String year) {
		this.year = year;
	} //setYear
	
										/**
										 * ACCESSORS
										 */
	
	/**
	 * getShipName method - returns the name of the ship
	 * @return shipName
	 */
	public String getName() {
		return name;
	} // getName
	
	
	/**
	 * getYearBuilt method - returns the year the ship was built
	 * @return yearBuilt
	 */
	public String getYear() {
		return year;
	} // getYear
	
	/**
	 * getSaveState method - returns the saveState string
	 * @return saveState
	 */
	public String getSaveState() {
		// Declare field 
		String saveState = ("Ship#" + name + "#" + year);
		
		// Return
		return saveState;
	}

										/**
										 * OTHER
										 */
	
	/**
	 * toString method
	 */
	public String toString() {
		// Declare variable to hold the String
		String allData;
		
		// Fill the String
		allData = ("Ship Name: " + name + 
				"\nYear Built: " + year);
		
		// Return the String
		return allData;
	} // toString method
	
} // class
