
public class patineteTeste {
	public static void main(String[] args) {
		
		patinete[] objetoPatinete = new patinete[3];
		
		objetoPatinete[0] = new patinete("FOSTON", "Patinete Elétrico S08 PRO", "Preto", "52 x 110 x 17", "12 kg", 2200);
		objetoPatinete[1] = new patinete("MW", "Patinete Elétrico E9", "Branco", "56 x 116 x 11", "14 kg", 2500);
		objetoPatinete[2] = new patinete("Bandeirante", "Patinete Skatenet Max", "Rosa", "62 x 92 x 26", "3095 gramas", 299);
		
		for (patinete loop : objetoPatinete) {
			loop.imprimirInformacoes();
			System.out.println();
		}
	}
}
