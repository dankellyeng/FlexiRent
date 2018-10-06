package model;
import java.util.Date;
import java.util.Scanner;

public abstract class RentalProperty {

	private String propID;
	private String streetNum;
	private String streetName;
	private String suburb;
	private PropStatus propStatus;
	private String propType;
	private int rooms;
	private int minimumRent;
	private static double rate;
	private String image;
	private String description;
	RentalRecord[] record; 
	
	//RentalRecord r = new RentalRecord();

	public RentalProperty(String streetNum, String streetName, String suburb,
			PropStatus propStatus, String image, String description) {

		propID = propType + streetNum + suburb;
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.suburb = suburb;
		this.propStatus = PropStatus.Available;
		//this.record = new RentalRecord[10]; 
		this.image = "image-coming-soon.jpg";
		this.description = description;

	}
	public RentalProperty() {
		
	}

	Scanner console =  new Scanner(System.in);

	private DateTime rentDate;

	

	public void setPropStatus(PropStatus propStatus) {
		this.propStatus = propStatus;
	}

	public int getRooms() {
		return rooms;
	}


	public void setRooms(int rooms) {
		this.rooms = rooms;
	}


	public int getMinimumRent() {
		return minimumRent;
	}


	public void setMinimumRent(int minimumRent) {
		this.minimumRent = minimumRent;
	}


	public static double getRate() {
		return rate;
	}


	public void setRate(double rate) {
		this.rate = rate;
	}

	public void addProperty() {

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
				 //record[i].setLateFee(rate * 1.15);
				 break;  
				 }
				
			System.out.println("Property: " + getPropID() + " is now rented\n");
			} else {
			System.out.println("Property " + getPropID() + " cannot be rented right now.");
		}

	}

	public void returnProperty(DateTime returnDate) {
		
		if (getPropStatus() == PropStatus.Rented) {
			setPropStatus(PropStatus.Available);
			RentalRecord r = new RentalRecord(getPropID(), RentalRecord.getCustomerID(), RentalRecord.getEstimatedReturnDate(), RentalRecord.getRentDate(), RentalRecord.getRentalFee(), RentalRecord.getActualReturnDate());
			//DateTime late = new DateTime();
			//int l = DateTime.diffDays(returnDate, getrentDate());
			
			int openSlot;
			
			for(int i = 0; i < record.length; i++){
				if(record[i] == null)
					
					openSlot = i;
				
				
				 record[i] =  r;
				 record[i].setActualReturnDate(returnDate);
				// record[i].setRentalFee(l * RentalRecord.getRentalFee());;
				 
				 break;  
				 }
		} else {
			System.out.println("Property " + getPropID() + " cannot be returned right now.");
		}
		
	}

	public void performMaintenance() {

		if (getPropStatus() == PropStatus.Available) {
			setPropStatus(PropStatus.UnderMaintenance);
		} else {
			System.out.println("Property " + getPropID() + " cannot be maintained right now.");
		}
		
	}
	public void completeMaintenance(DateTime completionDate) {
		
		if (getPropStatus() == PropStatus.UnderMaintenance) {
			setPropStatus(PropStatus.Available);
		} else {
			System.out.println("Property " + getPropID() + " is not under maintenance.");
		}
		
	}


	public String toString() {
		return null;
	}
	public String getDetails() {
		String details = null;
		
		
		if(propStatus == PropStatus.Rented){
		details = "Record ID: " + RentalRecord.getrecordID()+
				"\nRent Date: "+ RentalRecord.getRentDate() +
				"\nEstimated Return Date: "	+ RentalRecord.getEstimatedReturnDate() + "\n"; 
		}else if (propStatus == PropStatus.Available){
				details = "Record ID: " + RentalRecord.getrecordID() +
						"\nRent Date: " + RentalRecord.getRentDate() +
						"\nEstimated Return Date: " + RentalRecord.getEstimatedReturnDate() +
						"\nActual Return Date: " + RentalRecord.getActualReturnDate() +
						"\nRental Fee: " + RentalRecord.getrentalFee() +
						"\nLate Fee: " + RentalRecord.getLateFee()+ "\n";
		}
				return details;

	} 

	public DateTime getrentDate() {
		
		return rentDate;
	}

	public String getPropID() {
		return propID;
	}

	public void setPropID(String propID) {
		this.propID = propID;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public RentalRecord[] getRecord() {
		return record;
	}

	public void setRecord(RentalRecord[] record) {
		this.record = record;
	}

	public PropStatus getPropStatus() {
		return propStatus;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}


