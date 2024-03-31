package dao;

import static utils.HibernateUtils.getFactory;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Team;

public class TeamDaoImpl implements TeamDao{

	@Override
	public String addNewTeam(Team team) {
		// TODO Auto-generated method stub
		String mesg = "Adding new dept failed!!!!!";
		// 1. Get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. Begin a tx
		Transaction tx = session.beginTransaction();
		try {
			session.persist(team);
			tx.commit();// insert
			mesg = "Added new team with ID " + team.getId();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}
	
	@Override
	public List<String> getTeamsAbbreviations() {
		// TODO Auto-generated method stub
		List<String> teamAbbr;
		String jpql = "select t.abbreviation from Team t";
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();	
		try {
			teamAbbr=session.createQuery(jpql, String.class).getResultList();
			tx.commit();
		}catch(Exception e) {
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		return teamAbbr;
	}
	
	}


