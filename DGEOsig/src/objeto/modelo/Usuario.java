package objeto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	@Column
	public String cpf;
	@Column
	public String nome;
	@Column
	public String email;
	@Column
	public String matricula;
	
	public String get_cpf() {
		return cpf;
	}
	public void set_cpf(String cpf) {
		this.cpf = cpf;
	}
	public String get_nome() {
		return nome;
	}
	public void set_nome(String nome) {
		this.nome = nome;
	}
	public String get_email() {
		return email;
	}
	public void set_email(String email) {
		this.email = email;
	}
	public String get_matricula() {
		return matricula;
	}
	public void set_matricula(String matricula) {
		this.matricula = matricula;
	}
}
