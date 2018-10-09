package servico;

import java.io.IOException;

import objeto.modelo.LoginDAO;
import objeto.modelo.LoginDAOSemBanco;

public class LoginControle 
{
	public boolean PodeEntrar (String usuario, String senha) throws IOException
	{
		LoginDAO veri = new LoginDAOSemBanco();
		if (veri.temUsuario(usuario) && veri.getSenha(usuario).equals(senha))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}	
