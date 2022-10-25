package bean;

public class Destino {
	private String cidade;
	private String estado;
	private String pais;
	private int nHab;
	private String coordenadas;
	
	public Destino(String cidade, String estado, String pais, int nHab, String coordenadas) {
		super();
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.nHab = nHab;
		this.coordenadas = coordenadas;
	}

	public Destino() {
		// TODO Auto-generated constructor stub
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getnHab() {
		return nHab;
	}

	public void setnHab(int nHab) {
		this.nHab = nHab;
	}

	public String getCoordenadas() {
		return coordenadas;
	}
	
	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}

	@Override
	public String toString() {
		return "Destino [cidade=" + cidade + ", estado=" + estado + ", pais=" + pais + ", nHab=" + nHab
				+ ", coordenadas=" + coordenadas + "]";
	}
}
	