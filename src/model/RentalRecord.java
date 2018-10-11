package model;
import java.util.Scanner;
public class RentalRecord {

	private static String customerID;
	private static String rentDate;
	private static String recordID;
	private static DateTime estimatedReturnDate;
	private static DateTime actualReturnDate;
	private static double rentalFee;
	//private static DateTime rentDate;
	private static double lateFee;
	private static String propID;

	 static DateTime date = new DateTime();
	 static RentalProperty property;


	public RentalRecord (String recordID, String customerID, DateTime estimatedReturnDate, String rentDate, double rentalFee, DateTime actualReturnDate) {

		recordID = propID + customerID + getRentDate() + "joy";
		this.estimatedReturnDate = estimatedReturnDate;
		//this.customerID = customerID;
		this.rentDate = rentDate;
		this.rentalFee = rentalFee;
		this.actualReturnDate = actualReturnDate;
		//recordID = propID + "_" + custID + "_" + 
		
		
	}


	Scanner console = new Scanner(System.in);

	private static double rate;


	public String toString() {
		String record;
		record = getrecordID() + ":" + getRentDate() + ":" + estimatedReturnDate + ":" + actualReturnDate + ":"
				+ rentalFee + ":" + getLateFee();
		return record;

	}
	public static void setRecordID(String recordID) {
		RentalRecord.recordID = recordID;
	}
	
	public static String getrecordID() {
		recordID = propID + "_" + getCustomerID() + "_" + date.getEightDigitDate();
		return recordID;
	}

	public static double getrentalFee() {
		rentalFee = property.getRate() * 1 + getLateFee();
		return rentalFee;
	}


	public static String getRentDate() {
		
		rentDate = date.getFormattedDate();
		
//		date = rentDate;
		return rentDate;
		
	}


//	public String getDetails(RentalProperty property) {
//		String details;
//		String ID;
//		System.out.println("Enter the propID of the rental to see details: ");
//		ID = console.nextLine();
//
//
//		//if(propStatus = true){
//		details = "Record ID:			Example" +
//				"Rent Date: 		"+ getrentDate() +
//				"Estimated Return Date"	+ getEstimatedReturnDate();
//		//}else{
//		//		details = "Record ID:			Example" +
//		//				"Rent Date: 		" + getrentDate() +
//		//				"Estimated Return Date:		"	+ getestimatedReturnDate() +
//		//				"Actual Return Date:			" + getactualReturnDate() +
//		//				"Rental Fee:			" + getrentalFee();
//		return details;
//
//	}

	public static double getLateFee() {
		return lateFee;
	}

	public void setLateFee(double lateFee) {
		this.lateFee = lateFee;
	}

	public static DateTime getEstimatedReturnDate() {
		//estimatedReturnDate = DateTime();
		return estimatedReturnDate;
	}

	public static void setEstimatedReturnDate(DateTime dateTime) {
		estimatedReturnDate = dateTime;
	}

	public static DateTime getActualReturnDate() {
		return actualReturnDate;
	}

	public void setActualReturnDate(DateTime actualReturnDate) {
		this.actualReturnDate = actualReturnDate;
	}

	public static double getRentalFee() {
		
		return rentalFee;
	}

	public void setRentalFee(double rentalFee) {
		this.rentalFee = rentalFee;
	
	}

	public static String getCustomerID() {
		return customerID;
	}

	public static void setCustomerID(String customerID) {
		RentalRecord.customerID = customerID;
	}
	public static String getPropID() {
		return propID;
	}
	public static void setPropID(String propID) {
		RentalRecord.propID = propID;
	}

	
}


