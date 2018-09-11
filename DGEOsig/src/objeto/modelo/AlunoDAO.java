package objeto.modelo;

import java.util.HashMap;
import java.util.Map;

public class AlunoDAO {
	Map <String, Pessoa> alunos = new HashMap();
	public void cadastrarAluno(Pessoa p) {
		alunos.put(p.getMatricula(), p);
	}
	public boolean cerificarAluno(String mat) {
		return alunos.containsKey(mat);
	}
}
