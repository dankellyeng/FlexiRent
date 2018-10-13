package model;

import view.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;



public class FileSave {
	FileWriter writer = null;
	public static void saveInfo() {
try {	
	FileWriter writer = new FileWriter("output.txt");
	for (int i = 0; i< PropertyArray.propArrayList.size(); i++){
	writer.write(PropertyArray.propArrayList.get(i).getPropID() + ":" 
			+ PropertyArray.propArrayList.get(i).getStreetNum() + ":"
			+ PropertyArray.propArrayList.get(i).getStreetName() + ":"
			+ PropertyArray.propArrayList.get(i).getSuburb() + "\n");
	
	
	}
	
	
	writer.close();
	
}catch (IOException e) {
	 StatusBox.display("Error", "Save failed");
}
}
}
