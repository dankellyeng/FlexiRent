package model;

import view.*;
import model.*;

import java.util.ArrayList;
import java.util.List;

import controller.*;

public class PropertyArray {
	private AddProperty addProperty;
	private FlexiRentController flexiRentController;
	private RentalProperty rental;

//	public PropertyArray(RentalProperty rental) {
//		
//	}
	
	List<RentalProperty> propArrayList = new ArrayList<RentalProperty>();
	

	public void addtoList(RentalProperty rental) {
		propArrayList.add(rental);
		System.out.println("Property " + rental.getPropID() + " added to arraylist");
	}
	
	
	//String result = roomBox.getValue();
	//int rooms = Integer.parseInt(result);
	

}