package model;

import java.util.ArrayList;

import controller.FlexiRentSystem;

public class Apartment extends RentalProperty {

	private String propType;
	private String propID;

	//Apartment constructor
	public Apartment(String propID, String streetNum, String streetName, String suburb,
			PropStatus propStatus, int rooms, int minimumRent, int rate, int lateFee, String image, String description, ArrayList <RentalRecord> recordList) {

		super(streetNum, streetName, suburb, propStatus, image, description, recordList);

		propType = "A_";
		setPropTypeLong("Apartment");
		this.propID = propType + streetNum + suburb;

	}
	
	public Apartment() {
		
	}
	public static void addProperty(String propID, String streetNum, String streetName, String suburb,
			PropStatus propStatus, int rooms, int minimumRent, int rate, int lateFee, String image, String description, ArrayList <RentalRecord> recordList) {

		Apartment a = new Apartment(propID, streetNum, streetName, suburb, propStatus, rooms, minimumRent, rate, lateFee, image, description, recordList); 
		PropertyArray.propArrayList.add(a);
	
	}

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






