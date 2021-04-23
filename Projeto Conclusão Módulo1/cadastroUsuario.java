
public class cadastroUsuario {
	public String nome;
	private int codigoID;
	
	cadastroUsuario (String nome, int codigoID) {
		this.nome = nome;
		this.codigoID = codigoID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoID() {
		return codigoID;
	}

	public void setCodigoID(int codigoID) {
		this.codigoID = codigoID;
	}
}