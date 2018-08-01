package com.deloitte.cui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import com.deloitte.cui.Dao;
import com.deloitte.cui.User;

public class UserDAO implements Dao<User> {

	@Override
	public User get(long id) {
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}

	@Override
	public void save(User user) {
		Connection connection=null;
		PreparedStatement ps=null;
		try {
		//Load or register a JDBC driver
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

		// Establish a connection
			connection=DriverManager.getConnection("jdbc:oracle:thin:@desktop-m03s522:1522:teamdb", "sneha", "hello");
			ps= connection.prepareStatement("INSERT INTO USERS VALUES (?,?,?,?,?,?)");
			ps.setInt(1,user.getId());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getFirstName());
			ps.setString(4, user.getLastName());
			ps.setString(5, user.getPasswd());
			ps.setString(6, user.getStatus());
			//Execute your query
			ps.executeUpdate();
			//Release resources
			
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	} finally {
		try {
			if(ps!=null && !ps.isClosed()) {
				ps.close();
			}
			if(connection!=null && connection.isClosed()) {
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}	
}
  
	@Override
	public void update(User t, String[] params) {
		
		
	}

	@Override
	public void delete(User t) {
		
		
	}
}
