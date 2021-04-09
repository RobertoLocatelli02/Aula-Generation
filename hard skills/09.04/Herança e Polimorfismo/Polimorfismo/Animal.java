package Polimorfismo;

public abstract class Animal {

	private String nomeClasse;
	
	Animal (String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}
	
	abstract public void getTipoAnimal (int tipo);
	abstract public void getIdadeAnimal (int idade);
	abstract public void getSomAnimal (String som);
	
	public String getNomeClasse () {
		return nomeClasse;
	}
	
	public void setNomeClasse (String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}
}
