package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class AddProperty{
	
	Scene scene;

	public static void display(String title) {
	Stage window = new Stage();
	
	GridPane grid = new GridPane();
	grid.setPadding(new Insets(10,10,10,10));
	grid.setVgap(8);
	grid.setHgap(10);
	grid.setMinWidth(500);
	grid.setMinHeight(500);
	
	Label propTypeLabel = new Label("Property Type");
	GridPane.setConstraints(propTypeLabel, 0, 0);
	final ToggleGroup group = new ToggleGroup();
	RadioButton apartmentButton = new RadioButton("Appartment");
	apartmentButton.setToggleGroup(group);
	GridPane.setConstraints(apartmentButton, 1, 0, 1, 1);
	RadioButton suiteButton = new RadioButton("Premium Suite");
	suiteButton.setToggleGroup(group);
	GridPane.setConstraints(suiteButton, 2, 0, 1, 1);
	
	Label streetNumLabel = new Label("Street Number");
	GridPane.setConstraints(streetNumLabel, 0, 1);
	TextField streetNum = new TextField();
	streetNum.setPromptText("e.g. 28B");
	GridPane.setConstraints(streetNum, 1, 1, 2, 1);
	
	Label streetNameLabel = new Label("Street Name");
	GridPane.setConstraints(streetNameLabel, 0, 2);
	TextField streetName = new TextField();
	streetName.setPromptText("e.g. Smith Street");
	GridPane.setConstraints(streetName, 1, 2, 2, 1);
	
	Label suburbLabel = new Label("Suburb");
	GridPane.setConstraints(suburbLabel, 0, 3);
	TextField suburb = new TextField();
	suburb.setPromptText("e.g. Fitzroy");
	GridPane.setConstraints(suburb, 1, 3, 2, 1);
	
	Label roomsLabel = new Label("Number of rooms");
	GridPane.setConstraints(roomsLabel, 0, 4);
	final ToggleGroup group2 = new ToggleGroup();
	RadioButton oneButton = new RadioButton("1");
	oneButton.setToggleGroup(group2);
	GridPane.setConstraints(oneButton, 1, 4, 1, 1);
	RadioButton twoButton = new RadioButton("2");
	twoButton.setToggleGroup(group2);
	GridPane.setConstraints(twoButton, 2, 4, 1, 1);
	RadioButton threeButton = new RadioButton("3");
	threeButton.setToggleGroup(group2);
	GridPane.setConstraints(threeButton, 3, 4, 1, 1);
	
	
	
	Button confirmButton = new Button("Confirm");
	GridPane.setConstraints(confirmButton, 1, 6);
	
	
	Button cancelButton = new Button("Cancel");
	GridPane.setConstraints(cancelButton, 2, 6);
			
	grid.getChildren().addAll(propTypeLabel, apartmentButton, suiteButton, streetNumLabel, streetNum, streetNameLabel, streetName, suburbLabel, suburb, roomsLabel, oneButton, twoButton, threeButton, confirmButton, cancelButton);
	
	HBox bottomMenu = new HBox(0);
	bottomMenu.setPrefHeight(50);
	bottomMenu.setPrefWidth(150);
	bottomMenu.setSpacing(4);
	bottomMenu.setPadding(new Insets(10,50,30,10));
	
	Button button1 = new Button ("Back to Menu");
	button1.setOnAction(e -> window.close());
	
	Button button2 = new Button ("Save");
	button2.setOnAction(e -> System.out.println("Save"));
	
	Button button3 = new Button ("Import Data");
	button3.setOnAction(e -> System.out.println("Import"));
	
	Button button4 = new Button ("Export Data");
	button4.setOnAction(e -> System.out.println("Export"));
		
	Button button5 = new Button ("Quit");
	button5.setOnAction(e -> {
		boolean result = ConfirmBox.display("Exit Program", "Are you sure you want to exit the program?");
		if(result == true){
				System.exit(0);}
	});
	
	button1.setMinWidth(bottomMenu.getPrefWidth());
	button1.setMinHeight(bottomMenu.getPrefHeight());
	button1.setOpacity(0.9);
	button2.setMinWidth(bottomMenu.getPrefWidth());
	button2.setMinHeight(bottomMenu.getPrefHeight());
	button2.setOpacity(0.9);
	button3.setMinWidth(bottomMenu.getPrefWidth());
	button3.setMinHeight(bottomMenu.getPrefHeight());
	button3.setOpacity(0.9);
	button4.setMinWidth(bottomMenu.getPrefWidth());
	button4.setMinHeight(bottomMenu.getPrefHeight());
	button4.setOpacity(0.9);
	button5.setMinWidth(bottomMenu.getPrefWidth());
	button5.setMinHeight(bottomMenu.getPrefHeight());
	button5.setOpacity(0.9);
;
	bottomMenu.getChildren().addAll(button1, button2, button3, button4, button5);
	
	BorderPane border = new BorderPane();
	bottomMenu.setAlignment(Pos.BOTTOM_RIGHT);
	grid.setAlignment(Pos.CENTER);
	border.setCenter(grid);
	border.setBottom(bottomMenu);
	
	Scene scene = new Scene(border, 1000, 665);
	window.setScene(scene);
	window.setTitle("Add Property");
	window.setResizable(false);
	window.showAndWait();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}