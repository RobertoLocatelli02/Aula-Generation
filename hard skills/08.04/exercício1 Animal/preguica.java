
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
			return "Ele sobe em árvores";
		} else {
			return "Ele não sobe em árvores";
		}
	}
	public void imprimirPreguica() {
		System.out.println(this.getCondicaoSubirEmArvore());
	}
}
