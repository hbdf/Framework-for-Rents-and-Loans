package servico;

import java.util.Date;

import objeto.modelo.Material;
import objeto.modelo.Usuario;

public class EmprestimoControle {

	Usuario usuario;
	Date data;
	int prazo, quantidade;
	Material material;
	
	public EmprestimoControle(String usuario_id, String material_id, int prazo, int quantidade) {
		this.prazo = prazo;
		this.quantidade = quantidade;
		
	}
}
