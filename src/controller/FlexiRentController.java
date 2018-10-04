package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;
import view.*;

public class FlexiRentController {

	private Homescreen homescreen;
	private AddProperty addProperty;
	private Apartment apartment;
	
	public FlexiRentController(AddProperty addProperty, Apartment apartment) {
		this.addProperty = addProperty;
		this.apartment = apartment;
		
		this.addProperty.addPropListener(new PropListener());
	}
	class PropListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String streetNum;
			String streetName;
			String suburb;
			String propType;
			int rooms;
			try {
				streetNum = addProperty.getStreetNum();
				streetName = addProperty.getStreetName();
				suburb = addProperty.getSuburb();
				propType = addProperty.getPropType();
				rooms = addProperty.getRooms();
			}
			catch(Exception ex) {
				System.out.println(ex);
				
			}
		}
		
	}
}
