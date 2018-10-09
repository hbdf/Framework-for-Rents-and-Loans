package controle;

import javafx.application.Application;
import javafx.stage.Stage;
import objeto.modelo.Material;
import objeto.modelo.MaterialDAO;


public class Main extends Application {
	@Override
	public void start (Stage primaryStage) {
		new TelaLogin().open();
	}
	public static void main (String[] args) {
	/*	MaterialDAO mat = new MaterialDAO();
		Material ma = new Material(10);
		ma.set_nome("teste1");
		ma.set_quantidade(2);
		ma.set_descricao("o");
		ma.set_serial("serial");
		mat.cadastrar(ma);
		mat.atualizar(ma, 3);
		*/
		launch(args);

	}
}
