import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um n�mero:\n");
		float PrimeiroNumero = scanner.nextFloat();
		
		System.out.println("Informe outro n�mero:\n");
		float SegundoNumero = scanner.nextFloat();
		
		System.out.println("Informe um �ltimo n�mero:\n");
		float TerceiroNumero = scanner.nextFloat();
		
		if (PrimeiroNumero > SegundoNumero) {
			if (PrimeiroNumero > TerceiroNumero) {
				System.out.println("O maior n�mero � o " + PrimeiroNumero);
			}
			else {
				System.out.println("O maior n�mero � o " + TerceiroNumero);
			}
		}
		
		if (SegundoNumero > PrimeiroNumero) {
			if (SegundoNumero > TerceiroNumero) {
				System.out.println("O maior n�mero � o " + SegundoNumero);
			}
			else {
				System.out.println("O maior n�mero � o " + TerceiroNumero);
			}
		}	
   }
}

