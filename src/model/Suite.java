package model;
import java.util.Date;

import controller.FlexiRentSystem;

public class Suite extends RentalProperty {

	private String propType;
	private String propID;
	private DateTime lastMaintained;
	private PropertyArray array;

	//Suite Constructor
	public Suite(String propID, String streetNum, String streetName, String suburb,
			PropStatus propStatus, String image, String description) {

		super(streetNum, streetName, suburb, propStatus, image, description);
		setRate(554);	//fixed variables for suites
		setRooms(3); 
		setMinimumRent(1);

		this.lastMaintained = lastMaintained;
		propType = "S_";
		this.propID = propType + streetNum + suburb;
	}
	public Suite() {
		
	}

	public static void addProperty(String propID, String streetNum, String streetName, String suburb,
			PropStatus propStatus, String image, String description) {
		PropertyArray array = new PropertyArray();

		Suite s = new Suite(propID, streetNum, streetName, suburb, propStatus, image, description); 
		//array.addtoList(s);
		//System.out.println("Property " + s.getPropID() + " added to arraylist whoop whoop");
		//FlexiRentSystem.addtoRecord(s);  // adds suite to array once created
		
	}

public void rent(String customerID, DateTime rentDate, DateTime numOfRentDays) {
		
		if (getPropStatus() == PropStatus.Available) {
			setPropStatus(PropStatus.Rented);
			RentalRecord r = new RentalRecord(getPropID(), RentalRecord.getCustomerID(), RentalRecord.getEstimatedReturnDate(), RentalRecord.getRentDate(), RentalRecord.getRentalFee(), RentalRecord.getActualReturnDate());
			
			int openSlot;
			
			for(int i = 0; i < record.length; i++){
				if(record[i] == null)
					
					openSlot = i;
				
				 record[i] =  r;
				 record[i].setLateFee(662);
				 break;  
				 }
				
			System.out.println("Property: " + getPropID() + " is now rented\n");
			} else {
			System.out.println("Property " + getPropID() + " cannot be rented right now.");
		}

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



