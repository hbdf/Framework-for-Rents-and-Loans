package servico;

import java.io.IOException;

import controle.UsuarioNaoCadastradoClass;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import objeto.modelo.LoginDAO;
import objeto.modelo.LoginDAOSemBanco;


public class LoginControle {
	
	public boolean PodeEntrar (String usuario, String senha) throws IOException {
		
		LoginDAO veri = new LoginDAOSemBanco();
		
		if (veri.temUsuario(usuario) && veri.getSenha(usuario).equals(senha)) {
			
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/view/TelaPrincipal.fxml"));	
				
				Scene scene = new Scene(root);
//				scene.getStylesheets().add(getClass().getResource("/view_novo/main.css").toExternalForm()); 
				
				Stage primaryStage = new Stage();
				primaryStage.setScene(scene);
				primaryStage.show();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
//			TelaPrincipalClass MainScreen = new TelaPrincipalClass();
//			MainScreen.open();
			return true;
		}
		else {			
			new UsuarioNaoCadastradoClass().open();
			return false;
		}
	}
	
//	public boolean PodeEntrar (String usuario, String senha) throws IOException
//	{
//		LoginDAO veri = new LoginDAOSemBanco();
//		
//		if (veri.temUsuario(usuario) && veri.getSenha(usuario).equals(senha))
//		{
//			return true;
//		}
//		else 
//		{
//			return false;
//		}
//	}
	
}	
