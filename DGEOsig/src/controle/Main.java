package controle;

import javafx.application.Application;
import javafx.stage.Stage;
import objeto.modelo.Teste;
import servico.TesteController;

public class Main extends Application
{
	@Override
	public void start (Stage primaryStage)  
	{
		new loginClass().open();
	}
	public static void main (String[] args) 
	{
//		System.out.println("Criar");
//		Teste t = new Teste();
//		t.setNome("helio");
//		TesteController con = new TesteController();
//		con.salvar(t);
		launch(args);
	
	}
	
	
}
