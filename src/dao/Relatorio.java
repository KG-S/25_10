package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Destino;
import bean.Transporte;
import bean.Turistico;
import bean.Viagem;

public class Relatorio {
private Connection connection;
	
	private Relatorio() {
		connection = new Conexao().getConnection();
	}
	
	public int totalTransportes() {
		String sql = "select count(*) as total_transportes from transporte";
		PreparedStatement stmt;
		int total = 0;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			total = rs.getInt("total_transportes");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return total;
	}
	
	public int totalDestinos() {
		String sql = "select count(*) as total_destino from destino";
		PreparedStatement stmt;
		int total = 0;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			total = rs.getInt("total_destino");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return total;
	}
	
	public int totalViagens() {
		String sql = "select count(*) as total_viagens from viagem";
		PreparedStatement stmt;
		int total = 0;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			total = rs.getInt("total_viagens");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return total;
	}
	
	public int duracaoViagem(int valor1, int valor2) {
		int total = 0;
		String sql = "select count(*) as total_viagens from viagem where DuracaoViagem between ? and ?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(1, valor1);
			stmt.setInt(2, valor2);
			ResultSet rs = stmt.executeQuery();
			total = rs.getInt("total_viagens");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return total;
	}
	
	public ArrayList<Viagem> valorViagem(double valor){
		String sql = "select v.* from viagem v where v.Valor>=?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setDouble(1, valor);
			ResultSet rs = stmt.executeQuery();
			ArrayList<Viagem> viagens = new ArrayList<>();
			while (rs.next()) {
				Destino d = new Destino();
				d.setCidade(rs.getString("Cidade"));
				d.setEstado(rs.getString("Estado"));
				d.setPais(rs.getString("Pais"));
				
				Transporte t = new Transporte();
				t.setCodigo(rs.getInt("codTransporte"));
				
				Viagem v = new Viagem(rs.getInt("codViagem"), d, t, rs.getDouble("Distancia"), rs.getDouble("DuracaoViagem"),  rs.getString("DataPartida"), rs.getString("DataChegada"), rs.getDouble("Valor"));
				viagens.add(v);
			}
			rs.close();
			stmt.close();
			return viagens;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Turistico> pontosTuristicos(Destino d){
		String sql = "select p.* from destino d join pTuristicoDestino p on d.Cidade = p.Cidade where d.Cidade=?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, d.getCidade());
			stmt.setString(2, d.getEstado());
			stmt.setString(3, d.getPais());
			ResultSet rs = stmt.executeQuery();
			ArrayList<Turistico> pontos = new ArrayList<>();
			while (rs.next()) {
				Turistico t = new Turistico(rs.getString("Cidade"), rs.getString("Estado"), rs.getString("Pais"), rs.getString("pTuris"));
				pontos.add(t);
			}
			rs.close();
			stmt.close();
			return pontos;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
