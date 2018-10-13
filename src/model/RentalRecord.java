package model;
import java.util.HashMap;
import java.util.Scanner;
public class RentalRecord {

	private String customerID;
	private String rentDate;
	private String recordID;
	private DateTime estimatedReturnDate;
	private DateTime actualReturnDate;
	private int rentalFee;
	//private static DateTime rentDate;
	private int lateFee;
//	private static String propID;
	private int rate;

	 static DateTime date = new DateTime();
	static RentalProperty property;

	static HashMap<String, RentalRecord> rentHistory = new HashMap<String, RentalRecord>();
	
	public RentalRecord (String recordID, String customerID, DateTime estimatedReturnDate, String rentDate, int rentalFee, DateTime actualReturnDate) {

		//recordID = property.getPropID()+ customerID + getRentDate() + "joy";
		recordID = property.getPropID() + "_" + customerID + "_" + date.getEightDigitDate();
		this.estimatedReturnDate = estimatedReturnDate;
		this.customerID = customerID;
		this.setRentDate(rentDate);
		this.rentalFee = rentalFee;
		this.actualReturnDate = actualReturnDate;
		//recordID = propID + "_" + custID + "_" + 
		
		
	}

	public void addtoRecordMap() {
		
	}

	Scanner console = new Scanner(System.in);

	


	public String toString() {
		String record;
		record = getRecordID() + ":" + getRentDate() + ":" + estimatedReturnDate + ":" + actualReturnDate + ":"
				+ rentalFee + ":" + getLateFee();
		return record;

	}
	public void setRecordID(String recordID) {
		this.recordID = recordID;
	}
	
	public String getRecordID() {
//		recordID = property.getPropID() + "_" + customerID + "_" + date.getEightDigitDate();
		return recordID;
	}

	public int getrentalFee() {
		rentalFee= 500;
//		rentalFee = property.getRate() * 1 + getLateFee();
		return rentalFee;
	}


	public String getRentDate() {
		
		rentDate = date.getFormattedDate();
		
//		date = rentDate;
		return rentDate;
		
	}


	public String getDetails(RentalProperty property) {
		String details;
		String ID;
		System.out.println("Enter the propID of the rental to see details: ");
		ID = console.nextLine();


//		//if(propStatus = true){
//		details = "Record ID:			Example" +
//				"Rent Date: 		"+ getrentDate() +
//				"Estimated Return Date"	+ getEstimatedReturnDate();
//		}else{
				details = "Record ID:			" + getRecordID() +
						"Rent Date: 		" + getRentDate() +
						"Estimated Return Date:		"	+ getEstimatedReturnDate() +
						"Actual Return Date:			" + getActualReturnDate() +
						"Rental Fee:			" + getrentalFee();
		return details;

	}

	public int getLateFee() {
		return lateFee;
	}

	public void setLateFee(int lateFee) {
		this.lateFee = lateFee;
	}

	public DateTime getEstimatedReturnDate() {
		//estimatedReturnDate = DateTime();
		return estimatedReturnDate;
	}

	public void setEstimatedReturnDate(DateTime dateTime) {
		estimatedReturnDate = dateTime;
	}

	public DateTime getActualReturnDate() {
		return actualReturnDate;
	}

	public void setActualReturnDate(DateTime actualReturnDate) {
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
//	public String getPropID() {
//		return propID;
//	}
//	public static void setPropID(String propID) {
//		RentalRecord.propID = propID;
//	}
	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}

	
}


