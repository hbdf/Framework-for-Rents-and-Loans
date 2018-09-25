package Controle;

import objeto.modelo.AlunoDAO;
import objeto.modelo.Pessoa;
import objeto.modelo.Aluno;

public class CadastrarAlunoControle {
	public boolean cadastrar(String CPF, String nome, String email, String matricula) {
		Aluno P = new Aluno(nome, matricula);
		P.setEmail(email);
		P.setCPF(CPF);
		AlunoDAO banco = new AlunoDAO();
		banco.cadastrar(P);
		return true;
	}
	public boolean removerAluno(String chave) {
		//REMOVENDO EM MEMORIA
		return true;
	}
	public Aluno busca(String chave) {
		AlunoDAO banco = new AlunoDAO();
		
		return banco.buscar(chave); //
	}
}
