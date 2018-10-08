package view;

import java.io.FileInputStream;

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
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model.*;

public class Homescreen extends Application{
	
	Stage window;
	Scene scene1;
	RentalProperty property;
	Suite suite;
	Apartment apartment;
	PropertyArray propArraylist = new PropertyArray();
	
	private ObservableList<RentalProperty> getProperties(){
	Suite s1 = new Suite("S_23Brunswick", "23", "Albert St", "Brunswick", PropStatus.Available, "Albertstreet.jpg", "This premium suite has a microwave that you are allowed to use! (Accepts 4x $2 coins).");
	
	Suite s2 = new Suite("S_41Port Melbourne", "41", "Beach St", "Port Melbourne", PropStatus.Available, "Beachstreet.jpg", "This luxurious premium suite is right in the heart of the city and won't disappoint.\n" + 
			"" );
	Suite s3 = new Suite("S_13Carlton", "13", "Brick Drive", "Carlton", PropStatus.Available, "Brickdrive.jpg", "This amazing premium suite offers a once in a lifetime experience for all visitors.\n" + 
			"");
	Suite s4 = new Suite("S_24Carlton North", "24", "Clarendon St", "Carlton North", PropStatus.Available, "Clarendonstreet.jpg", "This wonderful premium suite has everything you need to relax and feel at home.\n" + 
			"");
	Suite s5 = new Suite("S_41Northcote", "44", "Dods St", "Northcote", PropStatus.Available, "Dodsstreet.jpg", "This fantastic premium suite will make you feel like a movie star living the dream.\n" + 
			"");
	
	Apartment a1 = new Apartment ("A_82Brunswick", "82", "Kavanagh St", "Brunswick", PropStatus.Available, 2, 2, 210, 315, "Kavanaghstreet.jpg", "This quaint little apartment is centrally located and great for those on a budget.\n" + 
			"");
	Apartment a2 = new Apartment ("A_27Carlton", "27", "Luxury St", "Carlton", PropStatus.Available, 2, 2, 210, 315, "Luxuraystreet.jpg", "This recently renovated apartment features all new appliances and a pool too.\n" + 
			"");
	Apartment a3 = new Apartment ("A_13Thornbury", "13", "Park St", "Thornbury", PropStatus.Available, 2, 2, 210, 315, "Parkstreet.jpg", "This apartment is perfect for winter getaways as well as sweet summer vacations. \n" +
			"");
	Apartment a4 = new Apartment ("A_5Parkville", "5", "Rakaia Way", "Parkville", PropStatus.Available, 2, 2, 210, 315, "Rakaiaway.jpg", "This apartment will not disappoint with its spacious bedrooms and wonderful kitchen.\n" + 
			"");
	Apartment a5 = new Apartment ("A_66Fitzroy", "66", "Southbank Rd", "Fitzroy", PropStatus.Available, 2, 2, 210, 315, "Southbankroad.jpg","This wonderful apartment has 3 gigantic bedrooms and a huge entertaining area.\n" + 
			"" );
	Apartment a6 = new Apartment ("A_7Flemington", "7", "Stuart St", "Flemington", PropStatus.Available, 2, 2, 210, 315, "Stuartstreet.jpg", "This great apartment features beautiful views of the city skyline and has a pool.\n" + 
			"" );
	Apartment a7 = new Apartment ("A_17Alphington", "17", "Sydney Ave", "Alphington", PropStatus.Available, 2, 2, 210, 315, "Sydneyavenue.jpg", "This amazing apartment has all you need to relax including a gigantic spa bath.\n" + 
			"");
	Apartment a8 = new Apartment ("A_23Brunswick", "23", "Sydney Rd", "Brunswick", PropStatus.Available, 2, 2, 210, 315, "Sydneyroad.jpg", "This fantastic apartment has a private balcony and a 55 inch television.\n" + 
			"");
	Apartment a9 = new Apartment ("A_45Brunswick West", "45", "Union St", "Brunswick West", PropStatus.Available, 2, 2, 210, 315, "Unionstreet.jpg", "This beautiful apartment is well-lit and spacious with a great back yard.\n" + 
			"");
	Apartment a10 = new Apartment ("A_54Carlton", "54", "Victoria St", "Carlton", PropStatus.Available, 2, 2, 210, 315, "Victoriastreet.jpg", "This stunning rental property is recently renovated and has plenty of room.\n" + 
			"");
	
	ObservableList<RentalProperty> list = FXCollections.observableArrayList(s1, s2, s3, s4, s5, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
	return list;
	}
 	
//	static Suite s1 = new Suite("S_23Brunswick", "23", "Albert St", "Brunswick", PropStatus.Available, "Albertstreet.jpg", "This premium suite has a microwave that you are allowed to use! (Accepts 4x $2 coins).");
//	
//	static Suite s2 = new Suite("S_41Port Melbourne", "41", "Beach St", "Port Melbourne", PropStatus.Available, "Beachstreet.jpg", "This luxurious premium suite is right in the heart of the city and won't disappoint.\n" + 
//			"" );
//	static Suite s3 = new Suite("S_13Carlton", "13", "Brick Drive", "Carlton", PropStatus.Available, "Brickdrive.jpg", "This amazing premium suite offers a once in a lifetime experience for all visitors.\n" + 
//			"");
//	static Suite s4 = new Suite("S_24Carlton North", "24", "Clarendon St", "Carlton North", PropStatus.Available, "Clarendonstreet.jpg", "This wonderful premium suite has everything you need to relax and feel at home.\n" + 
//			"");
//	static Suite s5 = new Suite("S_41Northcote", "44", "Dods St", "Northcote", PropStatus.Available, "Dodsstreet.jpg", "This fantastic premium suite will make you feel like a movie star living the dream.\n" + 
//			"");
//	
//	static Apartment a1 = new Apartment ("A_82Brunswick", "82", "Kavanagh St", "Brunswick", PropStatus.Available, 2, 2, 210, 315, "Kavanaghstreet.jpg", "This quaint little apartment is centrally located and great for those on a budget.\n" + 
//			"");
//	static Apartment a2 = new Apartment ("A_27Carlton", "27", "Luxury St", "Carlton", PropStatus.Available, 2, 2, 210, 315, "Luxuraystreet.jpg", "This recently renovated apartment features all new appliances and a pool too.\n" + 
//			"");
//	static Apartment a3 = new Apartment ("A_13Thornbury", "13", "Park St", "Thornbury", PropStatus.Available, 2, 2, 210, 315, "Parkstreet.jpg", "This apartment is perfect for winter getaways as well as sweet summer vacations. \n" +
//			"");
//	static Apartment a4 = new Apartment ("A_5Parkville", "5", "Rakaia Way", "Parkville", PropStatus.Available, 2, 2, 210, 315, "Rakaiaway.jpg", "This apartment will not disappoint with its spacious bedrooms and wonderful kitchen.\n" + 
//			"");
//	static Apartment a5 = new Apartment ("A_66Fitzroy", "66", "Southbank Rd", "Fitzroy", PropStatus.Available, 2, 2, 210, 315, "Southbankroad.jpg","This wonderful apartment has 3 gigantic bedrooms and a huge entertaining area.\n" + 
//			"" );
//	static Apartment a6 = new Apartment ("A_7Flemington", "7", "Stuart St", "Flemington", PropStatus.Available, 2, 2, 210, 315, "Stuartstreet.jpg", "This great apartment features beautiful views of the city skyline and has a pool.\n" + 
//			"" );
//	static Apartment a7 = new Apartment ("A_17Alphington", "17", "Sydney Ave", "Alphington", PropStatus.Available, 2, 2, 210, 315, "Sydneyavenue.jpg", "This amazing apartment has all you need to relax including a gigantic spa bath.\n" + 
//			"");
//	static Apartment a8 = new Apartment ("A_23Brunswick", "23", "Sydney Rd", "Brunswick", PropStatus.Available, 2, 2, 210, 315, "Sydneyroad.jpg", "This fantastic apartment has a private balcony and a 55 inch television.\n" + 
//			"");
//	static Apartment a9 = new Apartment ("A_45Brunswick West", "45", "Union St", "Brunswick West", PropStatus.Available, 2, 2, 210, 315, "Unionstreet.jpg", "This beautiful apartment is well-lit and spacious with a great back yard.\n" + 
//			"");
//	static Apartment a10 = new Apartment ("A_54Carlton", "54", "Victoria St", "Carlton", PropStatus.Available, 2, 2, 210, 315, "Victoriastreet.jpg", "This stunning rental property is recently renovated and has plenty of room.\n" + 
//			"");
	
	public static void main(String[] args) {
		launch(args);
		
//	PropertyArray propArraylist = new PropertyArray();
	Suite suite1 = new Suite();
	
//	PropertyArray.addtoList(s1);
//	PropertyArray.addtoList(s2);
//	PropertyArray.addtoList(s3);
//	PropertyArray.addtoList(s4);
//	PropertyArray.addtoList(s5);
//	PropertyArray.addtoList(a1);
//	PropertyArray.addtoList(a2);
//	PropertyArray.addtoList(a3);
//	PropertyArray.addtoList(a4);
//	PropertyArray.addtoList(a5);
//	PropertyArray.addtoList(a6);
//	PropertyArray.addtoList(a7);
//	PropertyArray.addtoList(a8);
//	PropertyArray.addtoList(a9);
//	PropertyArray.addtoList(a10);
		//System.out.println(PropertyArray.propArrayList.get(0).getPropID());
		//Suite s1 = new Suite("S_23Brunswick", "23", "Limbic St", "Brunswick", PropStatus.Available);
		//Suite s2 = new Suite("S_41Carlton", "41", "Lentil St", "Carlton", PropStatus.Available);
	
	}
	

	private TableView<RentalProperty> table = new TableView<RentalProperty>();	
	//private ObservableList<RentalProperty> properties = FXCollections.observableArrayList(propArraylist);
//		new Suite("S_23Brunswick", "23", "Albert St", "Brunswick", PropStatus.Available, "Albertstreet.jpg", "This premium suite has a microwave that you are allowed to use! (Accepts 4x $2 coins)."),
//		new Suite("S_41Port Melbourne", "41", "Beach St", "Port Melbourne", PropStatus.Available, "Beachstreet.jpg", "This luxurious premium suite is right in the heart of the city and won't disappoint.\n" + 
//				"" ),
//		new Suite("S_13Carlton", "13", "Brick Drive", "Carlton", PropStatus.Available, "Brickdrive.jpg", "This amazing premium suite offers a once in a lifetime experience for all visitors.\n" + 
//				""),
//		new Suite("S_24Carlton North", "24", "Clarendon St", "Carlton North", PropStatus.Available, "Clarendonstreet.jpg", "This wonderful premium suite has everything you need to relax and feel at home.\n" + 
//				""),
//		new Suite("S_41Northcote", "44", "Dods St", "Northcote", PropStatus.Available, "Dodsstreet.jpg", "This fantastic premium suite will make you feel like a movie star living the dream.\n" + 
//				""),
//		new Apartment ("A_82Brunswick", "82", "Kavanagh St", "Brunswick", PropStatus.Available, 2, 2, 210, 315, "Kavanaghstreet.jpg", "This quaint little apartment is centrally located and great for those on a budget.\n" + 
//				""),
//		new Apartment ("A_27Carlton", "27", "Luxury St", "Carlton", PropStatus.Available, 2, 2, 210, 315, "Luxuraystreet.jpg", "This recently renovated apartment features all new appliances and a pool too.\n" + 
//				""),
//		new Apartment ("A_13Thornbury", "13", "Park St", "Thornbury", PropStatus.Available, 2, 2, 210, 315, "Parkstreet.jpg", "This apartment is perfect for winter getaways as well as sweet summer vacations. \n" +
//				""),
//		new Apartment ("A_5Parkville", "5", "Rakaia Way", "Parkville", PropStatus.Available, 2, 2, 210, 315, "Rakaiaway.jpg", "This apartment will not disappoint with its spacious bedrooms and wonderful kitchen.\n" + 
//				""),
//		new Apartment ("A_66Fitzroy", "66", "Southbank Rd", "Fitzroy", PropStatus.Available, 2, 2, 210, 315, "Southbankroad.jpg","This wonderful apartment has 3 gigantic bedrooms and a huge entertaining area.\n" + 
//				"" ),
//		new Apartment ("A_7Flemington", "7", "Stuart St", "Flemington", PropStatus.Available, 2, 2, 210, 315, "Stuartstreet.jpg", "This great apartment features beautiful views of the city skyline and has a pool.\n" + 
//				"" ),
//		new Apartment ("A_17Alphington", "17", "Sydney Ave", "Alphington", PropStatus.Available, 2, 2, 210, 315, "Sydneyavenue.jpg", "This amazing apartment has all you need to relax including a gigantic spa bath.\n" + 
//				""),
//		new Apartment ("A_23Brunswick", "23", "Sydney Rd", "Brunswick", PropStatus.Available, 2, 2, 210, 315, "Sydneyroad.jpg", "This fantastic apartment has a private balcony and a 55 inch television.\n" + 
//				""),
//		new Apartment ("A_45Brunswick West", "45", "Union St", "Brunswick West", PropStatus.Available, 2, 2, 210, 315, "Unionstreet.jpg", "This beautiful apartment is well-lit and spacious with a great back yard.\n" + 
//				""),
//		new Apartment ("A_54Carlton", "54", "Victoria St", "Carlton", PropStatus.Available, 2, 2, 210, 315, "Victoriastreet.jpg", "This stunning rental property is recently renovated and has plenty of room.\n" + 
//				""));
		
		//return properties;
	//}
	
	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) throws Exception {
	window = primaryStage;
	
//	TableView<RentalProperty> table = new TableView<RentalProperty>();
	
	
	table.setRowFactory(tv -> {
	    TableRow<RentalProperty> row = new TableRow<>();
	    row.setOnMouseClicked(event -> {
	        if (! row.isEmpty() && event.getButton()==MouseButton.PRIMARY 
	             && event.getClickCount() == 2) {
	            RentalProperty clickedRow = row.getItem();
	            PropertyWindow.display("Property Details");
	        }
	    });
	    return row ;
	});
	Image image1 = new Image("imagecomingsoon.jpg");
	//Name column
	TableColumn<RentalProperty, Image> imageColumn = new TableColumn<RentalProperty, Image> ();
	imageColumn.setMinWidth(200);
	imageColumn.setCellValueFactory(new PropertyValueFactory<RentalProperty, Image>("image"));
	//Image image1 = new Image(new FileInputStream("image-coming-soon.jpg"));
	
	//Price Column
	TableColumn<RentalProperty, String> addressColumn = new TableColumn<RentalProperty, String> ("Price");
	addressColumn.setMinWidth(200);
	addressColumn.setCellValueFactory(new PropertyValueFactory<RentalProperty, String>("propID"));
	
	
	
	Button detailsButton = new Button ("Details");
	detailsButton.setOnAction(e -> PropertyWindow.display("Property Details"));
	//Details Column
	TableColumn <RentalProperty, String> detailsColumn = new TableColumn<RentalProperty, String>("Details");
	detailsColumn.setMinWidth(200);
	detailsColumn.setCellValueFactory(new PropertyValueFactory<RentalProperty, String>("details")); 
	
	
	
	
	table.setMaxWidth(750);
	table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
	
	table.setFixedCellSize(105);
	ObservableList<RentalProperty> list = getProperties();
	table.setItems(list);
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
	
//	Suite s1 = new Suite("S_23Brunswick", "23", "Albert St", "Brunswick", PropStatus.Available, "Albertstreet.jpg", "This premium suite has a microwave that you are allowed to use! (Accepts 4x $2 coins).");
	
//	
//	Suite s2 = new Suite("S_41Port Melbourne", "41", "Beach St", "Port Melbourne", PropStatus.Available, "Beachstreet.jpg", "This luxurious premium suite is right in the heart of the city and won't disappoint.\n" + 
//			"" );
//	Suite s3 = new Suite("S_13Carlton", "13", "Brick Drive", "Carlton", PropStatus.Available, "Brickdrive.jpg", "This amazing premium suite offers a once in a lifetime experience for all visitors.\n" + 
//			"");
//	Suite s4 = new Suite("S_24Carlton North", "24", "Clarendon St", "Carlton North", PropStatus.Available, "Clarendonstreet.jpg", "This wonderful premium suite has everything you need to relax and feel at home.\n" + 
//			"");
//	Suite s5 = new Suite("S_41Northcote", "44", "Dods St", "Northcote", PropStatus.Available, "Dodsstreet.jpg", "This fantastic premium suite will make you feel like a movie star living the dream.\n" + 
//			"");
//	
//	Apartment a1 = new Apartment ("A_82Brunswick", "82", "Kavanagh St", "Brunswick", PropStatus.Available, 2, 2, 210, 315, "Kavanaghstreet.jpg", "This quaint little apartment is centrally located and great for those on a budget.\n" + 
//			"");
//	Apartment a2 = new Apartment ("A_27Carlton", "27", "Luxury St", "Carlton", PropStatus.Available, 2, 2, 210, 315, "Luxuraystreet.jpg", "This recently renovated apartment features all new appliances and a pool too.\n" + 
//			"");
//	Apartment a3 = new Apartment ("A_13Thornbury", "13", "Park St", "Thornbury", PropStatus.Available, 2, 2, 210, 315, "Parkstreet.jpg", "This apartment is perfect for winter getaways as well as sweet summer vacations. \n" +
//			"");
//	Apartment a4 = new Apartment ("A_5Parkville", "5", "Rakaia Way", "Parkville", PropStatus.Available, 2, 2, 210, 315, "Rakaiaway.jpg", "This apartment will not disappoint with its spacious bedrooms and wonderful kitchen.\n" + 
//			"");
//	Apartment a5 = new Apartment ("A_66Fitzroy", "66", "Southbank Rd", "Fitzroy", PropStatus.Available, 2, 2, 210, 315, "Southbankroad.jpg","This wonderful apartment has 3 gigantic bedrooms and a huge entertaining area.\n" + 
//			"" );
//	Apartment a6 = new Apartment ("A_7Flemington", "7", "Stuart St", "Flemington", PropStatus.Available, 2, 2, 210, 315, "Stuartstreet.jpg", "This great apartment features beautiful views of the city skyline and has a pool.\n" + 
//			"" );
//	Apartment a7 = new Apartment ("A_17Alphington", "17", "Sydney Ave", "Alphington", PropStatus.Available, 2, 2, 210, 315, "Sydneyavenue.jpg", "This amazing apartment has all you need to relax including a gigantic spa bath.\n" + 
//			"");
//	Apartment a8 = new Apartment ("A_23Brunswick", "23", "Sydney Rd", "Brunswick", PropStatus.Available, 2, 2, 210, 315, "Sydneyroad.jpg", "This fantastic apartment has a private balcony and a 55 inch television.\n" + 
//			"");
//	Apartment a9 = new Apartment ("A_45Brunswick West", "45", "Union St", "Brunswick West", PropStatus.Available, 2, 2, 210, 315, "Unionstreet.jpg", "This beautiful apartment is well-lit and spacious with a great back yard.\n" + 
//			"");
//	Apartment a10 = new Apartment ("A_54Carlton", "54", "Victoria St", "Carlton", PropStatus.Available, 2, 2, 210, 315, "Victoriastreet.jpg", "This stunning rental property is recently renovated and has plenty of room.\n" + 
//			"");
	}
	


