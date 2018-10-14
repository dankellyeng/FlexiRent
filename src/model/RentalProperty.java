package model;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public abstract class RentalProperty {

	private String propID;
	private String streetNum;
	private String streetName;
	private String suburb;
	private PropStatus propStatus;
	private String propType;
	private String propTypeLong;
	private int rooms;
	private int minimumRent;
	private int rate;
	private String image;
	private String description; 
	private String address;
	private DateTime rentDate;
	private ArrayList <RentalRecord> recordList;
	static RentalRecord record;

	public RentalProperty(String streetNum, String streetName, String suburb,
			PropStatus propStatus, String image, String description, ArrayList <RentalRecord> recordList) {

		this.propID = propType + streetNum + suburb;
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.suburb = suburb;
		this.propStatus = propStatus; 
		this.image = image;
		this.description = description;
		this.recordList = new ArrayList <RentalRecord>();
		this.address = streetNum + " " + streetName + " " + suburb;

	}
	public RentalProperty() {

	}

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

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

		public void addProperty() {
	
		}

	public void rent(String customerID, DateTime rentDate, int numOfRentDays) {

		if (getPropStatus() == PropStatus.Available) {
			setPropStatus(PropStatus.Rented);
		}
	}

	public void returnProperty(DateTime returnDate) {

		if (getPropStatus() == PropStatus.Rented) {
			setPropStatus(PropStatus.Available);
		}

	}

	public void performMaintenance() {

		if (getPropStatus() == PropStatus.Available) {
			setPropStatus(PropStatus.UnderMaintenance);
		}

	}
	public void completeMaintenance(DateTime completionDate) {

		if (getPropStatus() == PropStatus.UnderMaintenance) {
			setPropStatus(PropStatus.Available);
		}

	}

	public String toString() {
		return null;
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
	public String getStreetNum() {
		return streetNum;
	}
	public void setStreetNum(String streetNum) {
		this.streetNum = streetNum;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPropTypeLong() {
		return propTypeLong;
	}
	public void setPropTypeLong(String propTypeLong) {
		this.propTypeLong = propTypeLong;
	}
	public ArrayList <RentalRecord> getRecordList() {
		return recordList;
	}
	public void setRecordList(ArrayList <RentalRecord> recordList) {
		this.recordList = recordList;
	}

}


