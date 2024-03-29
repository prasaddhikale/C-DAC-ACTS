package dao;

import static utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Player;

public class PlayerDaoImpl implements PlayerDao {

	@Override
	public String addPlayerDetails(Player newPlayer) {
		// TODO Auto-generated method stub
		
		// 1. open hibernate session from SF
				Session session = getFactory().openSession();
				// 2. begin a tx
				Transaction tx = session.beginTransaction();
				try {
					session.save(newPlayer);
					//end of try => success
					tx.commit();
				} catch (RuntimeException e) {
					// rollback tx n re throw the exc to the caller
					if (tx != null)
						tx.rollback();
					throw e;
				} finally {
					// close the session
					if (session != null)
						session.close();
				}
				return "Added new Player with ID "+newPlayer.getPlayerId();
			}
}
