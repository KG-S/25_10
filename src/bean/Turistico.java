package bean;

public class Turistico {
	private String cidade;
	private String estado;
	private String pais;
	private String nome;
	
	public Turistico(String cidade, String estado, String pais, String nome) {
		super();
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.nome = nome;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Turistico [cidade=" + cidade + ", estado=" + estado + ", pais=" + pais + ", nome=" + nome + "]";
	}
}
