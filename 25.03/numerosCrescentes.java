import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class numerosCrescentes {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um n�mero:");
		double primeiroNumero = scanner.nextDouble();
		
		System.out.println("Informe um segundo n�mero:");
		double segundoNumero = scanner.nextDouble();
		
		System.out.println("Informe um �ltimo n�mero:");
		double terceiroNumero = scanner.nextDouble();
		
		System.out.println("Em ordem decrescente:");
		ArrayList<Double> ordem = new ArrayList<Double>();
		ordem.add(primeiroNumero);
		ordem.add(segundoNumero);
		ordem.add(terceiroNumero);
		Collections.sort(ordem);
		
		for (double resultado : ordem) {
			System.out.println(resultado);
		}	
	}
}
