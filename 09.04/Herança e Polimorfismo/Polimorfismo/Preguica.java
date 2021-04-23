package Polimorfismo;

public class Preguica extends Animal {

	Preguica() {
		super ("Pregui�a");
	}
	
	@Override
	public void getTipoAnimal (int tipo) {
		switch (tipo) {
		case 0:
			System.out.println("pregui�a-comum");
			break;
		case 1:
			System.out.println("pregui�a-de-coleira");
			break;
		case 2:
			System.out.println("pregui�a-bentinho");
			break;
		case 3:
			System.out.println("pregui�a-an�-de-tr�s-dedos");
			break;
		case 4:
			System.out.println("pregui�a-de-hoffmann");
			break;
		case 5:
			System.out.println("pregui�a-real");
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
