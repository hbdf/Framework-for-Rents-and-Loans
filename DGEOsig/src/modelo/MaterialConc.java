package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="Material")
public class MaterialConc extends Material{
	public MaterialConc () {}
	public MaterialConc (int id) {
		set_id(id);
	}
	
	public MaterialConc(int id, String nome) {
		set_id(id);
		set_nome(nome);
	}
/*	@Column
	String aleatorio;
	public void set_aleatorio(String aleatorio) {
		this.aleatorio = aleatorio;
	}
	public String get_aleatorio() {
		return aleatorio;
	}*/
}
