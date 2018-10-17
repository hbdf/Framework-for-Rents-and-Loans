package servico;

import java.util.List;

import dao.UsuarioDAO;
import modelo.Usuario;



public final class UsuarioControle {
	
	/*
	 * TODO RELAIZAR O CONTROLE DO USUARIO (CRIAR UM MÉTODO VALIDAÇÃO)
	 */
	
	private static UsuarioControle instance;
	public static UsuarioControle getInstance() {
		if(instance == null) {
			instance = new UsuarioControle();
		}
		return instance;
	}
	private UsuarioControle () {}
	void CamposVazios(Usuario usuario) throws Exception{
		if(usuario.get_cpf().isEmpty() || usuario.get_email().isEmpty() || usuario.get_matricula().isEmpty() || usuario.get_nome().isEmpty()) {
			throw new Exception("Todos os campos devem ser preenchidos");
		}
	}
	public void cadastrar(Usuario usuario) throws Exception {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		CamposVazios(usuario);
		if(usuarioDAO.buscar_matricula(usuario.get_matricula()).size() > 0) {
			throw new Exception("Matricual Já cadastrada!");
		}
		usuarioDAO.cadastrar(usuario);
	}
	public List<Usuario> buscar_matricula(String matricula) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.buscar_matricula(matricula);
	}
	public List<Usuario> buscar_CPF(String CPF) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.buscar_CPF(CPF);
	}
	
	public List<Usuario> buscar() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.buscar();
	}
	
	public void remover_matricula(String matricula) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.remover_matricula(matricula);
	}
}
