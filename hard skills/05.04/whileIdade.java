import java.util.Scanner;

public class whileIdade {
	public static void main(String[] args) {
		
		int cont21 = 0, cont50 = 0;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe uma idade: ");
		int idade = scanner.nextInt();
		while (idade != -99) {
			if (idade <= 21) {
				 cont21++;
			} 
			if (idade >= 50) {
				cont50++;
			}
		System.out.println("Informe uma idade: ");
		idade = scanner.nextInt();
		}
		System.out.printf("Total de pessoas com menos de 21 anos: %d \nTotal de pessoas com mais de 50 anos: %d", cont21, cont50);
	}
}
