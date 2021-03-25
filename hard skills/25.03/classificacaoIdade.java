import java.util.Scanner;

public class classificacaoIdade {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe sua idade: ");
		int idade = scanner.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.printf("com %d anos, a pessoa se encontra na categoria infatil", idade);
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.printf("com %d anos, a pessoa se encontra na categoria juvenil", idade);
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.printf("com %d anos, a pessoa se encontra na categoria adulta", idade);
		}
		else {
			System.out.printf("a idade de %d anos não se encontra em uma dessas categorias", idade);
		}
	}
}
