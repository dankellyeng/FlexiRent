package view;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FileOpener {
	
	
	
	static Stage fileChoose = new Stage();
	private Desktop desktop = Desktop.getDesktop();
	
	public static void display(String title) {
		Stage window = new Stage();
		
	FileChooser fileChooser = new FileChooser();
	
	fileChooser.showOpenDialog(fileChoose);
	fileChooser.setTitle("Open Resource File");

}

	private void openFile(File file) {
        try {
            desktop.open(file);
        } catch (IOException ex) {
            Logger.getLogger(
            		AddProperty.class.getName()).log(
                    Level.SEVERE, null, ex
                );
}
	}
		}