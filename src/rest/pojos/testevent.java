package rest.pojos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class testevent
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ShoppingListPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Event e = em.find(Event.class, 1);
		e.setItemName("dogfood");
		e.setBought(false);
		
		//		em.remove(e);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}
}
