import java.text.NumberFormat;

public class patinete {
	
	private String marca;
	private String modelo;
	private String cor;
	private String tamanho;
	private String peso;
	private int valor;
	
	public patinete (String marca, String modelo, String cor, String tamanho, String peso, int valor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.tamanho = tamanho;
		this.peso = peso;
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(valor);
		return formatoMoeda;
	}
	
	public void imprimirInformacoes() {
		System.out.println("Marca do patinete: " + marca + "\nModelo: " + modelo + "\nCor: " + cor + "\nTamanho: " + tamanho + "\nPeso: " + peso + "\nValor: " + this.formatarMoeda());
	}
}
