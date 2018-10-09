package controle;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class TelaAlertaErro implements Initializable {
		
	@FXML
    private Label mensagemLabel;
    @FXML
    private JFXButton okButton;
    
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
    	try {
			Parent root = FXMLLoader.load(getClass().getResource("/view/TelaAlertaErro.fxml"));
			
			Scene scene = new Scene (root);			
			
			Stage primaryStage = new Stage();
			primaryStage.setScene(scene);
			primaryStage.show();			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public TelaAlertaErro(String msg) {
		
		mensagemLabel.setText(msg);
	}
	
    @FXML
    void okButtonAction(ActionEvent event) {
    	Stage stage = (Stage) mensagemLabel.getScene().getWindow(); //Obtendo a janela atual
	    stage.close();
    }
	
}
