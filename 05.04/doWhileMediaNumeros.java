import java.util.Scanner;

public class doWhileMediaNumeros {
	public static void main(String[] args) {
		
		double numeroInformado, somaNumeros = 0, cont = 0;
		
		Scanner scanner = new Scanner (System.in);
		do {
			System.out.println("Informe um número: ");
			numeroInformado = scanner.nextDouble();
			somaNumeros += numeroInformado;
			if (numeroInformado != 0) {
			cont++;	
			}
		}
		while (numeroInformado != 0);
		double mediaGeral = somaNumeros / cont;
		System.out.println("Média dos numeros inseridos: " + mediaGeral);
		}
}
