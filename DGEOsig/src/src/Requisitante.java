package src;

public abstract class Requisitante extends Pessoa{
	String matricula;
	Boolean isLimitado;
	Boolean hasMaterial;
	Emprestimo emprestimoAtivo;
	Emprestimo historicoEmprestimo;
	
	public Requisitante() {
		super();
		
	
	}
}
