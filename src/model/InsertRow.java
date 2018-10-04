package model;

import java.sql.Connection;
import java.sql.Statement;

public class InsertRow {
	
		public static void main(String[] args) {
			final String DB_NAME = "propDB";
			final String TABLE_NAME = "RENTAL_PROPERTY";
			
			//use try-with-resources Statement
			try (Connection con = DatabaseConnect.getConnection(DB_NAME);
					Statement stmt = con.createStatement();
			) {
				String query = "INSERT INTO " + TABLE_NAME + 
						" VALUES ('Albertstreet.jpg','S_23Brunswick', '23', 'Limbic St', 'Brunswick', 'Available', 3, 554, 1)";
						//" VALUES (2, 's3089940', 'Tom', 'Bruster')";
				
//				CREATE TABLE RENTAL_PROPERTY ("
//						+ "propID VARCHAR(16) NOT NULL,"
//						+ "streetNum VARCHAR(8) NOT NULL," 
//						+ "streetName VARCHAR(32) NOT NULL,"
//						+ "suburb VARCHAR(16) NOT NULL,"
//						+ "propStatus VARCHAR(16) NOT NULL,"
//						+ "rooms INT NOT NULL,"
//						+ "rate DOUBLE NOT NULL,"
//						+ "minimumRent INT NOT NULL
				
				int result = stmt.executeUpdate(query);
				
				con.commit();
				
				System.out.println("Insert into table " + TABLE_NAME + " executed successfully");
				System.out.println(result + " row(s) affected");

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}