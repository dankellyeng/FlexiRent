package view;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model.*;

public class Homescreen1 extends Application{
	
	Stage window;
	Scene scene1;
	
	
	public static void main(String[] args) {
		launch(args);
		
		Suite s1 = new Suite("S_23Brunswick", "23", "Limbic St", "Brunswick", PropStatus.Available);
		Suite s2 = new Suite("S_41Carlton", "41", "Lentil St", "Carlton", PropStatus.Available);
	
	}
	
	public ObservableList<RentalProperty> getProperties(){
		ObservableList<RentalProperty> properties = FXCollections.observableArrayList();
		properties.add(new Suite("S_23Brunswick", "23", "Limbic St", "Brunswick", PropStatus.Available));
		return properties;
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
	window = primaryStage;
	
	TableView<RentalProperty> table = new TableView<>();
	table.setFixedCellSize(105);
	
	
	table.setRowFactory(tv -> {
	    TableRow<RentalProperty> row = new TableRow<>();
	    row.setOnMouseClicked(event -> {
	        if (! row.isEmpty() && event.getButton()==MouseButton.PRIMARY 
	             && event.getClickCount() == 2) {
	            //Property clickedRow = row.getItem();
	            PropertyWindow.display("Property Details");
	        }
	    });
	    return row ;
	});
	
	//Name column
	TableColumn<RentalProperty, String> imageColumn = new TableColumn<> ();
	imageColumn.setMinWidth(200);
	imageColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
	
	
	//Price Column
	TableColumn<RentalProperty, Double> addressColumn = new TableColumn<> ("Price");
	addressColumn.setMinWidth(200);
	addressColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
	
	
	
	Button detailsButton = new Button ("Details");
	detailsButton.setOnAction(e -> PropertyWindow.display("Property Details"));
	
	TableColumn detailsColumn = new TableColumn("Details");
	detailsColumn.setMinWidth(200);
	//detailsColumn.getCellValueFactory(new ) 
	
	
	
	table.setItems(getProperties());
	table.setMaxWidth(750);
	table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
	
	
	//table.set
	table.getColumns().addAll(imageColumn, addressColumn, detailsColumn);
	
	
	HBox bottomMenu = new HBox(0);
	bottomMenu.setPrefHeight(50);
	bottomMenu.setPrefWidth(160);
	bottomMenu.setSpacing(4);
	bottomMenu.setPadding(new Insets(10,50,30,10));
	
	
	Button button1 = new Button ("Add Property");
	button1.setOnAction(e -> AddProperty.display("Add Property"));

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
	
	bottomMenu.getChildren().addAll(button1, button2, button3, button4, button5);
	
	
	HBox search = new HBox();
	search.setPrefHeight(50);
	search.setPrefWidth(150);
	search.setSpacing(4);
	search.setPadding(new Insets(10,10,10,40));
	
	Button searchButton = new Button ("Search");
	searchButton.setOnAction(e -> System.out.println("Search"));
	searchButton.setMinHeight(35);
	searchButton.setMinWidth(100);
	
	TextField searchText = new TextField();
	searchText.setPromptText("Search");
	searchText.setMinWidth(250);
	searchText.setMinHeight(35);
	
	search.getChildren().addAll(searchText, searchButton);
	
	
	BorderPane border = new BorderPane();
//	Image image1 = new Image();
	
	Label welcome = new Label("Welcome to \nFlexi Rent");
	welcome.setFont(Font.font("Verdana", 20));
	welcome.setPadding(new Insets(20,20,20,20));
	
	
	
	
	bottomMenu.setAlignment(Pos.BOTTOM_RIGHT);
	search.setAlignment(Pos.TOP_CENTER);
	border.setBottom(bottomMenu);
	border.setLeft(welcome);
	border.setTop(search);
	border.setCenter(table);
	border.setRight(null);
	
	scene1 = new Scene(border, 1000, 665);
	window.setScene(scene1);
	window.setTitle("Welcome to Flexi Rent");
	window.setResizable(false);
	window.show();
	
	Pane header = (Pane) table.lookup("TableHeaderRow");
	header.setMaxHeight(0);
    header.setMinHeight(0);
    header.setPrefHeight(0);
	
	
	}
	
	
}

