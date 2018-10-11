package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model.Apartment;
import model.PropStatus;
import model.PropertyArray;
import model.RentalProperty;
import model.Suite;

public class PropertyWindow {
	
	Scene scene;
	RentalProperty property;
	static Homescreen homescreen;
	private Apartment apartment;
	//private Suite suite;

	public static void display(String title) {
	Stage window = new Stage();
	
	window.setTitle(title);
	
	
	HBox bottomMenu = new HBox(0);
	bottomMenu.setPrefHeight(50);
	bottomMenu.setPrefWidth(160);
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
	
	VBox rightMenu = new VBox();
	rightMenu.setPrefHeight(50);
	rightMenu.setPrefWidth(160);
	rightMenu.setSpacing(4);
	rightMenu.setPadding(new Insets(10,50,30,10));
	
	Button rentButton = new Button ("Rent");
	rentButton.setOnAction(e -> {System.out.println("socks");//PropertyArray.propArrayList.get(0).setPropStatus(PropStatus.Rented);
		StatusBox.display("Confirmation", "Property successfully Rented");});
	
	
	Button returnButton = new Button ("Return");
	try {
		returnButton.setOnAction(e -> {PropertyArray.propArrayList.get(0).setPropStatus(PropStatus.Available);
		StatusBox.display("Confirmation", "Property successfully Returned");});
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		StatusBox.display("Error", "Property cannot be returned");
	}
	
	Button maintainButton = new Button ("Begin Maintenance");
	maintainButton.setOnAction(e -> {PropertyArray.propArrayList.get(0).setPropStatus(PropStatus.UnderMaintenance);
	StatusBox.display("Confirmation", "Maintenance successfully started");});
	
	Button completeButton = new Button ("Complete Maintenance");
	button4.setOnAction(e -> {PropertyArray.propArrayList.get(0).setPropStatus(PropStatus.Available);
	StatusBox.display("Confirmation", "Maintenance successfully completed");});
	
	rentButton.setMinWidth(rightMenu.getPrefWidth());
	rentButton.setMinHeight(rightMenu.getPrefHeight());
	rentButton.setOpacity(0.9);
	returnButton.setMinWidth(rightMenu.getPrefWidth());
	returnButton.setMinHeight(rightMenu.getPrefHeight());
	returnButton.setOpacity(0.9);
	maintainButton.setMinWidth(rightMenu.getPrefWidth());
	maintainButton.setMinHeight(rightMenu.getPrefHeight());
	maintainButton.setOpacity(0.9);
	completeButton.setMinWidth(rightMenu.getPrefWidth());
	completeButton.setMinHeight(rightMenu.getPrefHeight());
	completeButton.setOpacity(0.9);
		
	
	rightMenu.getChildren().addAll(rentButton, returnButton, maintainButton, completeButton);
	
	ListView <String>list = new ListView<>();
	Suite suite = new Suite();
	list.getItems().addAll("");
	
	
	;
	list.setMaxSize(500, 250);
	list.setFixedCellSize(100);
	
	AnchorPane top = new AnchorPane();
	
	Suite suite1 = new Suite();
	
	
	Label idLabel = new Label("Property ID: " + PropertyArray.propArrayList.get(0).getPropID());
	idLabel.setFont(Font.font("Verdana", 20));
	idLabel.setPadding(new Insets(0,40,20,20));
	
	Label addressLabel = new Label("Address: " + PropertyArray.propArrayList.get(0).getAddress());
	addressLabel.setFont(Font.font("Verdana", 20));
	addressLabel.setPadding(new Insets(20,40,20,20));
	
	Label statusLabel = new Label("Availability: " + PropertyArray.propArrayList.get(0).getPropStatus());
	statusLabel.setFont(Font.font("Verdana", 20));
	statusLabel.setPadding(new Insets(20,40,20,20));
	
	Label roomsLabel = new Label("Number of rooms: " + PropertyArray.propArrayList.get(0).getRooms());
	roomsLabel.setFont(Font.font("Verdana", 20));
	roomsLabel.setPadding(new Insets(20,40,20,20));
	
	Label priceLabel = new Label("Rate: " + PropertyArray.propArrayList.get(0).getRate());
	priceLabel.setFont(Font.font("Verdana", 20));
	priceLabel.setPadding(new Insets(20,40,20,20));
	
	top.getChildren().addAll(idLabel, addressLabel, statusLabel, roomsLabel, priceLabel);
	top.setPadding(new Insets(100));
	
	VBox labels = new VBox();
	labels.getChildren().addAll(idLabel, addressLabel, statusLabel, roomsLabel, priceLabel);
	
	HBox topBox = new HBox();
	ImageView image = new ImageView(PropertyArray.propArrayList.get(6).getImage());
	image.setFitHeight(300);
	image.setFitWidth(600);
	topBox.setPadding(new Insets (30,20,20,20));
//	image.prefHeight(200);
//	image.prefWidth(200);
	topBox.getChildren().addAll(labels, image);
	
	
	
	
	BorderPane border = new BorderPane();
	Scene scene = new Scene (border, 1000, 665);
	
	bottomMenu.setAlignment(Pos.BOTTOM_RIGHT);
	
	border.setBottom(bottomMenu);
	border.setCenter(list);
	border.setTop(topBox);
	border.setRight(rightMenu);
	
	window.setScene(scene);
	window.setResizable(false);
	//scene = new Scene(border, 1000, 665);
	
	window.showAndWait();
}

}
	
	
	
	
	
	
	