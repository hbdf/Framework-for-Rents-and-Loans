package servico;

import dao.EmprestimoDAO;
import modelo.Material;
import modelo.Usuario;

public class RegrasEmprestimo extends AbsRegrasEmprestimo{

	@Override
	public boolean regras_adicionais(Usuario usuario, Material material, EmprestimoDAO emprestimoDAO) {
		return true;
	}
	
}
