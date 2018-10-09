package controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class TelaAlertaErro {
	
	
	@FXML
    private Label erro;

	@FXML
	public void close(ActionEvent event)
	{
		Stage stage = (Stage) erro.getScene().getWindow(); //Obtendo a janela atual
	    stage.close();
	}

	public void open(){
		try {
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/view/TelaAlertaErro.fxml"));
			Scene scene = new Scene (root);
			primaryStage.setScene(scene);
			primaryStage.show();			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public TelaAlertaErro(String msg) {
		erro.setText("teste");
	}
}
