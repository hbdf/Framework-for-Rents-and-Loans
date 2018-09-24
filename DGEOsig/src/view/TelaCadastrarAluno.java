package view;

import java.io.IOException;

import Controle.CadastrarAlunoControle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaCadastrarAluno {
	@FXML
	private TextField CPFCadastrar;
	@FXML
	private TextField NomeCadastrar;
	@FXML
	private TextField EmailCadastrar;
	@FXML
	private TextField MatriculaCadastrar;
    @FXML
    private TextField UsuarioCadastrar;
	@FXML
	private Button Cadastrar;

	
	public void open() throws IOException {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("view/TelaCadastrarAluno.fxml"));
		Scene scene = new Scene (root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	@FXML
	public void cadastrar (ActionEvent event) {
		CadastrarAlunoControle cad = new CadastrarAlunoControle();
		boolean x = cad.cadastrar(CPFCadastrar.getText(), NomeCadastrar.getText(), EmailCadastrar.getText(), MatriculaCadastrar.getText());
		System.out.println(CPFCadastrar.getText()+" "+ NomeCadastrar.getText()+" "+ EmailCadastrar.getText()+" "+ MatriculaCadastrar.getText());
		if(x) {
			Stage stage = (Stage) Cadastrar.getScene().getWindow(); //Obtendo a janela atual
		    stage.close();
		} else {
			
		}
	}
	@FXML
    void cancelar(ActionEvent event) {
		Stage stage = (Stage) Cadastrar.getScene().getWindow(); //Obtendo a janela atual
	    stage.close();
    }
}
