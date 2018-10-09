package servico;

import objeto.modelo.Material;
import objeto.modelo.MaterialDAO;

public class MaterialControle {
	public void cadastrar(Material material) {
		MaterialDAO materialDAO = new MaterialDAO();
		materialDAO.cadastrar(material);
	}
	public Material buscar_id(String id) {
		MaterialDAO materialDAO = new MaterialDAO();
		//TODO THROWS
		return materialDAO.buscar_id(id).get(0);
	}
	public Material buscar_matricula(String matricula) {
		MaterialDAO materialDAO = new MaterialDAO();
		//TODO THROWS
		return materialDAO.buscar_matricula(matricula).get(0);
	}
}
