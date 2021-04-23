import java.util.Scanner;

public class matriz2x2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe uma opção: \n1- soma de duas matrizes \n2- subtrair a primeira matriz da segunda \n3- adicionar uma constante às duas matrizes \n4- imprimir as matrizes");
		int numeroInformado = scanner.nextInt();
		
		int[][] matriz1 = new int[2][2];
		System.out.println("Informe as matrizes \nMatriz 1: ");
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.println("Informe um número: ");
				matriz1[l][c] = scanner.nextInt();
			}
		}
		int[][] matriz2 = new int[2][2];
		System.out.println("\nMatriz 2: ");
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.println("Informe um número:");
				matriz2[l][c] = scanner.nextInt();
			}
		}
		int[][] matriz3 = new int[2][2];
		switch (numeroInformado) {
		case 1: 
			System.out.println("A soma das matrizes é: ");
			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					matriz3[l][c] = matriz1[l][c] + matriz2[l][c];
					System.out.printf("\t %d \t", matriz3[l][c]);
				}
				System.out.println();
			}
			break;
		case 2:
			System.out.println("A subtração das matrizes é: ");
			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					matriz3[l][c] = matriz2[l][c] - matriz1[l][c];
					System.out.printf("\t %d \t", matriz3[l][c]);
				}
				System.out.println();
			}
			break;
		case 3:
			System.out.println("Informe uma constante: ");
			double constante = scanner.nextDouble();
			System.out.println("\nMatriz 1: ");
			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					matriz1[l][c] += constante;
					System.out.printf("\t %d \t", matriz1[l][c]);
				}
				System.out.println();
			}
			System.out.println("\nMatriz 2:");
			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					matriz2[l][c] += constante;
					System.out.printf("\t %d \t", matriz2[l][c]);
				}
				System.out.println();
			}
			break;
		case 4:
			System.out.println("As matrizes são: \nMatriz 1:");
			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %d \t", matriz1[l][c]);
				}
				System.out.println();
			}
			System.out.println("\nMatriz 2:");
			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %d \t", matriz2[l][c]);
				}
				System.out.println();
			}
			break;
		default:
			System.out.println("Algo deu errado");
			break;
		}
	}
}
