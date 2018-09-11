package Controle;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import objeto.modelo.LoginDAO;
import objeto.modelo.LoginDAOSemBanco;
import view.TelaPrincipalClass;
import view.UsuarioNaoCadastradoClass;

public class LoginControle 
{
	public boolean PodeEntrar (String usuario, String senha) throws IOException
	{
		LoginDAO veri = new LoginDAOSemBanco();
		if (veri.temUsuario(usuario) && veri.getSenha(usuario).equals(senha))
		{
			TelaPrincipalClass MainScreen = new TelaPrincipalClass();
			MainScreen.open();
			return true;
		}
		else 
		{
			UsuarioNaoCadastradoClass erro = new UsuarioNaoCadastradoClass();
			erro.open();
			return false;
		}
	}
}	
