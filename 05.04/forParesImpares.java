import java.util.Scanner;

public class forParesImpares {
	public static void main(String[] args) {
		
		int contPar = 0, contImpar = 0;
		
		Scanner scanner = new Scanner (System.in);
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Informe um n�mero: ");
			double numeroInformado = scanner.nextDouble();
			
			if (numeroInformado % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
		}
		System.out.printf("Total de n�meros pares: %d \nTotal de n�meros �mpares: %d", contPar, contImpar);
	}
}
