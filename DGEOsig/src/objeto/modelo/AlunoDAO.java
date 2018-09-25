package objeto.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.List;

import javax.persistence.Query;

public class AlunoDAO {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	public  AlunoDAO() {
		emf = Persistence.createEntityManagerFactory("aluno");
		em = emf.createEntityManager();
	}
	public void cadastrar(Aluno a) {
		em.getTransaction().begin();
		em.merge(a);
		em.getTransaction().commit();
		emf	.close();
	}
	public Aluno buscar(String matricula) {
		Aluno ret;
		em.getTransaction().begin();
		Query q =  em.createQuery("select aluno from Aluno aluno where CPF = " + matricula);
		List<Aluno> l = q.getResultList();
		System.out.println(l.size());
		ret = l.get(0);
		em.getTransaction().commit();
		emf	.close();
		
		return ret;
	}
	
}
