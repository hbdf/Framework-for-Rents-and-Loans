package controle;

import java.util.Stack;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaRealizarEmprestimo {

    @FXML
    private AnchorPane TelaPrincipal;

    @FXML
    private TextField tfMatricula;

    @FXML
    private TextField tfTombamento;

    @FXML
    private TextArea taObservacao;

    @FXML
    private TextField tfQuantidade;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnCancelar;

    @FXML
    void realizarEmprestimo(ActionEvent event) {
    	
    	
    	this.close();
    }

    @FXML
    void cancelar(ActionEvent event) {
    	this.close();
    }
   private void close() {
		Stage stage = (Stage) btnCancelar.getScene().getWindow();
		stage.close();
	}

public void open() {
	   try {
		   Parent root = FXMLLoader.load(getClass().getResource("/view/TelaRealizarEmprestimo.fxml"));
		   Scene scene = new Scene(root);
		   Stage stage = new Stage();
		   stage.setScene(scene);
		   stage.setTitle("Realizar Emprestimo");
		   stage.show();
	   } catch (Exception e) {
		   e.printStackTrace();
	}
   }

}