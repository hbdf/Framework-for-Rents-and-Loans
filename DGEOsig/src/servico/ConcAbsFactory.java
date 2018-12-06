package servico;

public class ConcAbsFactory implements AbsFactoryRegras{

	public AbsRegrasEmprestimo criar_emprestimo_regra() {
		AbsRegrasEmprestimo ans = new RegrasEmprestimo();
		return ans;
	}
	public AbsRegrasUsuarioControle criar_usuario_regra() {
		AbsRegrasUsuarioControle ans = new RegrasUsuarioControle();
		return ans;
	}
}
