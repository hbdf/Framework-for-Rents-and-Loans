package controle;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class UsuarioNaoCadastradoClass {
	public void open() throws IOException {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("view/UsuarioNaoCadastrado.fxml"));
		Scene scene = new Scene (root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	@FXML
	private Label teste;
	@FXML
	private Button OkButton;
	
	public void CloseWindow(ActionEvent event)
	{
		Stage stage = (Stage) OkButton.getScene().getWindow(); //Obtendo a janela atual
	    stage.close();
	}
}
