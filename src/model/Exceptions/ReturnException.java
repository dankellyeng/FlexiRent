package model.Exceptions;


	import view.StatusBox;

	public class ReturnException extends Exception{
		
		public ReturnException(String error) {
		      super(error); 
		      StatusBox.display("Error", error); 
		    
		  } 
		}

