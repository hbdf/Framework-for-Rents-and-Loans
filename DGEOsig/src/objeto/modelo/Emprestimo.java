package objeto.modelo;

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
	int quantidade;
	@Column
	Date inicio;
	@Column
	int prazo;
	
	public Emprestimo () {}

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

	public int get_quantidade() {
		return quantidade;
	}

	public void set_quantidade(int quantidade_material) {
		this.quantidade = quantidade_material;
	}
	
}
