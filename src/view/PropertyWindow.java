package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PropertyWindow {
	
	Scene scene;

	public static void display(String title) {
	Stage window = new Stage();
	
	window.setTitle(title);
	
	
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
	
	ListView <String>list = new ListView<>();
	list.getItems().addAll("Property History"
			+ "\nRented"
			+ "\nReturned"
			+ "\nMaintained",
					 "Property History"
					+ "\nRented"
					+ "\nReturned"
					+ "\nMaintained",
							 "Property History"
							+ "\nRented"
							+ "\nReturned"
							+ "\nMaintained",
									"Property History"
									+ "\nRented"
									+ "\nReturned"
									+ "\nMaintained" );
	
	
	;
	list.setMaxSize(500, 250);
	list.setFixedCellSize(100);
	
	AnchorPane top = new AnchorPane();
	Label label = new Label("Property Photo and long description");
	label.setFont(Font.font("Verdana", 40));
	label.setPadding(new Insets(20,20,20,20));
	
	top.getChildren().addAll(label);
	top.setPadding(new Insets(100));
	
	BorderPane border = new BorderPane();
	Scene scene = new Scene (border, 1000, 665);
	
	bottomMenu.setAlignment(Pos.BOTTOM_RIGHT);
	
	border.setBottom(bottomMenu);
	border.setCenter(list);
	border.setTop(top);
	
	window.setScene(scene);
	window.setResizable(false);
	//scene = new Scene(border, 1000, 665);
	
	window.showAndWait();
}

}
	
	
	
	
	
	
	