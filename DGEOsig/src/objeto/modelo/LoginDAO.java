package objeto.modelo;

public interface LoginDAO 
{
	public boolean temUsuario (String usuario);
	public String getSenha (String usuario);
}
