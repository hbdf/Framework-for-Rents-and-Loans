package servico;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import objeto.modelo.Emprestimo;
import objeto.modelo.Material;
import objeto.modelo.Usuario;

public class EmprestimoControle {

	Usuario usuario;
	Material material;
	Emprestimo emprestimo;
	
	public void cadastrar(String usuario_id, String material_id, int prazo, int quantidade) {
		UsuarioControle usuario_controle = new UsuarioControle();
		List<Usuario> lst_usuario = usuario_controle.buscar_matricula(usuario_id);
		usuario = lst_usuario.get(0);
		MaterialControle material_controle = new MaterialControle();
		material = material_controle.buscar_id(material_id);
		emprestimo = new Emprestimo();
		Date date = new Date();
		emprestimo.set_inicio(date);
		emprestimo.set_material(material);
		emprestimo.set_quantidade(quantidade);
		emprestimo.set_prazo(prazo);
		emprestimo.set_usuario(usuario);
	}
}
