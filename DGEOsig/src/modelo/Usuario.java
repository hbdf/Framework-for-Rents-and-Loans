package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	public String matricula;
	@Column
	public String cpf;
	@Column
	public String nome;
	@Column
	public String email;	
	@Column
	public String tipo;
	
//	protected Boolean isLimitado;
	
/*	protected Emprestimo emprestimoAtivo;
	protected List<Emprestimo> historicoEmprestimos;*/
	
	
	public Usuario () {
		
	}
	
	// Construtor
	public Usuario(String matricula, String cpf, String nome, String email) {
		super();
		
		this.matricula = matricula;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		
		// Todo Requisitante assim que cadastrado n�o deve ter nenhum empr�stimo ativo, logicamente.
		/*this.emprestimoAtivo = null;
		this.historicoEmprestimos = new ArrayList<>();*/
	}
	/*
	// Cria um NOVO empr�stimo.
	public boolean createEmprestimoAtivo(Emprestimo emprestimo) {
		
		if (hasEmprestimoAtivo()) {
			// O requisitante j� possui um Empr�stimo ativo. 
			// Caso queira e possa pegar mais algum material o empr�stimo ATIVO deve ser EDITADO.
			return false;
		}
		
		this.emprestimoAtivo = emprestimo;
		// Empr�stimo criado com sucesso.
		return true;
	}
	
	// Encerra o Empr�stimo ativo/atual.
	public boolean finishEmprestimoAtivo() {
		
		this.historicoEmprestimos.add(emprestimoAtivo);
		this.emprestimoAtivo = null;		
		// Empr�stimo encerrado com sucesso.
		return true;
	}
	
	public boolean hasEmprestimoAtivo() {
		
		if(this.emprestimoAtivo != null) {
			return true;
		}
		
		return false;
	}
	*/
	public String get_cpf() {
		return cpf;
	}
	public void set_cpf(String cpf) {
		this.cpf = cpf;
	}
	public int get_id() {
		return id;
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
	public String get_tipo() {
		return tipo;
	}
	public void set_tipo(String tipo) {
		this.tipo = tipo;
	}
	
}
