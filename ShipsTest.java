/**
 *  THIS CORRESPONDS WITH THE LESSON3LAB PDF
 *
 * This program creates an array of Ship objects, then displays the contents of those objects
 *
 *@author Lauren BUchholz
 */
public class ShipsTest {
	/**
	 * The main method executes the functions described above.
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare fields 
		Ship[] shipArray = new Ship[4];
		
		// Create a Ship object 
		Ship ship = new Ship("Enterprise", "2245");
		
		// Create a CruiseShip object 
		CruiseShip cruiseShip = new CruiseShip("Voyager", "2002", 100);
		
		//Create a CargoShip object
		CargoShip cargoShip = new CargoShip("Discovery", "2019", 500);
		
		// Create a new NavalShip object
		NavalShip navalShip = new NavalShip("USS Ship", "1992", 567);
		
		// Put those ships into the array
		shipArray[0] = ship;
		shipArray[1] = cruiseShip;
		shipArray[2] = cargoShip;
		shipArray[3] = navalShip;
		
		// Loop through the arrays and call their getString methods
		for(int index = 0; index < shipArray.length; index++) {
			System.out.println(shipArray[index].toString());
			System.out.println(shipArray[index].getSaveState());
			System.out.println();

		} // for
		
		
	} // main
} // class 
