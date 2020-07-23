package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import dominio.Pessoa;


public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1  = new Pessoa(null, "Fellipe Soares Dias","fellipesoaresdias@gmail.com");
		Pessoa p2  = new Pessoa(null, "Joao das Neves","joaodasneves@gmail.com");
		Pessoa p3  = new Pessoa(null, "William Arao","williamarao@gmail.com");
		
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
