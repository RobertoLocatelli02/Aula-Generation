
public class cachorro extends animal {

	private boolean correr;
	
	public cachorro(String nome, String idade, boolean som) {
		super(nome, idade, som);
	}

	public void isCorrer() {
		this.correr = true;
	}

	public void N�oCorrer() {
		this.correr = false;
	}
	
	public String condicaoCorrer() {
		if (correr) {
			return "O animal corre";
		} else {
			return "O animal n�o corre";
		}
	}
	public void imprimirCachorro() {
		System.out.println(this.condicaoCorrer());
	}
}
