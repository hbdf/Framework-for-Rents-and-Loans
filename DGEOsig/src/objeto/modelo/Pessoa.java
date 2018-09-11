package objeto.modelo;

public abstract class Pessoa {
	String CPF;
	String nome;
	String email;
	String matricula;
	public Pessoa(String nome, String mat) {
		this.nome = nome;
		this.matricula = mat;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getMatricula() {
		return matricula;
	}
	public String getCPF() {
		return CPF;
	}
}
