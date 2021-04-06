import java.util.Scanner;

public class matriz3x3 {
	public static void main(String[] args) {
		
		int cont10 = 0;
		
		Scanner scanner = new Scanner (System.in);
		double[][] matriz = new double[3][3];
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.println("Informe um número: ");
				matriz[l][c] = scanner.nextDouble();
				if (matriz[l][c] > 10) {
					cont10++;
				}
			}
		}
		System.out.printf("Essa matriz possui %d números maiores que 10", cont10);
	}
}
