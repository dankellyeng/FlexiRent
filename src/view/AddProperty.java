package view;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import controller.FlexiRentController;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import model.*;


public class AddProperty{
	private String streetNum;
	private String streetName;
	private String suburb;
	private static String propType;
	private static int rooms;
	private String image;
	private String description;
	private FlexiRentController flexiRentController;
	private ArrayList <RentalRecord> recordList;
	private static RentalProperty property;
	
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
	RadioButton apartmentButton = new RadioButton("Apartment");
	apartmentButton.setToggleGroup(group);
	GridPane.setConstraints(apartmentButton, 1, 0, 1, 1);
	RadioButton suiteButton = new RadioButton("Premium Suite");
	suiteButton.setToggleGroup(group);
	GridPane.setConstraints(suiteButton, 2, 0, 1, 1);
	
	group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
		@Override
		public void changed(ObservableValue<? extends Toggle> ov, Toggle t, Toggle t1) {
			RadioButton check = (RadioButton)t1.getToggleGroup().getSelectedToggle();
			if (check.getText() == "Apartment") {
			String propType = "Apartment";
					} else {
						String propType = "Suite";
				
			
		}}
	});
	
	Label streetNumLabel = new Label("Street Number");
	GridPane.setConstraints(streetNumLabel, 0, 1);
	TextField streetNumField = new TextField();
	streetNumField.setPromptText("e.g. 28B");
	GridPane.setConstraints(streetNumField, 1, 1, 4, 1);
	
	Label streetNameLabel = new Label("Street Name");
	GridPane.setConstraints(streetNameLabel, 0, 2);
	TextField streetNameField = new TextField();
	streetNameField.setPromptText("e.g. Smith Street");
	GridPane.setConstraints(streetNameField, 1, 2, 4, 1);
	
	Label suburbLabel = new Label("Suburb");
	GridPane.setConstraints(suburbLabel, 0, 3);
	TextField suburbField = new TextField();
	suburbField.setPromptText("e.g. Fitzroy");
	GridPane.setConstraints(suburbField, 1, 3, 4, 1);
	
	Label roomsLabel = new Label("Number of rooms");
	GridPane.setConstraints(roomsLabel, 0, 4);
	ComboBox<String> roomBox = new ComboBox<>();
	roomBox.setMinWidth(75);
	roomBox.getItems().addAll("1", "2", "3");
	GridPane.setConstraints(roomBox, 1, 4, 2, 1);
	String result = roomBox.getValue();
	rooms = Integer.parseInt(result);
			
	Label imageLabel = new Label("Select an image:");
	GridPane.setConstraints(imageLabel, 0, 5);
	
	Button imageSelect = new Button("Open File");
	imageSelect.setOnAction(e -> FileOpener.display("sessy d"));
	GridPane.setConstraints(imageSelect, 1, 5);
	
	Label descriptLabel = new Label("Enter Property Description");
	GridPane.setConstraints(descriptLabel, 0, 6);
	TextArea box = new TextArea();
	box.setMaxSize(300, 150);
	GridPane.setConstraints(box, 1, 6, 4, 3);
	
	
	
	String streetNum = streetNumField.getText();
	String streetName = streetNameField.getText();
	String suburb = suburbField.getText();
	String description = box.getText();
	String image = "image";

	//When confirm button is clicked a new property is created from the user input and added to the array list
	Button confirmButton = new Button("Confirm");
//	confirmButton.setOnAction(e -> { property.addProperty(propType, streetNum, streetName, suburb, description, image);
////			System.out.println(streetNumField.getText() + "\n" + street NameField.getText()
//		});
	GridPane.setConstraints(confirmButton, 1, 10);
	
	
	Button cancelButton = new Button("Cancel");
	cancelButton.setOnAction(e-> window.close());
	GridPane.setConstraints(cancelButton, 2, 10);
	
			
	grid.getChildren().addAll(propTypeLabel, apartmentButton, suiteButton, streetNumLabel, streetNumField, streetNameLabel, streetNameField, suburbLabel, suburbField, roomsLabel, roomBox, confirmButton, cancelButton, imageLabel, imageSelect, descriptLabel, box);
	
	HBox bottomMenu = new HBox(0);
	bottomMenu.setPrefHeight(50);
	bottomMenu.setPrefWidth(150);
	bottomMenu.setSpacing(4);
	bottomMenu.setPadding(new Insets(10,50,30,10));
	
	
	//Button Actions for bottom Menu
	Button BackButton = new Button ("Back to Menu");
	BackButton.setOnAction(e -> window.close());
	
	Button SaveButton = new Button ("Save");
	SaveButton.setOnAction(e -> StatusBox.display("Saved", "Data successfully saved"));

	Button ImportButton = new Button ("Import Data");
	ImportButton.setOnAction(e -> System.out.println("Import"));
	
	Button ExportButton = new Button ("Export Data");
	ExportButton.setOnAction(e -> { FileSave.saveInfo();{
		StatusBox.display("Saved", "Data successfully exported");
	}});
	
	Button Quitbutton = new Button ("Quit");
	Quitbutton.setOnAction(e -> {
		boolean result2 = ConfirmBox.display("Exit Program", "Are you sure you want to exit the program?");
		if(result2 == true){
				System.exit(0);}
	});
	
	BackButton.setMinWidth(bottomMenu.getPrefWidth());
	BackButton.setMinHeight(bottomMenu.getPrefHeight());
	BackButton.setOpacity(0.9);
	SaveButton.setMinWidth(bottomMenu.getPrefWidth());
	SaveButton.setMinHeight(bottomMenu.getPrefHeight());
	SaveButton.setOpacity(0.9);
	ImportButton.setMinWidth(bottomMenu.getPrefWidth());
	ImportButton.setMinHeight(bottomMenu.getPrefHeight());
	ImportButton.setOpacity(0.9);
	ExportButton.setMinWidth(bottomMenu.getPrefWidth());
	ExportButton.setMinHeight(bottomMenu.getPrefHeight());
	ExportButton.setOpacity(0.9);
	Quitbutton.setMinWidth(bottomMenu.getPrefWidth());
	Quitbutton.setMinHeight(bottomMenu.getPrefHeight());
	Quitbutton.setOpacity(0.9);
;
	bottomMenu.getChildren().addAll(BackButton, SaveButton, ImportButton, ExportButton, Quitbutton);
	
	
	
	
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


	public String getStreetNum() {
		return streetNum;
	}



	public void setStreetNum(String streetNum) {
	//	streetNum = streetNumField.getText();
	}



	public String getStreetName() {
		return streetName;
	}



	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}



	public String getSuburb() {
		return suburb;
	}



	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}



	public String getPropType() {
		return propType;
	}



	public void setPropType(String propType) {
		this.propType = propType;
	}



	public int getRooms() {
		return rooms;
	}



	public void setRooms(int rooms) {
	//	rooms = Integer.parseInt(roomBox.getValue());
	}



	public void addPropListener(ActionListener actionListener) {
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}


	public ArrayList<RentalRecord> getRecord() {
		return recordList;
	}


	public void setRecord(ArrayList <RentalRecord> recordList) {
		this.recordList = recordList;
	}
	
//	void addConfirmListener(ActionListener listenForConfirm){
//	
//		confirmButton.addActionListener(listenForConfirm);
//		}

}
	

