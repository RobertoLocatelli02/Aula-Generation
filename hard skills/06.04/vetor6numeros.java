import java.util.Scanner;

public class vetor6numeros {
	public static void main(String[] args) {
		
		double[] vetor = new double [6];
		
		Scanner scanner = new Scanner (System.in);
		for (int i = 0; i < 6; i++) {
			System.out.println("Informe um número: ");
			vetor[i] = scanner.nextDouble();
		}
		
		System.out.println("Soma de A[0], A[1] e A[5]: " + (vetor[0] + vetor[1] + vetor[5]));
		vetor[3] = 100;
		
		for (int i = 0; i < 6; i++) {
			System.out.println("vetor " + (i+1) + ": " + vetor[i]);
		}
	}
}
