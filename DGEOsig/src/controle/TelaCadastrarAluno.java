package controle;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import objeto.modelo.Usuario;
import servico.CadastrarAlunoControle;
import servico.UsuarioControle;

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
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Cadastrar Aluno");
		primaryStage.show();
	}
	
	@FXML
	public void cadastrar (ActionEvent event) {
		Usuario usuario = new Usuario();
		usuario.set_cpf(CPFCadastrar.getText());
		usuario.set_email(EmailCadastrar.getText());
		usuario.set_nome(NomeCadastrar.getText());
		usuario.set_matricula(MatriculaCadastrar.getText());
		usuario.set_tipo("Aluno");
		
		UsuarioControle usuarioControle = new UsuarioControle();
		usuarioControle.cadastrar(usuario);
		Stage stage = (Stage) Cadastrar.getScene().getWindow(); //Obtendo a janela atual
	    stage.close();
		
	}
	@FXML
    void cancelar(ActionEvent event) {
		Stage stage = (Stage) Cadastrar.getScene().getWindow(); //Obtendo a janela atual
	    stage.close();
    }
}
