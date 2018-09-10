package view;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class loginClass 
{

    @FXML
    private TextField login;

    @FXML
    private Label logo;

    @FXML
    private Button start;

    @FXML
    void start(ActionEvent event) 
    {
    	System.out.println("teste");
    }

}
