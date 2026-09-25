package passign01;
/**
* File: PAssign01.java
* Class: CSCI 1302
* Author: Asia Hayden
* Created on: Aug 28, 2026
* Last Modified: Aug 1, 2026
* Description: Desk class and DeskTest class
*/
class PAssign01 {

	public static void main(String[] args) {

		// create desks
		Desk d1 = new Desk(5, 43.50, true, "Birch", "Tennessee");
		Desk d2 = new Desk(8, 29.20, false, "Mahogany", "California");
		Desk d3 = new Desk(4, 40.10, true, "Pine", "Florida");
		Desk d4 = new Desk(0, 27.00, false, "Maple", "New York");
		Desk d5 = new Desk(2, 28.10, false, "Oak", "Washington");

		// assign desk instances into an array variable
		Desk[] desks = { d1, d2, d3, d4, d5 };

		printDesks(desks);

	}

	// printDesks() method that uses Desk array as param. and calls getInfo() method
	public static void printDesks(Desk[] d) {
		for (int i = 0; i < d.length; i++) {
			System.out.printf("Desk %d%nDesk Information%n%s", i + 1, d[i].getInfo());

		}
	}

}

class Desk {

	// all private data members(numDesks is static),
	private int numDrawers;
	private double surfaceHeight;
	private boolean standing;
	private String materialType;
	private String manufactureState;
	private static int numDesks;

	// no-arg constructor
	// numDrawers = 4, surfHeight = 27.0, standing = false, matType = Pine, manuState = North Carolina, include static member
	public Desk() {
		this(4, 27.0, false, "Pine", "North Carolina");
	}

	// required convenience constructor
	// should have numDesks in parameter
	public Desk(int numDesks) {
		this();
	}

	// additional convenience constructor
	public Desk(int numDrawers, double surfaceHeight, boolean standing, String materialType, String manufactureState) {
		setNumDrawers(numDrawers);
		setSurfaceHeight(surfaceHeight);
		setIsStanding(standing);
		setMaterialType(materialType);
		setManufactureState(manufactureState);
		Desk.numDesks++;
	}

	// accessors
	public int getNumDrawers() {
		return numDrawers;
	}

	public double getSurfaceHeight() {
		return surfaceHeight;
	}

	public boolean getIsStanding() {
		return standing;
	}

	public String getMaterialType() {
		return materialType;
	}

	public String getManufactureState() {
		return manufactureState;
	}

	public static int getNumDesks() {
		return Desk.numDesks;
	}

	// mutators

    // setnumDrawers() range = 0-8, set to 4 if out of range
	public void setNumDrawers(int numDrawers) {
		this.numDrawers = (numDrawers >= 0 && numDrawers <= 8) ? numDrawers : 4;
	}

	// setSurfaceHeight range = 24.0-45.0, set to 27.0 if out of range
	public void setSurfaceHeight(double surfaceHeight) {
		this.surfaceHeight = (surfaceHeight >= 24.0 && surfaceHeight <= 45.0) ? surfaceHeight : 27.0;
	}

	// setMaterialType() must be atleast 3 chars long, otherwise set to "Oak"
	public void setMaterialType(String materialType) {
		this.materialType = (materialType.length() >= 3) ? materialType : "Oak";
	}

	// setIsStanding()
	public void setIsStanding(boolean standing) {
		this.standing = standing;
	}

	// setManufactureType() must be atleast 4 chars long, otherwise set to "Iowa"
	public void setManufactureState(String manufactureState) {
		this.manufactureState = (manufactureState.length() >= 4) ? manufactureState : "Iowa";
	}

	// getInfo method, String.format()
	public String getInfo() {
		return String.format(
				"Number Drawers:\t%d%nSurface Height:\t%.2f inches%nStanding:\t%b%nMaterial:\t%s%nManufactured:\t%s%n%n",
				getNumDrawers(), getSurfaceHeight(), getIsStanding(), getMaterialType(), getManufactureState());
	}

}