package bean;

public class Transporte {
	private int codigo;
	private String tipo;
	private int carga;
	private int passageiros;
	private String modelo;
	private String combustivel;
	
	public Transporte(int codigo, String tipo, int carga, int passageiros, String modelo, String combustivel) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.carga = carga;
		this.passageiros = passageiros;
		this.modelo = modelo;
		this.combustivel = combustivel;
	}

	public Transporte() {
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	@Override
	public String toString() {
		return "Transporte [codigo=" + codigo + ", tipo=" + tipo + ", carga=" + carga + ", passageiros=" + passageiros
				+ ", modelo=" + modelo + ", combustivel=" + combustivel + "]";
	}
}
