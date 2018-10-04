package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {
	public static void main(String[] args) {
		final String DB_NAME = "propDB";
		final String TABLE_NAME = "RENTAL_PROPERTY";
		
		//use try-with-resources Statement
		try (Connection con = DatabaseConnect.getConnection(DB_NAME);
				Statement stmt = con.createStatement();
		) {
			String query = "SELECT * FROM " + TABLE_NAME;
			
			try (ResultSet resultSet = stmt.executeQuery(query)) {
				while(resultSet.next()) {
					System.out.printf("Property image: %s | Property ID: %s | Street Number: %s | Street Name: %s | Suburb: %s | Property Status: %s | "
							+ "Rooms: %d | Rate: %d | Minimum Rent: %d\n",
							resultSet.getString("propImage"), resultSet.getString("propID"), resultSet.getString("streetNum"), 
							resultSet.getString("streetName"), resultSet.getString("suburb"), resultSet.getString("propStatus"),
							resultSet.getInt("rooms"), resultSet.getInt("rate"), resultSet.getInt("minimumRent") );
					
//					CREATE TABLE RENTAL_PROPERTY ("
//							+ "propID VARCHAR(16) NOT NULL,"
//							+ "streetNum VARCHAR(8) NOT NULL," 
//							+ "streetName VARCHAR(32) NOT NULL,"
//							+ "suburb VARCHAR(16) NOT NULL,"
//							+ "propStatus VARCHAR(16) NOT NULL,"
//							+ "rooms INT NOT NULL,"
//							+ "rate DOUBLE NOT NULL,"
//							+ "minimumRent INT NOT NULL
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Suite s3 = new Suite(resultSet.getString("propImage"), TABLE_NAME, TABLE_NAME, TABLE_NAME, null);
	}
}
