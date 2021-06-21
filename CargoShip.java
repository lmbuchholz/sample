/**
 * CargoShip extends Ship, and either directly or indirectly has fields that represent 
 * cargo tonnage, the name of the ship and the year the ship was built. 
 * The class also has accessors and mutators, as well as a toString method. 
 * Finally, the class also implements the Saveable interface. 
 * 
 * @author Lauren Buchholz
 */
public class CargoShip extends Ship implements Saveable{
	// Declare fields 
	private int cargoTonnage; // in tonnage
	

	/**
	 * Arg constructor 1
	 * @param name
	 * @param year
	 * @param cargoTonnage
	 */
	public CargoShip(String name, String year, int cargoTonnage) {
		// Call the superclass's constructor with the shipName & yearBuilt values
		super(name, year);
		
		// Set the tonnage 
		this.cargoTonnage = cargoTonnage;
	} // arg constructor 1
	
	
											/**
											 * MUTATORS
											 */
											
	/**
	 * setCapacity - sets the maximum tonnage capacity of the ship
	 * @param capacity 
	 */
	public void setCargoTonnage(int cargoTonnage) {
		this.cargoTonnage = cargoTonnage;
	}// setCargoTonnage
	
	
											/**
											 * ACCESSORS
											 */
	

	/**
	 * getCapacity - returns the tonnage capacity of the ship
	 * @return capacity 
	 */
	public int getCargoTonnage() {
		return cargoTonnage;
	}// getCargoTonnage
	
	/**
	 * getSaveState
	 * @return saveState
	 */
	public String getSaveState() {
		// Declare field 
		String saveState = ("CargoShip#" + getName() + "#" + getYear() 
		+ "#" + cargoTonnage);
		
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
		allData = ("Cargo Ship Name: " + getName() + 
				"\nCargo Tonnage: " + cargoTonnage);
		
		// Return the String
		return allData;
		
	}// toString
	

}
