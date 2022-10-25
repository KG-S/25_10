package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public Connection getConnection() {
		try {
			return (Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3066/viagem?", "root", "");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}


