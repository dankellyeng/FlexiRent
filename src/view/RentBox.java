package view;

import javafx.stage.*;
import model.PropStatus;
import model.PropertyArray;
import model.RentalProperty;
import model.RentalRecord;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.*;

public class RentBox {
	private static String temp;
	static RentalProperty property;
	static RentalRecord record;

	
	public static void display(String title) {
		Stage window = new Stage();
		
		temp = title;
		
		for(int i = 0; i < PropertyArray.propArrayList.size(); i++) {
			
			if(temp == PropertyArray.propArrayList.get(i).getPropID()){
				System.out.println(temp);
				property = PropertyArray.propArrayList.get(i);}
			}
		
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setVgap(8);
		grid.setHgap(10);
		grid.setMinWidth(500);
		grid.setMinHeight(500);
		
	
		
		Label customerIDLabel = new Label("CustomerID");
		GridPane.setConstraints(customerIDLabel, 0, 0);
		TextField customerIDField = new TextField();
		customerIDField.setPromptText("e.g. JohnBaker23");
		GridPane.setConstraints(customerIDField, 1, 0, 4, 1);
		
		Label rentDaysLabel = new Label("Number of days:");
		GridPane.setConstraints(rentDaysLabel, 0, 1);
		TextField rentDaysField = new TextField();
		rentDaysField.setPromptText("e.g. 4");
		GridPane.setConstraints(rentDaysField, 1, 1, 4, 1);
		
		Label requestLabel = new Label("Special Requests");
		GridPane.setConstraints(requestLabel, 0, 2);
		TextField requestField = new TextField();
		requestField.setPromptText("e.g. Late check-in");
		GridPane.setConstraints(requestField, 1, 2, 4, 1);
		
		
		
		//String custID = customerIDField.getText();
		String rentDays = rentDaysField.getText();
		String requests = requestField.getText();
		
		
		
		Button confirmButton = new Button("Confirm");
		confirmButton.setOnAction(e -> {
				System.out.println(customerIDField.getText() + "\n" + rentDaysField.getText());
				property.setPropStatus(PropStatus.Rented);
				//record.setCustomerID(customerIDField.getText());
				StatusBox.display("Confirmed", "Property " + property.getPropID() + " successfully rented");
				window.close();
		});
		
		GridPane.setConstraints(confirmButton, 1, 4);
		
		
		Button cancelButton = new Button("Cancel");
		cancelButton.setOnAction(e -> window.close());
		
		GridPane.setConstraints(cancelButton, 2, 4);
				
		grid.getChildren().addAll(customerIDLabel, customerIDField, rentDaysLabel, rentDaysField, requestLabel, requestField, confirmButton, cancelButton);
		
		
//		BorderPane border = new BorderPane();
//		//bottomMenu.setAlignment(Pos.BOTTOM_RIGHT);
//		grid.setAlignment(Pos.CENTER);
//		border.setCenter(grid);
		//border.setBottom(bottomMenu);
		
		Scene scene = new Scene(grid, 300, 160);
		window.setScene(scene);
		window.setTitle("Rent Property");
		window.setResizable(false);
		window.showAndWait();
	}
	
}