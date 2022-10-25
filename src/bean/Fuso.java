package bean;

public class Fuso {
	private String cidade;
	private String estado;
	private String pais;
	private int fuso;
	
	public Fuso(String cidade, String estado, String pais, int fuso) {
		super();
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.fuso = fuso;
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

	public int getFuso() {
		return fuso;
	}

	public void setFuso(int fuso) {
		this.fuso = fuso;
	}

	@Override
	public String toString() {
		return "Fuso [cidade=" + cidade + ", estado=" + estado + ", pais=" + pais + ", fuso=" + fuso + "]";
	}
}
