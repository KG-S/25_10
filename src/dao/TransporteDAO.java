package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Transporte;

public class TransporteDAO {
	private Connection connection;
	
	public TransporteDAO() {
		connection = new Conexao().getConnection();
	}
	
	public int inserir(Transporte t) {
		int inseriu = 0;
		String sql = "insert into transporte values(?, ?, ?, ?, ?, ?)";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(1, t.getCodigo());
			stmt.setString(2, t.getTipo());
			stmt.setInt(3, t.getCarga());
			stmt.setString(4, t.getModelo());
			stmt.setString(5, t.getCombustivel());
			stmt.setInt(6, t.getPassageiros());
			inseriu = stmt.executeUpdate();
			stmt.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return inseriu;
	}
	
	public ArrayList<Transporte> listar(){
		String sql = "select * from transporte";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList<Transporte> transportes = new ArrayList<>();
			while (rs.next()) {
				Transporte t = new Transporte(rs.getInt("COD"), rs.getString("Tipo"), rs.getInt("NumCarga"), rs.getInt("NumPass"), rs.getString("Modelo"), rs.getString("Combustivel"));
				transportes.add(t);
			}
			rs.close();
			stmt.close();
			return transportes;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int remover(Transporte t) {
		int removeu = 0;
		String sql = "delete from transporte where COD=?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(1, t.getCodigo());
			removeu = stmt.executeUpdate();
			stmt.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return removeu;
	}
	
	public int alterar(Transporte t) {
		int alterou = 0;
		String sql = "updade transporte set Tipo=?, NumCarga=?, Modelo=?, Combustivel=?, NumPass=? where COD=?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(6, t.getCodigo());
			stmt.setString(1, t.getTipo());
			stmt.setInt(2, t.getCarga());
			stmt.setString(3, t.getModelo());
			stmt.setString(4, t.getCombustivel());
			stmt.setInt(5, t.getPassageiros());
			alterou = stmt.executeUpdate();
			stmt.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return alterou;
	}
}

