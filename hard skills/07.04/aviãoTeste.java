
public class aviãoTeste {
	public static void main(String[] args) {
		
		avião[] objetoAviao = new avião[3];
		
		objetoAviao[0] = new avião ("Boeing 787", 2007, 336, 958);
		objetoAviao[1] = new avião ("Airbus A330", 2012 , 335, 871);
		objetoAviao[2] = new avião ("Cessna 172 Skyhawk", 1956, 4, 226);
		
		for (avião loop : objetoAviao) {
			loop.imprimirInformacoes();
			System.out.println();
		}
	}
}
