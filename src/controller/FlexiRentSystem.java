package controller;

import java.util.Scanner;

import model.Apartment;
import model.DateTime;
import model.PropStatus;
import model.RentalProperty;
import model.RentalRecord;
import model.Suite;

import java.util.Date;

public class FlexiRentSystem {

	static RentalProperty[] properties = new RentalProperty[50];

	
	public static void addtoRecord(RentalProperty property){


		for(int i = 0; i < properties.length; i++) {  	//Finds next open slot in array
			if(properties[i] == null){
				properties[i] = property;
				
				break;
			}
			
		}
	}

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		Suite s = new Suite("S_23Brunswick", "23", "Limbic St", "Brunswick", PropStatus.Available);
		addtoRecord(s);
		
		//menu repeats while choice is not valid (int only)
		int option;

		do {

			System.out.println("**** FLEXIRENT SYSTEM MENU ****"
					+ "\n"
					+ "\nAdd Property:			1"
					+ "\nRent Property:			2"
					+ "\nReturn Property:		3"
					+ "\nProperty Maintenance:		4"
					+ "\nComplete Maintenance:		5"
					+ "\nDisplay All Properties:		6"
					+ "\nExit Program:			7"
					+ "\nEnter your choice: ");



			option = console.nextInt();
			if (option <1 || option >7) {
				System.out.println("Incorrect choice entered. Please try again\n");
			}
			if (option == 1) {  //Add a new property
				System.out.println("Enter '1' to add a new Appartment or '2' to add a new Premium Suite: ");
				int output = console.nextInt();
				
				if (output == 1) {//gets variables to create an Appartment

					console.nextLine(); 
					System.out.println("Enter Street Number: ");
					String streetNum = console.nextLine();
					System.out.println("Enter Street Name: ");
					String streetName = console.nextLine();
					System.out.println("Enter suburb: ");
					String suburb = console.nextLine();


					String propType = "A_";
					String propID = propType + streetNum + suburb;
					PropStatus propStatus = PropStatus.Available;
					int minimumRent = 0;
					double rate = 0;
					double lateFee = 0;

					System.out.println("Enter the number of rooms: ");
					int rooms = console.nextInt();

					if (rooms == 1) { //set rate for Appartment
						rate = 143;
					}else if (rooms == 2) {
						rate = 210;
					}else if (rooms == 3) {
						rate = 319;}

					rate = rate;
					lateFee = rate*1.15;


					Apartment.addProperty(propID, streetNum, streetName, suburb, propStatus,
							rooms, minimumRent, rate, lateFee);
					

					System.out.println("Appartment: " + propID + " succesfully added.");
					


				} else if (output == 2){ //gets variables to create a Suite
					console.nextLine(); 
					System.out.println("Enter Street Number: ");
					String streetNum = console.nextLine(); 
					System.out.println("Enter Street Name: "); 
					String streetName = console.nextLine(); 
					System.out.println("Enter suburb: ");
					String suburb = console.nextLine();
					PropStatus propStatus = PropStatus.Available;
					String propType = "S_";
					String propID = propType + streetNum + suburb;


					Suite.addProperty(propID, streetNum, streetName, suburb, propStatus);
					//addtoRecord();
					
					System.out.println("Premium Suite: " + propID + " succesfully added.\n");
					
				}

			}

			else if (option == 2) { //rent a property

				console.nextLine(); 
				System.out.println("Enter your Customer ID: ");
				String customerID = console.nextLine();
				RentalRecord.setCustomerID(customerID);
				System.out.println("Enter the Property ID of the property you wish to rent: ");
				String ID = console.nextLine();
				RentalRecord.setPropID(ID);
				System.out.println("How many days would you like to rent this property?");
				int numOfRentDays = console.nextInt();
				
				DateTime rentDate = new DateTime();
				
				Date date = new Date(rentDate.getTime());
				DateTime n = new DateTime(numOfRentDays);
				RentalRecord.setEstimatedReturnDate(n);
				
				RentalProperty found = null;
				
				for(int i = 0; i < properties.length; i++){
					
					if(properties[i] != null) {
							if (ID.equals(properties[i].getPropID())) {
								if(properties[i].getPropStatus() == PropStatus.Available) {
							found = properties[i];

						}
						found.rent(customerID, rentDate, n);
					}
				}	
			}

			}else if (option == 3) { //return a property
				console.nextLine(); 
				System.out.println("Enter the Property ID of the property you wish to return: ");
				String ID = console.nextLine();

				System.out.println("Please enter the return Date.");
				System.out.println("Day: ");
				int day = console.nextInt();
				System.out.println("Month: ");
				int month = console.nextInt();
				System.out.println("Year: ");
				int year = console.nextInt();
				
				DateTime returnDate = new DateTime(day, month, year);
				//Date date = new Date(returnDate.getTime());
				RentalProperty found = null;

				for(int i = 0; i < properties.length; i++){
					if(properties[i] != null) {
							if (ID.equals(properties[i].getPropID())) {
									if(properties[i].getPropStatus() == PropStatus.Rented) {
								found = properties[i];

							}
							found.returnProperty(returnDate);
							System.out.println("Property " + found.getPropID() + " succesfully returned\n");
						}
					}
				}
			}else if (option == 4) { // start maintenance

				console.nextLine(); 
				System.out.println("Enter the Property ID of the property you wish to perform maintenance on:  ");
				String ID = console.nextLine();

				RentalProperty found = null;

				for(int i = 0; i < properties.length; i++){
					if(properties[i] != null) {
							if (ID.equals(properties[i].getPropID())) {
									if(properties[i].getPropStatus() == PropStatus.Available) {
								found = properties[i];
							} 

							found.performMaintenance();
							

							System.out.println("Maintenance for " + found.getPropID()  + " has now begun\n");
							
							}
					}
				}
			}else if (option == 5) { //complete maintenance
				console.nextLine(); 
				System.out.println("Enter the Property ID of the property maintenance is now complete on: ");
				String ID = console.nextLine();


				DateTime completionDate = new DateTime();
				Date date = new Date(completionDate.getTime());

				RentalProperty found = null;

				for(int i = 0; i < properties.length; i++){
					if(properties[i] != null) {
						if(((Suite) properties[i]).getPropType() == "S_");
						if(properties[i].getPropStatus() == PropStatus.UnderMaintenance) {
							if (ID.equals(properties[i].getPropID())) {

								found = properties[i];

							}
							found.completeMaintenance(completionDate);
							System.out.println("Maintenance for " + found.getPropID() + " has now finished\n");
						}
					} else {	
					if(properties[i] != null) {
							if(properties[i].getPropStatus() == PropStatus.UnderMaintenance) {
								if (ID.equals(properties[i].getPropID())) {

									found = properties[i];

								}
								found.completeMaintenance(completionDate);
								System.out.println("Maintenance for " + found.getPropID() + " has now finished\n");
							}
					}
					}
					}
					 
						
			}else if (option == 6) { //display property history
				
				System.out.println(properties[0].getDetails());
				for(int i = 1; i < properties.length; i++)
					if(properties[i] != null) {
						if(properties[i].getDetails() == "Rented") {
					
					
						System.out.println(properties[i].getDetails());
					} else {
						if (properties[i].getDetails() == "Available") {
							System.out.println(properties[i].getDetails());
						}
					}
					}
					

			}else if (option == 7) { //exit program
				System.out.println("Thank you. Exiting now");
				System.exit(0);
			}

		}
		while (true); 

	}
}





