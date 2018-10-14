package model;
import java.util.ArrayList;
;
public class RentalRecord {

	private String customerID;
	private String propID;
	private String rentDate;
	private String recordID;
	private String estimatedReturnDate;
	private String actualReturnDate;
	private int rentalFee;
	private int lateFee;

	static DateTime date;
	static RentalProperty property;

	public RentalRecord (String recordID, String customerID, String estimatedReturnDate, String rentDate, int rentalFee, String actualReturnDate) {

		//recordID = property.getPropID() + "_" + customerID + "_" + rentDate;
		this.recordID = propID + "_" + customerID + "_" + rentDate;
		this.estimatedReturnDate = estimatedReturnDate;
		this.customerID = customerID;
		this.setRentDate(rentDate);
		this.rentalFee = rentalFee;
		this.actualReturnDate = actualReturnDate;

	}
	public static ArrayList<RentalRecord> rentHistory = new ArrayList<RentalRecord>();
	public static void addtoRecordMap() {

		RentalRecord s1 = new RentalRecord("S_29Brunswick_James42_2018-10-09", "James42", "2018-10-12", "2018-10-09", 1220, "2018-10-13");
		rentHistory.add(s1);
		RentalRecord s2 = new RentalRecord("S_29Brunswick_James42_2018-10-09", "James42", "2018-10-12", "2018-10-09", 1220, "2018-10-13");
		rentHistory.add(s2);
	}

	public String toString() {
		String record = null;
		return record;

	}
	public void setRecordID(String recordID) {
		this.recordID = recordID;
	}

	public String getRecordID() {

		return recordID;
	}

	public int getrentalFee() {
		rentalFee= 500;

		return rentalFee;
	}


	public String getRentDate() {

		return rentDate;

	}

	public String getDetails() {

		String details = "Record ID: " + getRecordID() + " \n" +
				"Rent Date: " + getRentDate() + " \n" +
				"Estimated Return Date: "	+ getEstimatedReturnDate() + " \n" +
				"Actual Return Date: " + getActualReturnDate() + " \n" +
				"Rental Fee: " + getrentalFee() + " \n";
		return details;
	}

	public int getLateFee() {
		return lateFee;
	}

	public void setLateFee(int lateFee) {
		this.lateFee = lateFee;
	}

	public String getEstimatedReturnDate() {

		return estimatedReturnDate;
	}

	public void setEstimatedReturnDate(String dateTime) {
		estimatedReturnDate = dateTime;
	}

	public String getActualReturnDate() {
		return actualReturnDate;
	}

	public void setActualReturnDate(String actualReturnDate) {
		this.actualReturnDate = actualReturnDate;
	}

	public int getRentalFee() {

		return rentalFee;
	}

	public void setRentalFee(int rentalFee) {
		this.rentalFee = rentalFee;

	}

	public  String getCustomerID() {
		return customerID;
	}

	public  void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}


}


