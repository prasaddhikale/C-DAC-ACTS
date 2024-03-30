package dao;

import pojos.Team;
import org.hibernate.*;
import static utils.HibernateUtils.getFactory;

import java.util.List;

public class TeamDaoImpl implements TeamDao {

	@Override
	public String addTeamDetails(Team newTeam) {
		// 1. open hibernate session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			session.save(newTeam);
			//end of try => success
			tx.commit();
		} catch (RuntimeException e) {
			// rollback tx n re throw the exc to the caller
			if (tx != null)
				tx.rollback();
			throw e;
		} 
		return "Added new Team with ID "+newTeam.getTeamId();
	}

	@Override
	public Team getTeamDetails(String abbr) {
		// TODO Auto-generated method stub
		Team team = null;
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		String jpql = "Select t from Team t where abbreviation=:abbr";
		
		
		
		try {
			team = session.createQuery(jpql,Team.class).setParameter("abbr", abbr).getSingleResult();	
			tx.commit();
		}
		catch(RuntimeException e) {
			if(tx!=null) {
				tx.rollback();
			}	
			throw e;
		}
		return team;
	}

	@Override
	public List<Team> getTeamswithMinAge(int age) {
		// TODO Auto-generated method stub
		List<Team> teams =null;
		
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		//Find out the teams , who need players with max age of the player> specified age
		String jpql = "select t from Team t where t.maxAge>:age";
		
		try {
			teams= session.createQuery(jpql, Team.class).setParameter("age",age).getResultList();
		}
		catch(RuntimeException e) {
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		
		
		return teams;
	}

	@Override
	public String updateAvgandWickets(int teamid,double avg, int wickets) {
		
		
		String msg="Update failed";
		Session session = getFactory().getCurrentSession();
		
		Transaction tx = session.beginTransaction();
		
		
		
		try {
			Team team = session.get(Team.class, teamid);
			team.setMinBattingAvg(avg);
			team.setMinWicketsTaken(wickets);
			
			tx.commit();
			msg= "Updated succesfully";
		}
		catch(RuntimeException e) {
			if(tx!=null) {
				tx.rollback();
			}
			throw e;
		}
		
		return msg;
		
	
	}

}
