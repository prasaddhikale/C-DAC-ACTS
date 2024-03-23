package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static utils.DBUtils.*;

import pojos.User;

public class UserDaoImpl implements UserDao {
	//state (fields)
	private Connection connection;
	private PreparedStatement pst1;
	private PreparedStatement pst2;
	private PreparedStatement pst3;
	//def ctor
	public UserDaoImpl() throws SQLException{
		// get cn from db utils
		connection=openConnection();
		pst2=connection.prepareStatement("select * from users where email=? and password=?");
		pst1=connection.prepareStatement("select first_name,last_name,dob,status from users where role=? and dob between ? and ?");
		pst3=connection.prepareStatement("update users set status = 1 where id=?");
		System.out.println("user dao created!");
	}

	@Override
	public List<User> getSelectedUsers(String role, Date begin, Date end) throws SQLException {
		// set IN params
		pst1.setString(1,role);
		pst1.setDate(2, begin);
		pst1.setDate(3, end);
		//exec query : execQuery() --- RST
		List<User> users=new ArrayList<>();
		try(ResultSet rst=pst1.executeQuery())
		{
			while(rst.next())
				users.add(new User(rst.getString(1),rst.getString(2)
						,rst.getDate(3),rst.getBoolean(4)));
		}
		return users;//DAO rets populated list of users to tester.
	}
	public User authenticate(String email,String pass) throws SQLException {
		pst2.setString(1,email);
		pst2.setString(2,pass);
		
		try(ResultSet rst1=pst2.executeQuery()){
			// id | first_name | last_name | email             | password | dob        | status | role
			while(rst1.next()) {
				return new User(rst1.getInt(1),rst1.getString(2),rst1.getString(3),rst1.getString(4),rst1.getString(5),rst1.getDate(6),rst1.getBoolean(7),rst1.getString(8));
			}
		}
		return null;
	}
	public int updateVoting(int id) throws SQLException {
		pst3.setInt(1, id);
		int x=pst3.executeUpdate();
		return x;
		
	}
	//clean up 
	public void cleanUp() throws SQLException
	{
		if(pst1 != null)
			pst1.close();
		closeConnection();
		System.out.println("user dao cleaned up !");
	}

}
