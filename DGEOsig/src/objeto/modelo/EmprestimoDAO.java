package objeto.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmprestimoDAO {

	EntityManagerFactory emf;
	EntityManager em;
	
	public EmprestimoDAO () {
		emf = Persistence.createEntityManagerFactory("banco");
		em = emf.createEntityManager();
	}
	
	public void cadastrar(Emprestimo emprestimo) {
		em.getTransaction().begin();
		em.merge(emprestimo);
		em.getTransaction().commit();
		emf.close();
	}
	
}
