package Polimorfismo;

public class Cachorro extends Animal {

	Cachorro() {
		super ("Cachorro");
	}
	
	@Override
	public void getTipoAnimal(int tipo) { 
		switch (tipo) {
		case 0:
			System.out.println("Pinscher");
			break;
		case 1:
			System.out.println("Bulldog");
			break;
		case 2:
			System.out.println("Golden");
			break;
		case 3:
			System.out.println("Pastor-alemão");
			break;
		case 4:
			System.out.println("Poodle");
			break;
		case 5:
			System.out.println("Chihuahua");
			break;
		case 6:
			System.out.println("Husky siberiano");
			break;
		case 7:
			System.out.println("Vira lata");
			break;
		default:
			System.out.println("erro inesperado");
			break;
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
