package servico;

import dao.EmprestimoDAO;
import modelo.Material;
import modelo.Usuario;

public abstract class AbsRegrasEmprestimo {
	public abstract boolean regras_adicionais(Usuario usuario, Material material, EmprestimoDAO emprestimoDAO);
	public boolean check_emprestimo(Usuario usuario, Material material, EmprestimoDAO emprestimoDAO) {
		if(emprestimoDAO.get_emprestado_material(material.get_id()) > 0) {
			return false;
		}
		return regras_adicionais(usuario, material, emprestimoDAO); 
		
	}
}
