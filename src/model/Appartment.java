package model;

public class Appartment extends RentalProperty {

	private String propType;
	private String propID;

	//Appartment constructor
	public Appartment(String propID, String streetNum, String streetName, String suburb,
			PropStatus propStatus, int rooms, int minimumRent, double rate, double lateFee) {

		super(streetNum, streetName, suburb, propStatus);

		propType = "A_";
		this.propID = propType + streetNum + suburb;

	}

	public static void addProperty(String propID, String streetNum, String streetName, String suburb,
			PropStatus propStatus, int rooms, int minimumRent, 
			double rate, double lateFee) {

		Appartment a = new Appartment(propID, streetNum, streetName, suburb, propStatus, rooms, 0, rate, lateFee); 
		FlexiRentSystem.addtoRecord(a);	//adds appartment to array

	}

//	public boolean rent(String customerId, DateTime rentDate, int numOfRentDay) {
//
//		return false;
//	}
//
//	public boolean returnProperty(DateTime returnDate) {
//
//		return false;
//
//	}
//
//	public boolean completeMaintenance(DateTime completionDate) {
//
//		return true;
//	}


	public String toString() {

		return null;
	}

	public String getPropType() {

		return propType;
	}

	public String getPropID() {
		return propID;
	}

	public void setPropID(String propID) {
		this.propID = propID;
	}

}






