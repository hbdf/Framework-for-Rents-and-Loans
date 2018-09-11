package view;
import java.io.IOException;

import Controle.LoginControle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginClass 
{

	LoginControle lg = new LoginControle();
    @FXML
    private TextField login;

    @FXML
    private PasswordField senha;
    
    @FXML
    private Label logo;

    @FXML
    private Button start;

    @FXML
    void start(ActionEvent event) 
    {
    	try {
			lg.PodeEntrar(login.getText(), senha.getText());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
