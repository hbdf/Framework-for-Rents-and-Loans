package Controle;

import objeto.modelo.AlunoDAO;
import objeto.modelo.Pessoa;
import objeto.modelo.Aluno;

public class CadastrarAlunoControle {
	public boolean cadastrar(String CPF, String nome, String email, String matricula) {
		Pessoa P = new Aluno(nome, matricula);
		P.setEmail(email);
		P.setCPF(CPF);
		AlunoDAO banco = new AlunoDAO();
		if(matricula.length() == 0 || nome.length() == 0 || banco.verificarAluno(matricula)) {
			System.out.println("Deu Errado");
			return false;
		} else {
			banco.cadastrarAluno(P);
			System.out.println("Pessoa Cadastrada");
			return true;
		}
	}
}
