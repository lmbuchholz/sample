/**
 *  THIS CORRESPONDS WITH THE LESSON3LAB PDF
 *
 * NavalShip extends Ship, and either directly or indirectly has fields that represent 
 * the size of its complement, the name of the ship, and the year the ship was built. 
 * The class also has accessors and mutators, as well as a toString method. 
 * The class also implements the Saveable interface. 
 *
 *@author Lauren Buchholz
 */
public class NavalShip extends Ship implements Saveable{
	// Declare fields 
	private int complement;
	
	/**
	 * Arg constructor 1
	 * @param name
	 * @param year
	 * @param complement
	 */
	public NavalShip(String name, String year, int complement) {
		// Call the superclass's constructor with the shipName & yearBuilt values
		super(name, year);
		
		// Set complement field 
		this.complement = complement;
	} // arg constructor
	
	
											/**
											 * MUTATORS
											 */
											
	/**
	 * setComplement - sets the complement field to passed parameter
	 * @param complement
	 */
	public void setComplement(int complement) {
		this.complement = complement;
	}// setComplement
	
	
											/**
											 * ACCESSORS
											 */
	

	/**
	 * getComplement - returns the complement 
	 * @return complement 
	 */
	public int setComplement() {
		return complement;
	}// getComplement
	
	/**
	 * getSaveState
	 * @return saveState
	 */
	public String getSaveState() {
		// Declare field 
		String saveState = ("NavalShip#" + getName() + "#" + getYear() 
		+ "#" + complement);
		
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
		allData = ("Naval Ship Name: " + getName() + 
				"\nComplement: " + complement);
		
		// Return the String
		return allData;
		
	}// toString
}
