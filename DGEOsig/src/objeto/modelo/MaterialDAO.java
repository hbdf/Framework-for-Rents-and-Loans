package objeto.modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
	
	public List<Material> buscar_id(String id) {
		em.getTransaction().begin();
		Query q =  em.createQuery("select material from Material material where id = " + id);
		List<Material> l = q.getResultList();
		em.getTransaction().commit();
		emf.close();
		return l;
	}
	
	public void atualizar(Material material, int quantidade) {
		remover(material);
		material.quantidade += quantidade;
		cadastrar(material);
	}
	
	public void remover(Material material) {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("DELETE Material FROM Material WHERE id = " + material.get_id());
		q.executeUpdate();
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
