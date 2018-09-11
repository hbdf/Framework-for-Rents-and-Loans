package view;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TelaPrincipalClass {
	
	public void open() throws IOException 
	{
		Stage primaryStage = new Stage();
		
		System.out.println("Antes");
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("/view/TelaPrincipal.fxml"));
		System.out.println("Passou");
		Scene scene = new Scene (root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();

	}
}
