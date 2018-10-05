package objeto.modelo;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MaterialDAO {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	public MaterialDAO() {
		emf = Persistence.createEntityManagerFactory("banco");
		em = emf.createEntityManager();
	}
	
	public void cadastrar(Material material) {
		em.getTransaction().begin();
		em.merge(material);
		em.getTransaction().commit();
		emf.close();
	}
	
/*	public boolean contem(String obj){
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
	}*/
 }
