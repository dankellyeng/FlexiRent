package model.Exceptions;

import view.StatusBox;

public class RentException extends Exception{
	
	public RentException(String error) {
	      super(error); 
	      StatusBox.display("Error", error); 
	    
	  } 
	}


