package model;

import view.*;
import model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import controller.*;
import javafx.scene.image.ImageView;

public class PropertyArray {
	
	private static RentalRecord record;
	private static RentalProperty property;
	private static ArrayList <RentalRecord> recordList;
	

	public static List<RentalProperty> propArrayList = new ArrayList<RentalProperty>();
	//public static List<RentalRecord> recordArrayList = new ArrayList<RentalRecord>();
	public static HashMap<String, ImageView> imageMap = new HashMap<>();

	//creates and fills arrayList to populate TableView in Homescreen
	
	public static void addtoList() {
		RentalRecord s1r1 = new RentalRecord("S_29Brunswick_James42_2018-10-09", "James42", "2018-10-12", "2018-10-09", 1220, "2018-10-13");
		RentalRecord s1r2 = new RentalRecord("S_29Brunswick_Riley21_2018-10-09", "Riley21", "2018-08-12", "2018-08-09", 1220, "2018-08-13");
		RentalRecord s1r3 = new RentalRecord("S_29Brunswick_Quincey33_2018-10-09", "Quincey33", "2018-07-12", "2018-07-09", 1220, "2018-07-13");
		
		Suite s1 = new Suite("S_29Brunswick", "29", "Albert St", "Brunswick", PropStatus.Rented, "Albertstreet.jpg", "This premium suite has a microwave that you are allowed to use! (Accepts 4x $2 coins).", recordList = new ArrayList<RentalRecord>());
		s1.getRecordList().add(s1r1);
		s1.getRecordList().add(s1r2);
		s1.getRecordList().add(s1r3);
		propArrayList.add(s1);
		imageMap.put(s1.getPropID(), ImageView(s1.getImage()));

		RentalRecord s2r1 = new RentalRecord("S_29Brunswick_James42_2018-10-09", "James42", "2018-10-12", "2018-10-09", 1220, "2018-10-13");
		RentalRecord s2r2 = new RentalRecord("S_29Brunswick_Riley21_2018-10-09", "Riley21", "2018-08-12", "2018-08-09", 1220, "2018-08-13");
		RentalRecord s2r3 = new RentalRecord("S_29Brunswick_Quincey33_2018-10-09", "Quincey33", "2018-07-12", "2018-07-09", 1220, "2018-07-13");
		
		Suite s2 = new Suite("S_41Port Melbourne", "41", "Beach St", "Port Melbourne", PropStatus.Available, "Beachstreet.jpg", "This luxurious premium suite is right in the heart of the city and won't disappoint.\n" + 
				"", recordList = new ArrayList<RentalRecord>());
		s2.getRecordList().add(s2r1);
		s2.getRecordList().add(s2r2);
		s2.getRecordList().add(s2r3);
		propArrayList.add(s2);

		RentalRecord s3r1 = new RentalRecord("S_29Brunswick_James42_2018-10-09", "James42", "2018-10-12", "2018-10-09", 1220, "2018-10-13");
		RentalRecord s3r2 = new RentalRecord("S_29Brunswick_Riley21_2018-10-09", "Riley21", "2018-08-12", "2018-08-09", 1220, "2018-08-13");
		RentalRecord s3r3 = new RentalRecord("S_29Brunswick_Quincey33_2018-10-09", "Quincey33", "2018-07-12", "2018-07-09", 1220, "2018-07-13");
		
		Suite s3 = new Suite("S_13Carlton", "13", "Brick Drive", "Carlton", PropStatus.Available, "Brickdrive.jpg", "This amazing premium suite offers a once in a lifetime experience for all visitors.\n" + 
				"", recordList = new ArrayList<RentalRecord>());
		s3.getRecordList().add(s3r1);
		s3.getRecordList().add(s3r2);
		s3.getRecordList().add(s3r3);
		propArrayList.add(s3);

		RentalRecord s4r1 = new RentalRecord("S_29Brunswick_James42_2018-10-09", "James42", "2018-10-12", "2018-10-09", 1220, "2018-10-13");
		RentalRecord s4r2 = new RentalRecord("S_29Brunswick_Riley21_2018-10-09", "Riley21", "2018-08-12", "2018-08-09", 1220, "2018-08-13");
		RentalRecord s4r3 = new RentalRecord("S_29Brunswick_Quincey33_2018-10-09", "Quincey33", "2018-07-12", "2018-07-09", 1220, "2018-07-13");
		
		Suite s4 = new Suite("S_24Carlton North", "24", "Clarendon St", "Carlton North", PropStatus.Available, "Clarendonstreet.jpg", "This wonderful premium suite has everything you need to relax and feel at home.\n" + 
				"", recordList = new ArrayList<RentalRecord>());
		s4.getRecordList().add(s4r1);
		s4.getRecordList().add(s4r2);
		s4.getRecordList().add(s4r3);
		propArrayList.add(s4);
		
		RentalRecord s5r1 = new RentalRecord("S_29Brunswick_James42_2018-10-09", "James42", "2018-10-12", "2018-10-09", 1220, "2018-10-13");
		RentalRecord s5r2 = new RentalRecord("S_29Brunswick_Riley21_2018-10-09", "Riley21", "2018-08-12", "2018-08-09", 1220, "2018-08-13");
		RentalRecord s5r3 = new RentalRecord("S_29Brunswick_Quincey33_2018-10-09", "Quincey33", "2018-07-12", "2018-07-09", 1220, "2018-07-13");
		
		Suite s5 = new Suite("S_41Northcote", "44", "Dods St", "Northcote", PropStatus.Available, "Dodsstreet.jpg", "This fantastic premium suite will make you feel like a movie star living the dream.\n" + 
				"", recordList = new ArrayList<RentalRecord>());
		s5.getRecordList().add(s5r1);
		s5.getRecordList().add(s5r2);
		s5.getRecordList().add(s5r3);
		propArrayList.add(s5);

		RentalRecord a1r1 = new RentalRecord("S_29Brunswick_James42_2018-10-09", "James42", "2018-10-12", "2018-10-09", 1220, "2018-10-13");
		RentalRecord a1r2 = new RentalRecord("S_29Brunswick_Riley21_2018-10-09", "Riley21", "2018-08-12", "2018-08-09", 1220, "2018-08-13");
		RentalRecord a1r3 = new RentalRecord("S_29Brunswick_Quincey33_2018-10-09", "Quincey33", "2018-07-12", "2018-07-09", 1220, "2018-07-13");
		
		Apartment a1 = new Apartment ("A_82Brunswick", "82", "Kavanagh St", "Brunswick", PropStatus.Available, 2, 2, 210, 315, "Kavanaghstreet.jpg", "This quaint little apartment is centrally located and great for those on a budget.\n" + 
				"", recordList = new ArrayList<RentalRecord>());
		a1.getRecordList().add(a1r1);
		a1.getRecordList().add(a1r2);
		a1.getRecordList().add(a1r3);
		propArrayList.add(a1);
		
		RentalRecord a2r1 = new RentalRecord("S_29Brunswick_James42_2018-10-09", "James42", "2018-10-12", "2018-10-09", 1220, "2018-10-13");
		RentalRecord a2r2 = new RentalRecord("S_29Brunswick_Riley21_2018-10-09", "Riley21", "2018-08-12", "2018-08-09", 1220, "2018-08-13");
		RentalRecord a2r3 = new RentalRecord("S_29Brunswick_Quincey33_2018-10-09", "Quincey33", "2018-07-12", "2018-07-09", 1220, "2018-07-13");
		
		Apartment a2 = new Apartment ("A_27Carlton", "27", "Luxury St", "Carlton", PropStatus.Available, 2, 2, 210, 315, "Luxuraystreet.jpg", "This recently renovated apartment features all new appliances and a pool too.\n" + 
				"", recordList = new ArrayList<RentalRecord>());
		a2.getRecordList().add(a2r1);
		a2.getRecordList().add(a2r2);
		a2.getRecordList().add(a2r3);
		propArrayList.add(a2);
		
		RentalRecord a3r1 = new RentalRecord("S_29Brunswick_James42_2018-10-09", "James42", "2018-10-12", "2018-10-09", 1220, "2018-10-13");
		RentalRecord a3r2 = new RentalRecord("S_29Brunswick_Riley21_2018-10-09", "Riley21", "2018-08-12", "2018-08-09", 1220, "2018-08-13");
		RentalRecord a3r3 = new RentalRecord("S_29Brunswick_Quincey33_2018-10-09", "Quincey33", "2018-07-12", "2018-07-09", 1220, "2018-07-13");
		
		Apartment a3 = new Apartment ("A_13Thornbury", "13", "Park St", "Thornbury", PropStatus.Available, 2, 2, 210, 315, "Parkstreet.jpg", "This apartment is perfect for winter getaways as well as sweet summer vacations. \n" +
				"", recordList = new ArrayList<RentalRecord>());
		a3.getRecordList().add(a3r1);
		a3.getRecordList().add(a3r2);
		a3.getRecordList().add(a3r3);
		propArrayList.add(a3);
		
		RentalRecord a4r1 = new RentalRecord("S_29Brunswick_James42_2018-10-09", "James42", "2018-10-12", "2018-10-09", 1220, "2018-10-13");
		RentalRecord a4r2 = new RentalRecord("S_29Brunswick_Riley21_2018-10-09", "Riley21", "2018-08-12", "2018-08-09", 1220, "2018-08-13");
		RentalRecord a4r3 = new RentalRecord("S_29Brunswick_Quincey33_2018-10-09", "Quincey33", "2018-07-12", "2018-07-09", 1220, "2018-07-13");
		
		Apartment a4 = new Apartment ("A_5Parkville", "5", "Rakaia Way", "Parkville", PropStatus.Available, 2, 2, 210, 315, "Rakaiaway.jpg", "This apartment will not disappoint with its spacious bedrooms and wonderful kitchen.\n" + 
				"", recordList = new ArrayList<RentalRecord>());
		a4.getRecordList().add(a4r1);
		a4.getRecordList().add(a4r2);
		a4.getRecordList().add(a4r3);
		propArrayList.add(a4);
		
		RentalRecord a5r1 = new RentalRecord("S_29Brunswick_James42_2018-10-09", "James42", "2018-10-12", "2018-10-09", 1220, "2018-10-13");
		RentalRecord a5r2 = new RentalRecord("S_29Brunswick_Riley21_2018-10-09", "Riley21", "2018-08-12", "2018-08-09", 1220, "2018-08-13");
		RentalRecord a5r3 = new RentalRecord("S_29Brunswick_Quincey33_2018-10-09", "Quincey33", "2018-07-12", "2018-07-09", 1220, "2018-07-13");
		
		Apartment a5 = new Apartment ("A_66Fitzroy", "66", "Southbank Rd", "Fitzroy", PropStatus.Available, 2, 2, 210, 315, "Southbankroad.jpg","This wonderful apartment has 3 gigantic bedrooms and a huge entertaining area.\n" + 
				"", recordList = new ArrayList<RentalRecord>());
		a5.getRecordList().add(a5r1);
		a5.getRecordList().add(a5r2);
		a5.getRecordList().add(a5r3);
		propArrayList.add(a5);
		
		RentalRecord a6r1 = new RentalRecord("S_29Brunswick_James42_2018-10-09", "James42", "2018-10-12", "2018-10-09", 1220, "2018-10-13");
		RentalRecord a6r2 = new RentalRecord("S_29Brunswick_Riley21_2018-10-09", "Riley21", "2018-08-12", "2018-08-09", 1220, "2018-08-13");
		RentalRecord a6r3 = new RentalRecord("S_29Brunswick_Quincey33_2018-10-09", "Quincey33", "2018-07-12", "2018-07-09", 1220, "2018-07-13");
		
		Apartment a6 = new Apartment ("A_7Flemington", "7", "Stuart St", "Flemington", PropStatus.Available, 2, 2, 210, 315, "Stuartstreet.jpg", "This great apartment features beautiful views of the city skyline and has a pool.\n" + 
				"", recordList = new ArrayList<RentalRecord>());
		a6.getRecordList().add(a6r1);
		a6.getRecordList().add(a6r2);
		a6.getRecordList().add(a6r3);
		propArrayList.add(a6);
		
		RentalRecord a7r1 = new RentalRecord("S_29Brunswick_James42_2018-10-09", "James42", "2018-10-12", "2018-10-09", 1220, "2018-10-13");
		RentalRecord a7r2 = new RentalRecord("S_29Brunswick_Riley21_2018-10-09", "Riley21", "2018-08-12", "2018-08-09", 1220, "2018-08-13");
		RentalRecord a7r3 = new RentalRecord("S_29Brunswick_Quincey33_2018-10-09", "Quincey33", "2018-07-12", "2018-07-09", 1220, "2018-07-13");
		
		Apartment a7 = new Apartment ("A_17Alphington", "17", "Sydney Ave", "Alphington", PropStatus.Available, 2, 2, 210, 315, "Sydneyavenue.jpg", "This amazing apartment has all you need to relax including a gigantic spa bath.\n" + 
				"", recordList = new ArrayList<RentalRecord>());
		a7.getRecordList().add(a7r1);
		a7.getRecordList().add(a7r2);
		a7.getRecordList().add(a7r3);
		propArrayList.add(a7);
		
		RentalRecord a8r1 = new RentalRecord("S_29Brunswick_James42_2018-10-09", "James42", "2018-10-12", "2018-10-09", 1220, "2018-10-13");
		RentalRecord a8r2 = new RentalRecord("S_29Brunswick_Riley21_2018-10-09", "Riley21", "2018-08-12", "2018-08-09", 1220, "2018-08-13");
		RentalRecord a8r3 = new RentalRecord("S_29Brunswick_Quincey33_2018-10-09", "Quincey33", "2018-07-12", "2018-07-09", 1220, "2018-07-13");
		
		Apartment a8 = new Apartment ("A_23Brunswick", "23", "Sydney Rd", "Brunswick", PropStatus.Available, 2, 2, 210, 315, "Sydneyroad.jpg", "This fantastic apartment has a private balcony and a 55 inch television.\n" + 
				"", recordList = new ArrayList<RentalRecord>());
		a8.getRecordList().add(a8r1);
		a8.getRecordList().add(a8r2);
		a8.getRecordList().add(a8r3);
		propArrayList.add(a8);
		
		RentalRecord a9r1 = new RentalRecord("S_29Brunswick_James42_2018-10-09", "James42", "2018-10-12", "2018-10-09", 1220, "2018-10-13");
		RentalRecord a9r2 = new RentalRecord("S_29Brunswick_Riley21_2018-10-09", "Riley21", "2018-08-12", "2018-08-09", 1220, "2018-08-13");
		RentalRecord a9r3 = new RentalRecord("S_29Brunswick_Quincey33_2018-10-09", "Quincey33", "2018-07-12", "2018-07-09", 1220, "2018-07-13");
		
		Apartment a9 = new Apartment ("A_45Brunswick West", "45", "Union St", "Brunswick West", PropStatus.Available, 2, 2, 210, 315, "Unionstreet.jpg", "This beautiful apartment is well-lit and spacious with a great back yard.\n" + 
				"", recordList = new ArrayList<RentalRecord>());
		a9.getRecordList().add(a9r1);
		a9.getRecordList().add(a9r2);
		a9.getRecordList().add(a9r3);
		propArrayList.add(a9);
		
		RentalRecord a10r1 = new RentalRecord("S_29Brunswick_James42_2018-10-09", "James42", "2018-10-12", "2018-10-09", 1220, "2018-10-13");
		RentalRecord a10r2 = new RentalRecord("S_29Brunswick_Riley21_2018-10-09", "Riley21", "2018-08-12", "2018-08-09", 1220, "2018-08-13");
		RentalRecord a10r3 = new RentalRecord("S_29Brunswick_Quincey33_2018-10-09", "Quincey33", "2018-07-12", "2018-07-09", 1220, "2018-07-13");
		
		Apartment a10 = new Apartment ("A_54Carlton", "54", "Victoria St", "Carlton", PropStatus.Available, 2, 2, 210, 315, "Victoriastreet.jpg", "This stunning rental property is recently renovated and has plenty of room.\n" + 
				"", recordList = new ArrayList<RentalRecord>());
		a10.getRecordList().add(a10r1);
		a10.getRecordList().add(a10r2);
		a10.getRecordList().add(a10r3);
		propArrayList.add(a10);
	}

	private static ImageView ImageView(String image) {
		ImageView imageView = new ImageView(image);
		return imageView;
	}


}
