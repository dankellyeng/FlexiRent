package model;
import java.util.ArrayList;
import java.util.Date;

import controller.FlexiRentSystem;

public class Suite extends RentalProperty {

	private String propType;
	
	private String propID;
	private DateTime lastMaintained;
	
	//Suite Constructor
	public Suite(String propID, String streetNum, String streetName, String suburb,
			PropStatus propStatus, String image, String description, ArrayList <RentalRecord> recordList) {

		super(streetNum, streetName, suburb, propStatus, image, description, recordList);
		setRate(554);	//fixed variables for suites
		setRooms(3); 
		setMinimumRent(1);

		this.lastMaintained = lastMaintained;
		propType = "S_";
		setPropTypeLong("Premium Suite");
		this.propID = propType + streetNum + suburb;
	}
	public Suite() {
		
	}

	public void addProperty(String propID, String streetNum, String streetName, String suburb,
			PropStatus propStatus, String image, String description, ArrayList <RentalRecord> recordList) {

		Suite s = new Suite(propID, streetNum, streetName, suburb, propStatus, image, description, recordList); 
		PropertyArray.propArrayList.add(s);
	
	}

public void rent(String customerID, DateTime rentDate, int numOfRentDays) {
		
		if (getPropStatus() == PropStatus.Available) {
			setPropStatus(PropStatus.Rented);
//			RentalRecord r = new RentalRecord(getPropID(), RentalRecord.getCustomerID(), RentalRecord.getEstimatedReturnDate(), RentalRecord.getRentDate(), RentalRecord.getRentalFee(), RentalRecord.getActualReturnDate());
//			
//			int openSlot;
//			
//			for(int i = 0; i < record.length; i++){
//				if(record[i] == null)
//					
//					openSlot = i;
//				
//				 record[i] =  r;
//				 record[i].setLateFee(662);
//				 break;  
//				 }
//				
//			System.out.println("Property: " + getPropID() + " is now rented\n");
//			} else {
//			System.out.println("Property " + getPropID() + " cannot be rented right now.");
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



