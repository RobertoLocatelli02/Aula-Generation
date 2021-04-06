import java.util.Scanner;

public class vetorParImpar {
	public static void main(String[] args) {
		
		double somaPares = 0, somaImpar = 0;
		
		Scanner scanner = new Scanner (System.in);
		double[] vetor = new double [6];
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Informe um número: ");
			vetor[i] = scanner.nextDouble();	
		}
		System.out.println("\nNumeros pares: ");
		for (int i = 0; i < 6; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.println(vetor[i]);
				somaPares += vetor[i];
			}
		}
		System.out.println("Soma dos pares: " + somaPares);
		System.out.println("\nNumeros impares: ");
		for (int i = 0; i < 6; i++) {
			if (vetor[i] % 2 != 0) {
				System.out.println(vetor[i]);
				somaImpar += vetor[i];
			}
		}
		System.out.println("Soma dos impares: " + somaImpar);
	}
}
