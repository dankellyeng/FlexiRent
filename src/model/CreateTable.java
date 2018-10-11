//package model;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class CreateTable {
//	public static void main(String[] args) throws SQLException {
//		
//		final String DB_NAME = "propDB";
//		final String TABLE_NAME = "RENTAL_RECORD";
//		
//		//use try-with-resources Statement
//		try (Connection con = DatabaseConnect.getConnection(DB_NAME);
//				Statement stmt = con.createStatement();
//		) {
//			
//			int result = stmt.executeUpdate("CREATE TABLE RENTAL_RECORD("
//					+ "recordID VARCHAR(64) NOT NULL,"
//					+ "estimatedReturnDate VARCHAR(16) NOT NULL,"
//					+ "rentDate VARCHAR(16) NOT NULL,"
//					+ "rentalFee INT NOT NULL,"
//					+ "actualReturnDate VARCHAR(16) NOT NULL,"
//					+ "PRIMARY KEY (recordID))");
//					
//					
//					
////										+ "propID VARCHAR(32) NOT NULL,"
////										+ "streetNum VARCHAR(8) NOT NULL," 
////										+ "streetName VARCHAR(32) NOT NULL,"
////										+ "suburb VARCHAR(32) NOT NULL,"
////										+ "propStatus VARCHAR(16) NOT NULL,"
////										+ "rooms INT NOT NULL,"
////										+ "rate INT NOT NULL,"
////										+ "minimumRent INT NOT NULL,"
////										+ "lateFee INT NOT NULL,"
////										+ "image VARCHAR(32) NOT NULL,"
////										+ "description VARCHAR(120) NOT NULL,"
////										+ "PRIMARY KEY (propID))");
//			if(result == 0) {
//				System.out.println("Table " + TABLE_NAME + " has been created successfully");
//			} else {
//				System.out.println("Table " + TABLE_NAME + " is not created");
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}
//}