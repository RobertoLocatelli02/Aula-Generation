
public class animal {

	private String nome;
	private String idade;
	private boolean som;
	
	public animal (String nome, String idade, boolean som) {
		this.nome = nome;
		this.idade = idade;
		this.som = som;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public void emiteSom (boolean som) {
	this.som = true;
	}
	
	public void naoEmiteSom (boolean som) {
		this.som = false;
	}
	
	public String getCondicaoSom() {
		if (som) {
			return "O animal emite som";
		} else {
			return "O animal não emite som";
		}
	}
	
	public void printInformacao() {
		System.out.println("Nome: " + nome + "\nIdade: " + idade + "\n" + this.getCondicaoSom());
	}
 }
