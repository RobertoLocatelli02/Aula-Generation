import java.util.Scanner;

public class forParesImpares {
	public static void main(String[] args) {
		
		int contPar = 0, contImpar = 0;
		
		Scanner scanner = new Scanner (System.in);
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Informe um número: ");
			double numeroInformado = scanner.nextDouble();
			
			if (numeroInformado % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
		}
		System.out.printf("Total de números pares: %d \nTotal de números ímpares: %d", contPar, contImpar);
	}
}
