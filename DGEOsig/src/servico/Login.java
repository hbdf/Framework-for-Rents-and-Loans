package servico;

import java.io.IOException;

import controle.TelaPrincipalClass;
import controle.UsuarioNaoCadastradoClass;
import objeto.modelo.LoginDAO;
import objeto.modelo.LoginDAOSemBanco;

public class Login 
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
