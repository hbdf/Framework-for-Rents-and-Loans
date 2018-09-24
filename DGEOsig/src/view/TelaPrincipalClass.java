
package view;

import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaPrincipalClass {
	
	public void open() throws IOException 
	{
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("view/TelaPrincipal.fxml"));
		Scene scene = new Scene (root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	@FXML
    private AnchorPane TelaPrincipal;

    @FXML
    private MenuItem CadastrarAluno;
	
	public void CadastrarAluno(ActionEvent event) {
		TelaCadastrarAluno cad = new TelaCadastrarAluno();
		try {
			cad.open();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}