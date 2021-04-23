import java.util.Scanner;

public class whileCaracteristicasPsicologicas {
	public static void main(String[] args) {
		
		int i = 0, calmo = 0, mulherNervosa = 0, homemAgressivo = 0, outrosCalmos = 0,anos40Nervosos = 0, anos18Calmos = 0;
		
		Scanner scanner = new Scanner (System.in);
		while (i <=3) {
			System.out.println("Informe sua idade: ");
			int idade = scanner.nextInt();
			System.out.println("Informe seu sexo: ");
			char sexo = scanner.next().charAt(0);
			System.out.println("Você é uma pessoa calma, nervosa ou agressiva?");
			char caracteristica = scanner.next().charAt(0);
			
			if (caracteristica == 'c') {
				calmo++;
			}
			if (sexo == 'f' && caracteristica == 'n') {
				mulherNervosa++;
			}
			if (sexo == 'm' && caracteristica == 'a') {
				homemAgressivo++;
			}
			if (sexo != 'm' && sexo != 'f' && caracteristica == 'c') {
				outrosCalmos++;
			}
			if (idade >= 40 && caracteristica == 'n') {
				anos40Nervosos++;
			}
			if (idade <= 18 && caracteristica == 'c') {
				anos18Calmos++;
			}
			i++;
		}
		System.out.printf("Número de pessoas calmas: %d \nNúmero de mulheres nervosas: %d \nNúmero de homens agreesivos: %d \nNúmero de outros calmos: %d \nNúmero de pessoas nervosas com mais de 40 anos: %d \nNúmero de pessoas calmas com menos de 18 anos: %d", calmo, mulherNervosa, homemAgressivo, outrosCalmos, anos40Nervosos, anos18Calmos);
	}
}
