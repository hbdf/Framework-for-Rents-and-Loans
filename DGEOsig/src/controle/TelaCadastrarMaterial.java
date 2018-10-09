package controle;

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
import objeto.modelo.Material;
import servico.CadastrarMaterialControle;

public class TelaCadastrarMaterial {
    @FXML
    private AnchorPane TelaPrincipal;
    @FXML
    private TextField tfTombamento;
    @FXML
    private TextField tfNome;
    @FXML
    private TextArea taDescricao;
    @FXML
    private TextField tfSerie;
    @FXML
    private Button btnCadastrar;
    @FXML
    private Button btnCancelar;

    @FXML
    void cadastrarMaterial(ActionEvent event) {
    	String numeroTombamento = tfTombamento.getText();
    	String nome = tfNome.getText();
    	String serie = tfSerie.getText();
    	String descricao = taDescricao.getText();
    	
    	Material material = new Material(Integer.parseInt(numeroTombamento));
    	material.set_nome(nome);
    	material.set_serial(serie);
    	material.set_descricao(descricao);
    	CadastrarMaterialControle cadastrar = new CadastrarMaterialControle();
    	cadastrar.cadastrar(material);
    	//close
    	this.close();
    }

    @FXML
    void cancelar(ActionEvent event) {
    	this.close();
    }

	public void open() {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/view/TelaCadastrarMaterial.fxml"));
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setTitle("Cadastrar Material");
			stage.show();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private void close() {
		Stage stage = (Stage) btnCancelar.getScene().getWindow();
    	stage.close();
	}

}
