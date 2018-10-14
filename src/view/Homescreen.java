package view;

import java.io.FileInputStream;
import java.util.function.Predicate;

import javafx.application.Application;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Callback;
import model.*;

public class Homescreen extends Application{
	
	Stage window;
	Scene scene1;
	private RentalProperty property;
	private TextField searchBox;
	static DateTime date;
	
	ObservableList<RentalProperty> list = FXCollections.observableArrayList(PropertyArray.propArrayList);
		
	public static void main(String[] args) {
		PropertyArray.addtoList();
		launch(args);

	}
	

	private TableView<RentalProperty> table = new TableView<RentalProperty>();	

	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) throws Exception {
	window = primaryStage;
	
	//Tooltip appears when hovering over properties to let users know to double click
	table.setRowFactory(tv -> {
	    TableRow<RentalProperty> row = new TableRow<>();
	    Tooltip hover = new Tooltip("Double click to view property details");
	    row.setOnMouseEntered(new EventHandler<MouseEvent>() {
	         @Override
	         public void handle(MouseEvent t) {
	       
	              hover.show(primaryStage);}
	        	 
	        });
	    row.setOnMouseExited(new EventHandler<MouseEvent>() {
	         @Override
	         public void handle(MouseEvent t) {
	        	 
	        	 hover.hide();}
	         
	         
	         });
	  //Allows properties in table to be opened by double clicking on a row         
	    row.setOnMouseClicked(event -> {
	        if (! row.isEmpty() && event.getButton()==MouseButton.PRIMARY 
	             && event.getClickCount() == 2) {
	            RentalProperty clickedRow = row.getItem();
	            PropertyWindow.display(clickedRow.getPropID());
	        }
	    });
	    return row ;
	});

	TableColumn<RentalProperty, ImageView> imageColumn = new TableColumn<RentalProperty, ImageView> ();
	imageColumn.setMinWidth(150);
	imageColumn.setCellValueFactory(new PropertyValueFactory<RentalProperty, ImageView>("image"));
	//imageColumn.setCellValueFactory(new PropertyValueFactory<String, ImageView>(PropertyArray.imageMap.get(property.getPropID()));

	TableColumn<RentalProperty, String> idColumn = new TableColumn<RentalProperty, String> ();
	idColumn.setMinWidth(80);
	idColumn.setCellValueFactory(new PropertyValueFactory<RentalProperty, String>("propID"));
	
	TableColumn<RentalProperty, String> typeColumn = new TableColumn<RentalProperty, String> ();
	typeColumn.setMinWidth(80);
	typeColumn.setCellValueFactory(new PropertyValueFactory<RentalProperty, String>("propTypeLong"));
	
	TableColumn<RentalProperty, String> statusColumn = new TableColumn<RentalProperty, String> ();
	statusColumn.setMinWidth(60);
	statusColumn.setCellValueFactory(new PropertyValueFactory<RentalProperty, String>("propStatus"));

	TableColumn<RentalProperty, String> addressColumn = new TableColumn<RentalProperty, String> ();
	addressColumn.setMinWidth(160);
	addressColumn.setCellValueFactory(new PropertyValueFactory<RentalProperty, String>("address"));
	
//	 class TableViewCell extends TableCell<RentalProperty, Image> {
//	        final ImageView imageView = new ImageView(property.getImage());
//
//	        TableViewCell() {
//	            setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
//	        }
//
//	        @Override
//	        protected void updateItem(Image item, boolean empty) {
//	            super.updateItem(item, empty);
//
//	            if (empty || item == null) {
//	                imageView.setImage(null);
//	                setText(null);
//	                setGraphic(null);
//	            }
//
//	            imageView.setImage(item);
//	            setGraphic(imageView);
//	        
//	    }

//	 };
//	
	
	FilteredList<RentalProperty> filteredList = new FilteredList<RentalProperty>(list);
	

	// to filter table contents
	filteredList.setPredicate(
	    new Predicate<RentalProperty>(){
	        public boolean test(RentalProperty t){
	        	
	            return true;
	        }
	    }
	);
	
	
	table.setMaxWidth(750);
	table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
	table.setFixedCellSize(105);
	table.setItems(list);
	table.getColumns().addAll(imageColumn, idColumn, typeColumn, statusColumn, addressColumn);
	
	//Main Menu
	HBox bottomMenu = new HBox(0);
	bottomMenu.setPrefHeight(50);
	bottomMenu.setPrefWidth(160);
	bottomMenu.setSpacing(4);
	bottomMenu.setPadding(new Insets(10,50,30,10));
	
	Button AddButton = new Button ("Add Property");
	AddButton.setOnAction(e -> AddProperty.display("Add Property"));

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
		boolean result = ConfirmBox.display("Exit Program", "Are you sure you want to exit the program?");
		if(result == true){
				System.exit(0);}
	});
	
	AddButton.setMinWidth(bottomMenu.getPrefWidth());
	AddButton.setMinHeight(bottomMenu.getPrefHeight());
	AddButton.setOpacity(0.9);
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
	
	bottomMenu.getChildren().addAll(AddButton, SaveButton, ImportButton, ExportButton, Quitbutton);
	
	//Search Bar above property display
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
	
	//Hides tableView header bar
	Pane header = (Pane) table.lookup("TableHeaderRow");
	header.setMaxHeight(0);
    header.setMinHeight(0);
    header.setPrefHeight(0);
	}
	

	}
	
	

