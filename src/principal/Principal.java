package principal;

import java.util.ArrayList;

import bean.Destino;
import bean.Transporte;
import dao.TransporteDAO;
import dao.DestinoDAO;

public class Principal {
	public static void main(String[] args) {
		Transporte t = new Transporte(1, "Avião", 400, 200, "Airbus 500", "Gasolina A.");
		TransporteDAO tdao = new TransporteDAO();
		
		//tdao.inserir(t);
		
		Destino d = new Destino("São Paulo", "São Paulo", "Brasil", 1200000, "-99920.20 34567.20");
		DestinoDAO ddao = new DestinoDAO();
		
		//ddao.inserir(d);
		
		ArrayList<Transporte> transportes = tdao.listar();
		for (Transporte tr : transportes) {
			System.out.println(tr);
		}
		
		ArrayList<Destino> destinos = ddao.listar();
		for (Destino de : destinos) {
			System.out.println(de);
		}
	}
}
