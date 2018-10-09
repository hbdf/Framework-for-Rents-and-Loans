package controle;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import servico.LoginControle;

public class TelaLogin 
{

	LoginControle lg = new LoginControle();
    @FXML
    private TextField tfUsername;

    @FXML
    private PasswordField tfPassword;

    @FXML
    void start(ActionEvent event) 
    {
    	try {
			if(lg.PodeEntrar(tfUsername.getText(), tfPassword.getText()))
			{
				new TelaPrincipalClass().open();
				this.close();
			}
			else 
			{
				// tela de alerta com mensagem de erro.
				TelaAlertaErro erro = new TelaAlertaErro("Usuario ou senha incorreto!");
				erro.open();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    @FXML
    void exit(ActionEvent event) {
    	this.close();
    }
    public void open()  
	{
		
		try {
			Stage primaryStage = new Stage();
			Parent root =  FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
			Scene scene = new Scene (root);
			//scene.getStylesheets().add(getClass().getResource("/view2/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Login");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
    void close ()
    {
    	Stage stage = (Stage) tfUsername.getScene().getWindow(); //Obtendo a janela atual
    	System.out.println("Sai Login");
	    stage.close();
    }
    
}
