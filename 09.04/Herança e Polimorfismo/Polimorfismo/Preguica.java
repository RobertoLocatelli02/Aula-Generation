package Polimorfismo;

public class Preguica extends Animal {

	Preguica() {
		super ("Preguiça");
	}
	
	@Override
	public void getTipoAnimal (int tipo) {
		switch (tipo) {
		case 0:
			System.out.println("preguiça-comum");
			break;
		case 1:
			System.out.println("preguiça-de-coleira");
			break;
		case 2:
			System.out.println("preguiça-bentinho");
			break;
		case 3:
			System.out.println("preguiça-anã-de-três-dedos");
			break;
		case 4:
			System.out.println("preguiça-de-hoffmann");
			break;
		case 5:
			System.out.println("preguiça-real");
			break;
		default:
			System.out.println("Erro inesperado");
		}
	}
	
	@Override
	public void getIdadeAnimal (int idade) {
		System.out.println(idade);
	}
	
	@Override
	public void getSomAnimal (String som) {
		System.out.println(som);
	}
}
