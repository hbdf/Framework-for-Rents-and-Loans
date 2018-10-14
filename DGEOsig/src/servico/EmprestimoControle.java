package servico;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import objeto.modelo.Emprestimo;
import objeto.modelo.EmprestimoDAO;
import objeto.modelo.Material;
import objeto.modelo.Usuario;
import objeto.modelo.UsuarioDAO;

public class EmprestimoControle {
	
	private boolean pode_fazer_emprestimo(Usuario usuario) {
		if(usuario.tipo == "Aluno") {
			UsuarioDAO usuarioDAO = new UsuarioDAO();
			return (usuarioDAO.buscar_matricula(usuario.matricula).size() == 0);
		}
		return true;
	}
	
	
	
	public void cadastrar(String usuario_id, String material_id, int prazo, int quantidade) {
		EmprestimoDAO emprestimoDAO = new EmprestimoDAO();

		Usuario usuario;
		Material material;
		Emprestimo emprestimo;
		UsuarioControle usuario_controle = new UsuarioControle();
		List<Usuario> lst_usuario = usuario_controle.buscar_matricula(usuario_id);
		usuario = lst_usuario.get(0);
		MaterialControle material_controle = MaterialControle.getInstance();
		material = material_controle.buscar_id(Integer.parseInt(material_id));
		if(usuario.tipo == "Aluno" && emprestimoDAO.get_por_id_usuario(usuario.get_id()) > 0) {
			System.out.println("O usuario não pode fazer emprestimo");
			return;
		}
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		emprestimo = new Emprestimo();
		Date date = new Date();
		emprestimo.set_inicio(date);
		emprestimo.set_material(material);
		emprestimo.set_quantidade(quantidade);
		emprestimo.set_prazo(prazo);
		emprestimo.set_usuario(usuario);
		emprestimoDAO.cadastrar(emprestimo);
		System.out.println("email");
		// enviando um email comprovante
		new Email(usuario, material, "Emprestimo").sendEmail();
	}
	
	public void remover(String matricula, String id_material) {
		MaterialControle material_controle = MaterialControle.getInstance();
		Material material = material_controle.buscar_id(Integer.parseInt(id_material));
		Usuario usuario;
		UsuarioControle usuario_controle = new UsuarioControle();
		List<Usuario> lst_usuario = usuario_controle.buscar_matricula(matricula);
		usuario = lst_usuario.get(0);
		EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
		emprestimoDAO.remover(usuario, material);
	}
}
