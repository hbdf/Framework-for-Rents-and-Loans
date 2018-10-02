package servico;

import objeto.modelo.Pessoa;

public abstract class Requisitante extends Pessoa{
	static String matricula;
	Boolean isLimitado;
	Boolean hasMaterial;
	Emprestimo emprestimoAtivo;
	Emprestimo historicoEmprestimo;
	
	public Requisitante() {
	//	super(matricula, matricula);
		setNome(matricula);
		setMatricula(matricula);
	}
}
