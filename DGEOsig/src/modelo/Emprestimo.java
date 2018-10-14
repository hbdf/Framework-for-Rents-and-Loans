package modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Emprestimo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@OneToOne
	@JoinColumn(name="usuario")
	Usuario usuario;
	@OneToOne
	@JoinColumn(name="material")
	Material material;
	@Column
	Date inicio;
	@Column
	int prazo;
	@Column
	boolean status;
	
	public Emprestimo () {}

	public Emprestimo (Usuario usuario, Material material, Date inicio, int prazo, boolean status) {
		this.usuario = usuario;
		this.material = material;
		this.inicio = inicio;
		this.prazo = prazo;
		this.status = status;
	}
	
	public boolean get_status() {
		return status;
	}
	
	public void set_status(boolean status) {
		this.status = status;
	}
	
	public int get_prazo() {
		return prazo;
	}

	public void set_prazo(int prazo) {
		this.prazo = prazo;
	}

	public Date get_inicio() {
		return inicio;
	}
	
	public void set_inicio(Date inicio) {
		this.inicio = inicio;
	}

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

}
