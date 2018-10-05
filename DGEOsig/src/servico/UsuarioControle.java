package servico;

import java.util.List;

import objeto.modelo.Usuario;
import objeto.modelo.UsuarioDAO;

public class UsuarioControle {
	/*
	 * TODO RELAIZAR O CONTROLE DO USUARIO (CRIAR UM MÉTODO VALIDAÇÃO)
	 */
	public void cadastrar(Usuario usuario) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.cadastrar(usuario);
	}
	public List<Usuario> buscar_matricula(String matricula) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.buscar_matricula(matricula);
	}
	public void remover_matricula(String matricula) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.remover_matricula(matricula);
	}
}
