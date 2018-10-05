package objeto.modelo;

import java.util.HashMap;
import java.util.Map;

public class MaterialDAO {
	Map<String, Material> listaMaterial; //a ser definido
	
	public MaterialDAO() {
		listaMaterial = new HashMap<>();
	}
	
	public boolean cadastrarlistaMaterial(String novoMaterial) {
		if(this.listaMaterial.containsKey(novoMaterial)){
			//this.listaMaterial.put(novoMaterial, );
			return true;
		}else
			return false;
	}
	
	public boolean contem(String obj){
		if(!this.listaMaterial.containsKey(obj)){
			return false;
		}return true;
	}
	
	public boolean remove(String obj){
		if(this.contem(obj)) {
			this.listaMaterial.remove(obj);
			return true;
		}
		return false;
	}
 }
