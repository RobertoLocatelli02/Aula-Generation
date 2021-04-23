import java.text.NumberFormat;

public class funcionario {

	private String nome;
	private int totalVendas;
	private String produtoMaisVendido;
	private String tempoNaEmpresa;
	private int salarioBruto;
	
	public funcionario (String nome, int totalVendas,String produtoMaisVendido, String tempoNaEmpresa, int salarioBruto) {
		this.nome = nome;
		this.totalVendas = totalVendas;
		this.produtoMaisVendido = produtoMaisVendido;
		this.tempoNaEmpresa = tempoNaEmpresa;
		this.salarioBruto = salarioBruto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}

	public String getProdutoMaisVendido() {
		return produtoMaisVendido;
	}

	public void setProdutoMaisVendido(String produtoMaisVendido) {
		this.produtoMaisVendido = produtoMaisVendido;
	}

	public String getTempoNaEmpresa() {
		return tempoNaEmpresa;
	}

	public void setTempoNaEmpresa(String tempoNaEmpresa) {
		this.tempoNaEmpresa = tempoNaEmpresa;
	}

	public int getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(int salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salarioBruto);
		return formatoMoeda;
	}
	
	public void imprimirInformacoes() {
		System.out.println("Nome do funcionário: " + nome + "\nTotal de vendas no mês: " + totalVendas + "\nProduto mais vendido: " + produtoMaisVendido + "\nTempo na empresa: " + tempoNaEmpresa + "\nSalarioBruto: " + this.formatarMoeda() );
	}
}
