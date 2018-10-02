package controle;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import objeto.modelo.Aluno;
import servico.CadastrarAlunoControle;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class TelaBuscarAluno implements Initializable{

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
    private Label lblAlertaModoBusca;
    @FXML
    private ComboBox<String> cbTipoBusca; // TIPO DE BUSCA // 
    private ObservableList<String> list = FXCollections.observableArrayList("Matrícula", "CPF", "Nome");
    @FXML
    private TextField tfBusca;
    @FXML
    void buscarAluno(ActionEvent event) {
    	String chave = tfBusca.getText(); // MATRICULA PARA A BUSCA
    	Aluno al = new CadastrarAlunoControle().busca(chave);
    //	System.out.println(al.getCPF());
    	lblCPF.setText(al.getCPF());
    	lblEmail.setText(al.getEmail());
    	lblMatricula.setText(al.getMatricula());
    	lblNome.setText(al.getNome());
    	System.out.println("entrou em busca");
    	btnRemover.setOpacity(1.0); // botao remover aparece apenas quando clicado em remover
    }
    @FXML void remover(ActionEvent event){
    	String chave = tfBusca.getText(); // MATRICULA PARA A REMOÇÃO
    	new CadastrarAlunoControle().removerAluno(chave);
    	System.out.println("Removeu");
    	
    	this.close();
    }

    @FXML
    void cancelar(ActionEvent event) {
    	this.close();
    }

	private void close() {
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
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		cbTipoBusca.setItems(list);
		cbTipoBusca.setValue("Matrícula");
		tfBusca.setPromptText(cbTipoBusca.getValue());
	}
	public void tipoBuscaMudou(ActionEvent event) {
		tfBusca.setPromptText(cbTipoBusca.getValue());
	}
	
	//AINDA NAO DEFINIDA A LOGICA PARA A BUSCA POIS FALTA CRIAR AS FUNÇÕES DE BUSCA PARA CADA TIPO
	// AINDA NAO SENDO UTILIZADA
	public void buscarAlunoPor(ActionEvent event) {
    	String id = tfBusca.getText(); // ID DA BUSCA
    	String chave = cbTipoBusca.getValue();
    	System.out.println(chave +" "+ id);
//    	Aluno al = new CadastrarAlunoControle().busca(chave);
//    //	System.out.println(al.getCPF());
//    	lblCPF.setText(al.getCPF());
//    	lblEmail.setText(al.getEmail());
//    	lblMatricula.setText(al.getMatricula());
//    	lblNome.setText(al.getNome());
//    	System.out.println("entrou em busca");
//    	btnRemover.setOpacity(1.0); // botao remover aparece apenas quando clicado em remover
    }

}
