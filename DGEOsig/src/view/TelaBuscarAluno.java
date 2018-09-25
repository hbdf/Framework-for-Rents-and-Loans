package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class TelaBuscarAluno {

    @FXML
    private AnchorPane TelaPrincipal;
    @FXML
    private Label lblCPF;
    @FXML
    private Label lblNome;
    @FXML
    private Label lblEmail;
    @FXML
    private Label lblMatricula;
    @FXML
    private Label lblUsuario;
    @FXML
    private Button btnCancelar;
    @FXML
    private Button btnRemover;
    @FXML
    private ChoiceBox<?> cbTipoBusca; // TIPO DE BUSCA // 
    @FXML
    private TextField tfBusca;
    @FXML
    void buscarAluno(ActionEvent event) {
    	tfBusca.getText(); // MATRICULA PARA A BUSCA
    	System.out.println("entrou em busca");
    	btnRemover.setOpacity(1.0); // botao remover aparece apenas quando clicado em remover
    }
    @FXML void remover(ActionEvent event){
    	tfBusca.getText(); // MATRICULA PARA A REMOÇÃO
    	System.out.println("Removeu");
    }

    @FXML
    void cancelar(ActionEvent event) {
    	Stage stage = (Stage) btnCancelar.getScene().getWindow(); //Obtendo a janela atual
	    stage.close();
    }

	public void open() {
		try {
		Stage buscarAluno = new Stage();
		Parent tela = FXMLLoader.load(getClass().getResource("/view/TelaBuscarAluno.fxml"));
		Scene scene = new Scene(tela);
		buscarAluno.setScene(scene);
		buscarAluno.setTitle("BUSCA");
		buscarAluno.show();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
