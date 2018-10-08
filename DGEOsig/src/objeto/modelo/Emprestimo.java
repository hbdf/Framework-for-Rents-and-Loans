package objeto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Emprestimo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToMany
	@JoinColumn
	Usuario usuario;
	@ManyToMany
	@JoinColumn
	Material material;
	@Column
	int quantidade;
	
	public Emprestimo () {}

	public int get_id() {
		return id;
	}

	public void set_id(int id) {
		this.id = id;
	}

	public Usuario get_usuario() {
		return usuario;
	}

	public void set_usuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Material get_material() {
		return material;
	}

	public void set_material(Material material) {
		this.material = material;
	}

	public int get_quantidade() {
		return quantidade;
	}

	public void set_quantidade(int quantidade_material) {
		this.quantidade = quantidade_material;
	}
	
}
