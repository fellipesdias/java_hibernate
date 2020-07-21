package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.pessoa;


public class Programa {

	public static void main(String[] args) {
		
		pessoa p1  = new pessoa(null, "Fellipe Soares Dias","fellipesoaresdias@gmail.com");
		pessoa p2  = new pessoa(null, "Joao das Neves","joaodasneves@gmail.com");
		pessoa p3  = new pessoa(null, "William Arao","williamarao@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cadastro-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Pronto");
		em.close();
		emf.close();
		
				
	}

}
