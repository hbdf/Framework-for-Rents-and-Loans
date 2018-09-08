package src;

public abstract class Pessoa {
	String CPF;
	String nome;
	String email;
	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	
}
