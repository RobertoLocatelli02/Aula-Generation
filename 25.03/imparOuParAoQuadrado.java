import java.util.Scanner;

public class imparOuParAoQuadrado {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe um n�mero: ");
		double numeroInformado = scanner.nextDouble();
		
		if (numeroInformado % 2 == 0) {
			double par = Math.sqrt(numeroInformado);
			System.out.printf("O numero %1.2f � par, e a ra�z quadrada dele � %1.2f",numeroInformado, par);
		}
		if (numeroInformado % 2 != 0) {
			double impar = Math.pow(numeroInformado, 2);
			System.out.printf("O numero %1.2f � �mpar, e o quadrado dele � %1.2f",numeroInformado, impar);
		}
	}
}
