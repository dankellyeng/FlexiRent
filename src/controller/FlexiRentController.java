package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.*;
import view.*;

public class FlexiRentController {

	private Homescreen homescreen;
	private AddProperty addProperty;
	private RentalProperty property;
	private Apartment apartment;
	private Suite suite;
	private PropertyArray array;
	
	public FlexiRentController(AddProperty addProperty, Apartment apartment) {
		this.addProperty = addProperty;
		this.apartment = apartment;
		
		this.addProperty.addPropListener(new PropListener());
	}
	class PropListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String propID;
			String streetNum;
			String streetName;
			String suburb;
			String propType;
			String image;
			String description;
			ArrayList <RentalRecord> recordList;
			int rooms;
			int rate;
			double lateFee;
			try {
				propID = addProperty.getPropType() + addProperty.getStreetNum() + addProperty.getSuburb();
				streetNum = addProperty.getStreetNum();
				streetName = addProperty.getStreetName();
				suburb = addProperty.getSuburb();
				propType = addProperty.getPropType();
				rooms = addProperty.getRooms();
				image = addProperty.getImage();
				description = addProperty.getDescription();
				recordList = addProperty.getRecord();
				
					if(propType == "Apartment") {
						if (addProperty.getRooms() == 1) { //set rate for Appartment
							rate = 143;
						}else if (addProperty.getRooms() == 2) {
							rate = 210;
						}else if (addProperty.getRooms() == 3) {
							rate = 319;
						lateFee = rate*1.15;
						Apartment a = new Apartment(propID, streetNum, streetName, suburb, PropStatus.Available, rooms, 2, rate, lateFee, image, description, recordList);
						}else if(propType == "Premium Suite") {
						Suite s = new Suite(propID, streetNum, streetName, suburb, PropStatus.Available, image, description, recordList);
					}
					
				
				
					}
				
			}
			catch(Exception ex) {
				System.out.println(ex);
				
			}
		}
		
	}
}
