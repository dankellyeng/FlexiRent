package model;

import controller.FlexiRentSystem;

public class Apartment extends RentalProperty {

	private String propType;
	private String propID;

	//Appartment constructor
	public Apartment(String propID, String streetNum, String streetName, String suburb,
			PropStatus propStatus, int rooms, int minimumRent, double rate, double lateFee, String image, String description) {

		super(streetNum, streetName, suburb, propStatus, image, description);

		propType = "A_";
		setPropTypeLong("Apartment");
		this.propID = propType + streetNum + suburb;

	}
	
	public Apartment() {
		
	}

	public static void addProperty(String propID, String streetNum, String streetName, String suburb,
			PropStatus propStatus, int rooms, int minimumRent, 
			double rate, double lateFee, String image, String description) {

		PropertyArray array = new PropertyArray();
		
		Apartment a = new Apartment(propID, streetNum, streetName, suburb, propStatus, rooms, 0, rate, lateFee, image, description); 
		//array.addtoList();
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






