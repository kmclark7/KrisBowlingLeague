package control;

import model.Team;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;



public class TeamHelper {

	private static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("KrisBowlingLeague");
	
	public void insertTeam(Team toAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(toAdd);
		em.getTransaction().commit();
		em.close();
	}
	
	public void deleteTeamById(int id) {
		Team toDelete = findById(id);
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.remove(toDelete);
		em.getTransaction().commit();
		em.close();
	}
	
	public void updatTeam(Team toUpdate) {
		EntityManager em = emfactory.createEntityManager();		
		em.getTransaction().begin();
		em.merge(toUpdate);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Team>listAllTeams() {
		EntityManager em = emfactory.createEntityManager();		
		TypedQuery<Team> typedQuery = em.createQuery("SELECT t FROM Team t", Team.class);
		List<Team> results = typedQuery.getResultList();
		em.close();
		return results;
	}
	
	public Team findById(int id) {
		EntityManager em = emfactory.createEntityManager();
		Team team = em.find(Team.class, id);
		em.close();
		return team;
	}
	
	public int lookupIdByName(String teamName) {
		EntityManager em = emfactory.createEntityManager();
		TypedQuery<Team> typedQuery = em.createQuery("SELECT t FROM Team t where t.teamName = :teamName", Team.class);
		typedQuery.setParameter("teamName",  teamName);
		Team result = typedQuery.getSingleResult();
		em.close();
		return result.getTeamId();
	}
}
