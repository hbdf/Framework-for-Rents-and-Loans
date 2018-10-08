package objeto.modelo;


public class Servidor extends Pessoa{
	
	String matriculaSIAPE;
	String login;
	String senha;
	
	public Servidor(String matriculaSIAPE, String nome, String email, String login, String senha) {
		setNome(nome);
		setEmail(email);
		
		//super(nome, email);
		this.matriculaSIAPE = matriculaSIAPE;
		this.login = login;
		this.senha = senha;
	}
	
	public void setMatriculaSIAPE(String matriculaSIAPE) {
		this.matriculaSIAPE = matriculaSIAPE;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	//getters
	public String getMatriculaSIAPE() {
		return matriculaSIAPE;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getSenha() {
		return senha;
	}
}
