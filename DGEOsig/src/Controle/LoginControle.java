package Controle;

import objeto.modelo.LoginDAO;
import objeto.modelo.LoginDAOSemBanco;

public class LoginControle 
{
	public void PodeEntrar (String usuario, String senha)
	{
		LoginDAO veri = new LoginDAOSemBanco();
		if (veri.temUsuario(usuario) && veri.getSenha(usuario).equals(senha))
		{
			
		}
		else 
		{
			//TODO Show Screen with Wrong User/Password
			
		}
	}
}
