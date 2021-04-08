import java.text.NumberFormat;

public class contaBancaria {

		private String nome;
		private String agencia;
		private String conta;
		private int saldoDisponivel;
		private int saldoBloqueado;
		private int saldoTotal;
		
		public contaBancaria (String nome, String agencia, String conta, int saldoDisponivel, int saldoBloqueado, int saldoTotal) {
			this.nome = nome;
			this.agencia = agencia;
			this.conta = conta;
			this.saldoDisponivel = saldoDisponivel;
			this.saldoBloqueado = saldoBloqueado;
			this.saldoTotal = saldoTotal;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getAgencia() {
			return agencia;
		}

		public void setAgencia(String agencia) {
			this.agencia = agencia;
		}

		public String getConta() {
			return conta;
		}

		public void setConta(String conta) {
			this.conta = conta;
		}

		public int getSaldoDisponivel() {
			return saldoDisponivel;
		}

		public void setSaldoDisponivel(int saldoDisponivel) {
			this.saldoDisponivel = saldoDisponivel;
		}

		public int getSaldoBloqueado() {
			return saldoBloqueado;
		}

		public void setSaldoBloqueado(int saldoBloqueado) {
			this.saldoBloqueado = saldoBloqueado;
		}

		public int getSaldoTotal() {
			return saldoTotal;
		}

		public void setSaldoTotal(int saldoTotal) {
			this.saldoTotal = saldoTotal;
		}
		
		public String formatoMoeda1() {
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(saldoDisponivel);
			return formatoMoeda;
		}
		
		public String formatoMoeda2() {
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(saldoBloqueado);
			return formatoMoeda;
		}
		
		public String formatoMoeda3() {
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(saldoTotal);
			return formatoMoeda;
		}
		
		public void imprimirInformacoes() {
			System.out.println("Nome: " + nome + "\nAgencia: " + agencia + "\nConta: " + conta + "\nSaldo disponivel: " + this.formatoMoeda1() + "\nSaldo bloqueado: " + this.formatoMoeda2() + "\nSaldo Total: " + this.formatoMoeda3());
		}
}
