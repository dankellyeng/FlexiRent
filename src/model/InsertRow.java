//package model;
//
//import java.sql.Connection;
//import java.sql.Statement;
//
//public class InsertRow {
//	
//		//public static void main(String[] args) {
//			final String DB_NAME = "propDB";
//			final String TABLE_NAME = "RENTAL_PROPERTY";
//			
//			//use try-with-resources Statement
//			try (Connection con = DatabaseConnect.getConnection(DB_NAME);
//					Statement stmt = con.createStatement();
//			) {
//				String query = "INSERT INTO " + TABLE_NAME + 
//				
////				" VALUES ('S_23Brunswick', '23', 'Albert St', 'Brunswick', 'Available', 3, 1, 554, 669, 'Albertstreet.jpg', 'This premium suite has a microwave that you are allowed to use. Accepts 4x $2 coins.' )" ;
////				" VALUES ('S_41Port Melbourne', '41', 'Beach St', 'Port Melbourne', 'Available', 3, 1, 554, 669, 'Beachstreet.jpg', 'This luxurious premium suite is right in the heart of the city and will not disappoint.' )" ;
////				" VALUES ('S_13Carlton', '13', 'Brick Drive', 'Carlton', 'Available', 3, 1, 554, 669, 'Brickdrive.jpg', 'This amazing premium suite offers a once in a lifetime experience for all visitors.' )" ;
////						
////				" VALUES ('S_24Carlton North', '24', 'Clarendon St', 'Carlton North', 'Available', 3, 1, 554, 669, 'Clarendonstreet.jpg', 'This wonderful premium suite has everything you need to relax and feel at home.' )" ;
////						
////				" VALUES ('S_41Northcote', '44', 'Dods St', 'Northcote', 'Available', 3, 1, 554, 669, 'Dodsstreet.jpg', 'This fantastic premium suite will make you feel like a movie star living the dream.' )" ;
////						
////				" VALUES ('A_82Brunswick', '82', 'Kavanagh St', 'Brunswick', 'Available', 2, 2, 210, 315, 'Kavanaghstreet.jpg', 'This quaint little apartment is centrally located and great for those on a budget.' )" ;
////						
////				" VALUES ('A_27Carlton', '27', 'Luxury St', 'Carlton', 'Available', 2, 2, 210, 315, 'Luxuraystreet.jpg', 'This recently renovated apartment features all new appliances and a pool too.' )" ;
////						
////				" VALUES ('A_13Thornbury', '13', 'Park St', 'Thornbury', 'Available', 2, 2, 210, 315, 'Parkstreet.jpg', 'This apartment is perfect for winter getaways as well as sweet summer vacations.' )" ;
////				
////				" VALUES ('A_5Parkville', '5', 'Rakaia Way', 'Parkville', 'Available', 2, 2, 210, 315, 'Rakaiaway.jpg', 'This apartment will not disappoint with its spacious bedrooms and wonderful kitchen.' )" ;
////						
////				" VALUES ('A_66Fitzroy', '66', 'Southbank Rd', 'Fitzroy', 'Available', 2, 2, 210, 315, 'Southbankroad.jpg', 'This wonderful apartment has 3 gigantic bedrooms and a huge entertaining area.' )" ;
////						
////				" VALUES ('A_7Flemington', '7', 'Stuart St', 'Flemington', 'Available', 2, 2, 210, 315, 'Stuartstreet.jpg', 'This great apartment features beautiful views of the city skyline and has a pool.' )" ; 
////						
////				" VALUES ('A_17Alphington', '17', 'Sydney Ave', 'Alphington', 'Available', 2, 2, 210, 315, 'Sydneyavenue.jpg', 'This amazing apartment has all you need to relax including a gigantic spa bath.' )"; 
////						
////				" VALUES ('A_23Brunswick', '23', 'Sydney Rd', 'Brunswick', 'Available', 2, 2, 210, 315, 'Sydneyroad.jpg', 'This fantastic apartment has a private balcony and a 55 inch television.' )" ;
////						
////				" VALUES ('A_45Brunswick West', '45', 'Union St', 'Brunswick West', 'Available', 2, 2, 210, 315, 'Unionstreet.jpg', 'This beautiful apartment is well lit and spacious with a great back yard.' )"; 
//						
////				" VALUES ('A_54Carlton', '54', 'Victoria St', 'Carlton', 'Available', 2, 2, 210, 315, 'Victoriastreet.jpg', 'This stunning rental property is recently renovated and has plenty of room.' )";  
//						
//				
////				CREATE TABLE RENTAL_PROPERTY ("
////						+ "propID VARCHAR(16) NOT NULL,"
////						+ "streetNum VARCHAR(8) NOT NULL," 
////						+ "streetName VARCHAR(32) NOT NULL,"
////						+ "suburb VARCHAR(16) NOT NULL,"
////						+ "propStatus VARCHAR(16) NOT NULL,"
////						+ "rooms INT NOT NULL,"
////						+ "rate DOUBLE NOT NULL,"
////						+ "minimumRent INT NOT NULL
//				
//				int result = stmt.executeUpdate(query);
//				
//				con.commit();
//				
//				System.out.println("Insert into table " + TABLE_NAME + " executed successfully");
//				System.out.println(result + " row(s) affected");
//
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
//		}
//	}