package Polimorfismo;

import java.util.Random;

public class AnimalTeste {
	public static void main(String[] args) {
		
		Cachorro animal1 = new Cachorro();
		Cavalo animal2 = new Cavalo();
		Preguica animal3 = new Preguica();
		
		int dog = new Random().nextInt(8);
		int dogVida = new Random().nextInt(21);
		System.out.println("----------------------");
		System.out.print("Animal: " + animal1.getNomeClasse() + "\nRaça: ");
		animal1.getTipoAnimal(dog);
		System.out.print("Idade: ");
		animal1.getIdadeAnimal(dogVida);
		System.out.print("Som: ");
		animal1.getSomAnimal("Au au au");
		System.out.println("----------------------");
		
		int horse = new Random().nextInt(4);
		int horseVida = new Random().nextInt(31);
		System.out.println("----------------------");
		System.out.print("Animal: " + animal2.getNomeClasse() + "\nRaça: ");
		animal2.getTipoAnimal(horse);
		System.out.print("Idade: ");
		animal2.getIdadeAnimal(horseVida);
		System.out.print("Som: ");
		animal2.getSomAnimal("Hiin in in");
		System.out.println("----------------------");
		
		int preguica = new Random().nextInt(8);
		int preguicaVida = new Random().nextInt(21);
		System.out.println("----------------------");
		System.out.print("Animal: " + animal3.getNomeClasse() + "\nRaça: ");
		animal3.getTipoAnimal(preguica);
		System.out.print("Idade: ");
		animal3.getIdadeAnimal(preguicaVida);
		System.out.print("Som: ");
		animal3.getSomAnimal("Sei lá");
		System.out.println("----------------------");
	}
}
