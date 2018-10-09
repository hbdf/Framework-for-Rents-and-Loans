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
}
