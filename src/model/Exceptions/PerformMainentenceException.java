package model.Exceptions;

	import view.StatusBox;

public class PerformMainentenceException extends Exception{
		
		public PerformMainentenceException(String error) {
		      super(error); 
		      StatusBox.display("Error", error); 
		    
		  } 
		}