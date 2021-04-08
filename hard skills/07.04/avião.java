
public class avião {
	
	private String modelo;
	private int ano;
	private int capacidade;
	private int velocidade;
	
	public avião (String modelo, int ano, int capacidade, int velocidade) {
		this.modelo = modelo;
		this.ano = ano;
		this.capacidade = capacidade;
		this.velocidade = velocidade;
	}
	
	public void imprimirInformacoes() {
		System.out.println("Modelo do avião: " + modelo + "\nAno de fabricação: " + ano + "\nCapacidade: " + capacidade + " pessoas \nVelocidade: " + velocidade + " km/h");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
}
