import java.util.Scanner;

public class doWhileSomaNumeros {
	public static void main(String[] args) {
		
		double numeroInformado, somaNumeros = 0;
		
		Scanner scanner = new Scanner (System.in);
		do {
			System.out.println("Informe um n�mero: ");
			numeroInformado = scanner.nextDouble();
			somaNumeros += numeroInformado;
		}
		while (numeroInformado != 0);
		System.out.println("Soma dos n�meros informados: " + somaNumeros);
	}
}
