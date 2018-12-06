package controle;

import javafx.application.Application;
import javafx.stage.Stage;
import servico.AbsFactoryRegras;
import servico.ConcAbsFactory;


public class Main extends Application {

	AbsFactoryRegras rules = new ConcAbsFactory();
	@Override
	public void start (Stage primaryStage) {
		new TelaLogin().open();
	}
	public static void main (String[] args) {
		
		launch(args);

	}
}
