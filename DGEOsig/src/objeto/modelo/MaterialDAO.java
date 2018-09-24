package objeto.modelo;

import java.util.HashMap;
import java.util.Map;

public class MaterialDAO {
	Map<String, Integer> material;
	
	public MaterialDAO() {
		material = new HashMap<>();
	}
	public boolean cadastrarMaterial(String novoMaterial) {
		if(this.material.containsKey(novoMaterial)){
			this.material.put(novoMaterial, this.material.get(novoMaterial)+1);
			return true;
		}else
			return false;
	}
	public boolean contem(String obj){
		if(!this.material.containsKey(obj)){
			return false;
		}return true;
	}
	public boolean remove(String obj){
		if(this.contem(obj)) {
			this.material.remove(obj);
			return true;
		}
		return false;
	}
 }
