import java.util.Scanner;

public class doWhileMediaNumeros {
	public static void main(String[] args) {
		
		double numeroInformado, somaNumeros = 0, cont = 0;
		
		Scanner scanner = new Scanner (System.in);
		do {
			System.out.println("Informe um n�mero: ");
			numeroInformado = scanner.nextDouble();
			somaNumeros += numeroInformado;
			if (numeroInformado != 0) {
			cont++;	
			}
		}
		while (numeroInformado != 0);
		double mediaGeral = somaNumeros / cont;
		System.out.println("M�dia dos numeros inseridos: " + mediaGeral);
		}
}
