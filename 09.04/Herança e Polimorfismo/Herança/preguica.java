
public class preguica extends animal{

	private boolean subirEmArvore;
	
	public preguica(String nome, String idade, boolean som) {
		super(nome, idade, som);
	}
	
	public void isSubir() {
		this.subirEmArvore = true;
	}
	public void naoSubir() {
		this.subirEmArvore = false;
	}
	public String getCondicaoSubirEmArvore() {
		if (subirEmArvore) {
			return "Ele sobe em �rvores";
		} else {
			return "Ele n�o sobe em �rvores";
		}
	}
	public void imprimirPreguica() {
		System.out.println(this.getCondicaoSubirEmArvore());
	}
}
