package model;

import view.*;
import model.*;

import java.util.ArrayList;
import java.util.List;

import controller.*;

public class PropertyArray {
	private AddProperty addProperty;
	private FlexiRentController flexiRentController;
	
	List propArrayList = new ArrayList();
	
	public void addtoList() {
		propArrayList.add(RentalProperty);
		System.out.println("Property " + RentalProperty + " added to arraylist");
	}
	
	
	//String result = roomBox.getValue();
	//int rooms = Integer.parseInt(result);
	
}
