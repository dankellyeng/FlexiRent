//package model;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class delete {
//	public static void main(String[] args) throws SQLException {
//		
//		final String DB_NAME = "propDB";
//		final String TABLE_NAME = "RENTAL_RECORD";
//		
//		//use try-with-resources Statement
//		try (Connection con = DatabaseConnect.getConnection(DB_NAME);
//				Statement stmt = con.createStatement();
//		) {
//			int result = stmt.executeUpdate("DROP TABLE RENTAL_RECORD");
//			
//			if(result == 0) {
//				System.out.println("Table " + TABLE_NAME + " has been deleted successfully");
//			} else {
//				System.out.println("Table " + TABLE_NAME + " was not deleted");
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}
//}