package view;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.geometry.*;

public class StatusBox {
	
	static boolean answer;

	public static boolean display(String title, String message) {
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		Label label = new Label();
		label.setText(message);
		
		//Two buttons
		Button okayButton = new Button("Okay");
		
		
		okayButton.setOnAction(e -> {
			answer = true;
			window.close();
		});
		
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, okayButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
		
		return answer;
	}
	
}