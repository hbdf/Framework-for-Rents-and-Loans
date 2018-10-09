package objeto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
public class Material {
	@Id
	@Column
	private int id; // numero de tombamento
	@Column
	String nome;
	@Column
	String serial; 
	@Column
	String descricao;
	@Column
	int quantidade;
	
	public Material () {}
	public Material (int id) {
		this.id = id;
	}
	
	public String get_nome() {
		return nome;
	}
	public int get_id() {
		return id;
	}
	public String get_serial() {
		return serial;
	}
	public String get_descricao() {
		return descricao;
	}
	public int get_quantidade() {
		return quantidade;
	}
	
	public void set_nome(String nome) {
		this.nome = nome;
	}
	
	public void set_serial(String serial) {
		this.serial = serial;
	}
	
	public void set_quantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void set_descricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void update_quantidade(int mudanca) {
		this.quantidade += mudanca;
	}
}
