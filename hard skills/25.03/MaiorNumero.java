import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um número:\n");
		float PrimeiroNumero = scanner.nextFloat();
		
		System.out.println("Informe outro número:\n");
		float SegundoNumero = scanner.nextFloat();
		
		System.out.println("Informe um último número:\n");
		float TerceiroNumero = scanner.nextFloat();
		
		if (PrimeiroNumero > SegundoNumero) {
			if (PrimeiroNumero > TerceiroNumero) {
				System.out.println("O maior número é o " + PrimeiroNumero);
			}
			else {
				System.out.println("O maior número é o " + TerceiroNumero);
			}
		}
		
		if (SegundoNumero > PrimeiroNumero) {
			if (SegundoNumero > TerceiroNumero) {
				System.out.println("O maior número é o " + SegundoNumero);
			}
			else {
				System.out.println("O maior número é o " + TerceiroNumero);
			}
		}	
   }
}

