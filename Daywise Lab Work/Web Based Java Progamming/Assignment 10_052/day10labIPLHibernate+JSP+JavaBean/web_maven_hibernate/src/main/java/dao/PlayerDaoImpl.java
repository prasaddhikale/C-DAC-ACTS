package dao;

import static utils.HibernateUtils.getFactory;
//import static utils.HibernateUtils.getSf;
import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.time.Period;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Player;
import pojos.Team;


public class PlayerDaoImpl implements PlayerDao {


//	public String addNewPlayer(Player player, Long teamId) {
//
//		System.out.println("In addNewPlayer after playerbean-------");
//		Session session = getFactory().getCurrentSession();
//		// 2. Begin a tx
//		Transaction tx = session.beginTransaction();
//		System.out.println("session open " + session.isOpen() + " is connected " + session.isConnected());// t t
//		// L1 cache is created.
//		try {
//			// 3. get dept from it's id
//			Team team = session.get(Team.class, teamId);
//			//null chking
//			if(team != null)
//			{
//				//dept : PERSISTENT
//				//establish bi dir asso bet entities : by calling helper method
//				team.addPlayer(player);
//				session.persist(player);
//			}
//			tx.commit();
//		} catch (RuntimeException e) {
//			if (tx != null)
//				tx.rollback();// no auto dirty checking --- session is auto closed =>
//			// L1 cache is destroyed n pooled out db cn rets to the pool
//			// re throw the exc to the caller
//			throw e;
//		}
//		return "Emp details added , with ID " + player.getId();
//	}
//	@Override
//	public void addNewPlayer(Player player, String teamAbbr) {
//		Team team;
//		String jpql = "Select t from Team t where t.abbreviation = :abbr";
////		
//		Session session = getFactory().getCurrentSession();
//		// 2. Begin a tx
//		Transaction tx = session.beginTransaction();
//		//String jpql = "Select t from Team t where t.abbreviation = :abbr";
////		System.out.println("session open " + session.isOpen() + " is connected " + session.isConnected());// t t
//		// L1 cache is created.
//		try {
//			// 3. get dept from it's id
//			
//			 team = session.createQuery(jpql, Team.class).setParameter("abbr", teamAbbr).getSingleResult();
//			//Team team = session.get(Team.class, teamId);
//			//null chking
//			if(team != null)
//			{
//				//dept : PERSISTENT
//				//establish bi dir asso bet entities : by calling helper method
//				team.addPlayer(player);
//				session.save(player);
//			}
//			tx.commit();
//		} catch (RuntimeException e) {
//			if (tx != null)
//				tx.rollback();// no auto dirty checking --- session is auto closed =>
//			// L1 cache is destroyed n pooled out db cn rets to the pool
//			// re throw the exc to the caller
//			throw e;
//		}
//		//return "Emp details added , with ID " + player.getId();
//	}
	
	
//	@Override
//	public void addPlayer(String teamAbbr, Player player) {
//		Team team;
//		String teamQuery = "select t from Team t where t.abbreviation=:abbr";
//		Session session = getFactory().getCurrentSession();
//		Transaction tx = session.beginTransaction();	
//		try {
//			team = session.createQuery(teamQuery, Team.class).setParameter("abbr", teamAbbr).getSingleResult(); 
//			team.addPlayer(player);
//			session.save(player);
//			tx.commit();
//		}catch(Exception e) {
//			if(tx!=null)
//				tx.rollback();
//			throw e;
//		}
//	}
	
	public String addPlayer(String teamAbbr, Player player) {
		Team team;
		String teamQuery = "select t from Team t where t.abbreviation=:abbr";
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();	
		try {
			team = session.createQuery(teamQuery, Team.class).setParameter("abbr", teamAbbr).getSingleResult(); 
			
			 int age = Period.between(player.getDob(), LocalDate.now()).getYears() ;
			
			 if(age>team.getMaxAge() ) {
				 return "Rejected : Age MisMatch, age limit is " + team.getMaxAge();
			 }
			 
			 if( player.getBattingAvg() < team.getMinBattingAvg()  )
			 {
				 return "Rejected : Batting Avg Not Enough, Avg should be More than " + team.getMinBattingAvg();
			 }
			 if(player.getWicketsTaken() < team.getMinWicketsTaken()) {
				 return "Rejected : Wickets Taken Not Enough, Wickets Taken Should be more than "+ team.getMinWicketsTaken();
			 }
			 
			team.addPlayer(player);
			session.save(player);
			tx.commit();
			return "Registration Successfull";
		}catch(Exception e) {
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		
		
	}
	

	

	

}
