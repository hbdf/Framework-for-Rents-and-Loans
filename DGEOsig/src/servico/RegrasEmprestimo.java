package servico;

import dao.EmprestimoDAO;
import modelo.Material;
import modelo.Usuario;

public class RegrasEmprestimo extends AbsRegrasEmprestimo{

	@Override
	public boolean regras_adicionais(Usuario usuario, Material material, EmprestimoDAO emprestimoDAO) {
		if(usuario.get_tipo().equals("Aluno Graduacao") && emprestimoDAO.get_por_id_usuario(usuario.get_id()) > 0) {
			return false;
		}
		return true;
	}

	@Override
	public void calc_param(Usuario usuario, Material material) {
		// TODO Auto-generated method stub
		
	}
	
}
