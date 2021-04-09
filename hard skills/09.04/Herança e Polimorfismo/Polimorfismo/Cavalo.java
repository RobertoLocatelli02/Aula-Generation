package Polimorfismo;

public class Cavalo extends Animal {

	Cavalo () {
		super ("Cavalo");
	}
	
	@Override
	public void getTipoAnimal (int tipo) {
		switch (tipo) {
		case 0:
			System.out.println("Mustang");
			break;
		case 1:
			System.out.println("Pônei");
			break;
		case 2:
			System.out.println("Westfallen");
			break;
		case 3: 
			System.out.println("Colorado");
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
