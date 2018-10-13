package model;

import view.*;
import model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import controller.*;
import javafx.scene.image.ImageView;

public class PropertyArray {
	private AddProperty addProperty;
	private FlexiRentController flexiRentController;
	private static RentalProperty rental;
	private Apartment apartment;
	private Suite suite;

//	public PropertyArray(RentalProperty rental) {
//		
//	}f
	
	
	public static List<RentalProperty> propArrayList = new ArrayList<RentalProperty>();
	public static HashMap<String, ImageView> imageMap = new HashMap<>();
	public static void addtoList() {
		
		
		
		//propArrayList.add(property);
		
		Suite s1 = new Suite("S_29Brunswick", "29", "Albert St", "Brunswick", PropStatus.Rented, "Albertstreet.jpg", "This premium suite has a microwave that you are allowed to use! (Accepts 4x $2 coins).");
		propArrayList.add(s1);
		imageMap.put(s1.getPropID(), ImageView(s1.getImage()));
		
		Suite s2 = new Suite("S_41Port Melbourne", "41", "Beach St", "Port Melbourne", PropStatus.Available, "Beachstreet.jpg", "This luxurious premium suite is right in the heart of the city and won't disappoint.\n" + 
				"" );
		propArrayList.add(s2);
		
		Suite s3 = new Suite("S_13Carlton", "13", "Brick Drive", "Carlton", PropStatus.Available, "Brickdrive.jpg", "This amazing premium suite offers a once in a lifetime experience for all visitors.\n" + 
				"");
		propArrayList.add(s3);
		
		Suite s4 = new Suite("S_24Carlton North", "24", "Clarendon St", "Carlton North", PropStatus.Available, "Clarendonstreet.jpg", "This wonderful premium suite has everything you need to relax and feel at home.\n" + 
				"");
		propArrayList.add(s4);
		Suite s5 = new Suite("S_41Northcote", "44", "Dods St", "Northcote", PropStatus.Available, "Dodsstreet.jpg", "This fantastic premium suite will make you feel like a movie star living the dream.\n" + 
				"");
		propArrayList.add(s5);
		
		Apartment a1 = new Apartment ("A_82Brunswick", "82", "Kavanagh St", "Brunswick", PropStatus.Available, 2, 2, 210, 315, "Kavanaghstreet.jpg", "This quaint little apartment is centrally located and great for those on a budget.\n" + 
				"");
		propArrayList.add(a1);
		Apartment a2 = new Apartment ("A_27Carlton", "27", "Luxury St", "Carlton", PropStatus.Available, 2, 2, 210, 315, "Luxuraystreet.jpg", "This recently renovated apartment features all new appliances and a pool too.\n" + 
				"");
		propArrayList.add(a2);
		Apartment a3 = new Apartment ("A_13Thornbury", "13", "Park St", "Thornbury", PropStatus.Available, 2, 2, 210, 315, "Parkstreet.jpg", "This apartment is perfect for winter getaways as well as sweet summer vacations. \n" +
				"");
		propArrayList.add(a3);
		Apartment a4 = new Apartment ("A_5Parkville", "5", "Rakaia Way", "Parkville", PropStatus.Available, 2, 2, 210, 315, "Rakaiaway.jpg", "This apartment will not disappoint with its spacious bedrooms and wonderful kitchen.\n" + 
				"");
		propArrayList.add(a4);
		Apartment a5 = new Apartment ("A_66Fitzroy", "66", "Southbank Rd", "Fitzroy", PropStatus.Available, 2, 2, 210, 315, "Southbankroad.jpg","This wonderful apartment has 3 gigantic bedrooms and a huge entertaining area.\n" + 
				"" );
		propArrayList.add(a5);
		Apartment a6 = new Apartment ("A_7Flemington", "7", "Stuart St", "Flemington", PropStatus.Available, 2, 2, 210, 315, "Stuartstreet.jpg", "This great apartment features beautiful views of the city skyline and has a pool.\n" + 
				"" );
		propArrayList.add(a6);
		Apartment a7 = new Apartment ("A_17Alphington", "17", "Sydney Ave", "Alphington", PropStatus.Available, 2, 2, 210, 315, "Sydneyavenue.jpg", "This amazing apartment has all you need to relax including a gigantic spa bath.\n" + 
				"");
		propArrayList.add(a7);
		Apartment a8 = new Apartment ("A_23Brunswick", "23", "Sydney Rd", "Brunswick", PropStatus.Available, 2, 2, 210, 315, "Sydneyroad.jpg", "This fantastic apartment has a private balcony and a 55 inch television.\n" + 
				"");
		propArrayList.add(a8);
		Apartment a9 = new Apartment ("A_45Brunswick West", "45", "Union St", "Brunswick West", PropStatus.Available, 2, 2, 210, 315, "Unionstreet.jpg", "This beautiful apartment is well-lit and spacious with a great back yard.\n" + 
				"");
		propArrayList.add(a9);
		Apartment a10 = new Apartment ("A_54Carlton", "54", "Victoria St", "Carlton", PropStatus.Available, 2, 2, 210, 315, "Victoriastreet.jpg", "This stunning rental property is recently renovated and has plenty of room.\n" + 
				"");
		propArrayList.add(a10);
	}
	
	
	
private static ImageView ImageView(String image) {
		ImageView imageView = new ImageView(image);
		return imageView;
	}



	//	Suite s1 = new Suite("S_23Brunswick", "23", "Albert St", "Brunswick", PropStatus.Available, "Albertstreet.jpg", "This premium suite has a microwave that you are allowed to use! (Accepts 4x $2 coins).");
//	
//	Suite s2 = new Suite("S_41Port Melbourne", "41", "Beach St", "Port Melbourne", PropStatus.Available, "Beachstreet.jpg", "This luxurious premium suite is right in the heart of the city and won't disappoint.\n" + 
//			"" );
//	Suite s3 = new Suite("S_13Carlton", "13", "Brick Drive", "Carlton", PropStatus.Available, "Brickdrive.jpg", "This amazing premium suite offers a once in a lifetime experience for all visitors.\n" + 
//			"");
//	Suite s4 = new Suite("S_24Carlton North", "24", "Clarendon St", "Carlton North", PropStatus.Available, "Clarendonstreet.jpg", "This wonderful premium suite has everything you need to relax and feel at home.\n" + 
//			"");
//	Suite s5 = new Suite("S_41Northcote", "44", "Dods St", "Northcote", PropStatus.Available, "Dodsstreet.jpg", "This fantastic premium suite will make you feel like a movie star living the dream.\n" + 
//			"");
//	
//	Apartment a1 = new Apartment ("A_82Brunswick", "82", "Kavanagh St", "Brunswick", PropStatus.Available, 2, 2, 210, 315, "Kavanaghstreet.jpg", "This quaint little apartment is centrally located and great for those on a budget.\n" + 
//			"");
//	Apartment a2 = new Apartment ("A_27Carlton", "27", "Luxury St", "Carlton", PropStatus.Available, 2, 2, 210, 315, "Luxuraystreet.jpg", "This recently renovated apartment features all new appliances and a pool too.\n" + 
//			"");
//	Apartment a3 = new Apartment ("A_13Thornbury", "13", "Park St", "Thornbury", PropStatus.Available, 2, 2, 210, 315, "Parkstreet.jpg", "This apartment is perfect for winter getaways as well as sweet summer vacations. \n" +
//			"");
//	Apartment a4 = new Apartment ("A_5Parkville", "5", "Rakaia Way", "Parkville", PropStatus.Available, 2, 2, 210, 315, "Rakaiaway.jpg", "This apartment will not disappoint with its spacious bedrooms and wonderful kitchen.\n" + 
//			"");
//	Apartment a5 = new Apartment ("A_66Fitzroy", "66", "Southbank Rd", "Fitzroy", PropStatus.Available, 2, 2, 210, 315, "Southbankroad.jpg","This wonderful apartment has 3 gigantic bedrooms and a huge entertaining area.\n" + 
//			"" );
//	Apartment a6 = new Apartment ("A_7Flemington", "7", "Stuart St", "Flemington", PropStatus.Available, 2, 2, 210, 315, "Stuartstreet.jpg", "This great apartment features beautiful views of the city skyline and has a pool.\n" + 
//			"" );
//	Apartment a7 = new Apartment ("A_17Alphington", "17", "Sydney Ave", "Alphington", PropStatus.Available, 2, 2, 210, 315, "Sydneyavenue.jpg", "This amazing apartment has all you need to relax including a gigantic spa bath.\n" + 
//			"");
//	Apartment a8 = new Apartment ("A_23Brunswick", "23", "Sydney Rd", "Brunswick", PropStatus.Available, 2, 2, 210, 315, "Sydneyroad.jpg", "This fantastic apartment has a private balcony and a 55 inch television.\n" + 
//			"");
//	Apartment a9 = new Apartment ("A_45Brunswick West", "45", "Union St", "Brunswick West", PropStatus.Available, 2, 2, 210, 315, "Unionstreet.jpg", "This beautiful apartment is well-lit and spacious with a great back yard.\n" + 
//			"");
	Apartment a11 = new Apartment ("A_54Carlton", "54", "Victoria St", "Carlton", PropStatus.Available, 2, 2, 210, 315, "Victoriastreet.jpg", "This stunning rental property is recently renovated and has plenty of room.\n" + 
			"");
//	propArrayList.add(a11);


	
//	rate = 143;
//}else if (addProperty.getRooms() == 2) {
//	rate = 210;
//}else if (addPro
//	rate 319
	
	
	
	
	//String result = roomBox.getValue();
	//int rooms = Integer.parseInt(result);
	
}
