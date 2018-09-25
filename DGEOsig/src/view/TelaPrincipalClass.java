
package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaPrincipalClass {
	
	String usuario;
	
	@FXML
    private AnchorPane TelaPrincipal;
    @FXML
    private MenuItem CadastrarAluno;
    @FXML
    private Label lblServidor;
    @FXML
    private Button btnSair;


	public void open() throws IOException 
	{	

		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("view/TelaPrincipal.fxml"));
		Scene scene = new Scene (root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Tela Principal");
		primaryStage.show();
		System.out.println("OK!");
	}
	public void buscarAluno(ActionEvent event) {
		new TelaBuscarAluno().open();
	}
	public void CadastrarAluno(ActionEvent event) {
		TelaCadastrarAluno cad = new TelaCadastrarAluno();
		try {
			cad.open();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void cadastrarMaterial(ActionEvent event) {
		new TelaCadastrarMaterial().open();
	}
	public void buscarMaterial(ActionEvent event) {
		new TelaBuscarMaterial().open();
	}
	@FXML
    void realizarEmprestimo(ActionEvent event) {
		new TelaRealizarEmprestimo().open();
    }
	@FXML
    void buscarEmprestimo(ActionEvent event) {
		System.out.println("Busca Emprestimo!");
    }
	
	// LOGOUT
	public void sair(ActionEvent event){
		Stage stage = (Stage) btnSair.getScene().getWindow(); //Obtendo a janela atual
    	System.out.println("Voltou pra tela de login");
	    stage.close();
	    Main login = new Main();
	    Stage primaryStage = new Stage();
		login.start(primaryStage );
	}
}