package model;

import controller.FlexiRentSystem;

public class Apartment extends RentalProperty {

	private String propType;
	private String propID;

	//Appartment constructor
	public Apartment(String propID, String streetNum, String streetName, String suburb,
			PropStatus propStatus, int rooms, int minimumRent, double rate, double lateFee) {

		super(streetNum, streetName, suburb, propStatus);

		propType = "A_";
		this.propID = propType + streetNum + suburb;

	}

	public static void addProperty(String propID, String streetNum, String streetName, String suburb,
			PropStatus propStatus, int rooms, int minimumRent, 
			double rate, double lateFee) {

		PropertyArray array = new PropertyArray();
		
		Apartment a = new Apartment(propID, streetNum, streetName, suburb, propStatus, rooms, 0, rate, lateFee); 
		array.addtoList(a);
		System.out.println("Property " + a.getPropID() + " added to arraylist");
		
		//FlexiRentSystem.addtoRecord(a);	//adds appartment to array

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






