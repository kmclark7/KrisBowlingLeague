package control;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Player;

public class PlayerHelper {

	private static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("KrisBowlingLeague");
	
	public void insertPlayer(Player toAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(toAdd);
		em.getTransaction().commit();
		em.close();
	}
	
	public void deletePlayerById(int id) {
		Player toDelete = findById(id);
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.remove(toDelete);
		em.getTransaction().commit();
		em.close();
	}
	
	public void updatePlayer(Player toUpdate) {
		EntityManager em = emfactory.createEntityManager();		
		em.getTransaction().begin();
		em.merge(toUpdate);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Player>listAllPlayers() {
		EntityManager em = emfactory.createEntityManager();		
		TypedQuery<Player> typedQuery = em.createQuery("SELECT p FROM Team p", Player.class);
		List<Player> results = typedQuery.getResultList();
		em.close();
		return results;
	}
	
	public Player findById(int id) {
		EntityManager em = emfactory.createEntityManager();
		Player team = em.find(Player.class, id);
		em.close();
		return team;
	}
	
}
