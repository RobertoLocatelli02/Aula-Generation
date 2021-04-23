import java.text.NumberFormat;

public class produtoEletronico {
	
	private String marca;
	private String modelo;
	private int ano;
	private int preco;
	
	public produtoEletronico (String marca, String modelo, int ano, int preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(preco);
		return formatoMoeda;
	}
	
	public void imprimirInformacoes() {
		System.out.println("Marca do produto: " + marca + "\nModelo do produto: " + modelo + "\nAno de fabricação: " + ano + "\nPreço médio: " + this.formatarMoeda());
	}
}
