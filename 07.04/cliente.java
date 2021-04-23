
public class cliente {

	private String nome;
	private String email;
	private String telefone;
	private String endereco;
	
	public cliente (String nome, String email, String telefone, String endereco) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public void imprimirInformacoes() {
		System.out.println("Nome: " + nome + "\nEmail: " + email + "\nTelefone: " + telefone + "\nEndereço: " + endereco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
