package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Destino;

public class DestinoDAO {
private Connection connection;
	
	public DestinoDAO() {
		connection = new Conexao().getConnection();
	}
	
	public int inserir(Destino d) {
		int inseriu = 0;
		String sql = "insert into destino values(?, ?, ?, ?, ?)";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1,d.getCidade());
			stmt.setString(2, d.getEstado());
			stmt.setString(3, d.getPais());
			stmt.setInt(4, d.getnHab());
			stmt.setString(5, d.getCoordenadas());

			inseriu = stmt.executeUpdate();
			stmt.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return inseriu;
	}
	
	public ArrayList<Destino> listar(){
		String sql = "select * from destino";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList<Destino> destinos = new ArrayList<>();
			while (rs.next()) {
				Destino d = new Destino(rs.getString("Cidade"), rs.getString("Estado"), rs.getString("Pais"), rs.getInt("nHab"), rs.getString("Coord"));
				destinos.add(d);
			}
			rs.close();
			stmt.close();
			return destinos;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int remover(Destino d) {
		int removeu = 0;
		String sql = "delete from destino where Cidade=? and Estado=? and Pais=?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, d.getCidade());
			stmt.setString(2, d.getEstado());
			stmt.setString(3, d.getPais());
			removeu = stmt.executeUpdate();
			stmt.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return removeu;
	}
	
	public int alterar(Destino d) {
		int alterou = 0;
		String sql = "updade destino set nHab=?, Coord=? where Cidade=? and Estado=? and Pais=?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(1, d.getnHab());
			stmt.setString(2,d.getCoordenadas());
			stmt.setString(3,d.getCidade());
			stmt.setString(4,d.getEstado());
			stmt.setString(5,d.getPais());
			alterou = stmt.executeUpdate();
			stmt.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return alterou;
	}
}

