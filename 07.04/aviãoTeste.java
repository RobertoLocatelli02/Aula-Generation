
public class avi�oTeste {
	public static void main(String[] args) {
		
		avi�o[] objetoAviao = new avi�o[3];
		
		objetoAviao[0] = new avi�o ("Boeing 787", 2007, 336, 958);
		objetoAviao[1] = new avi�o ("Airbus A330", 2012 , 335, 871);
		objetoAviao[2] = new avi�o ("Cessna 172 Skyhawk", 1956, 4, 226);
		
		for (avi�o loop : objetoAviao) {
			loop.imprimirInformacoes();
			System.out.println();
		}
	}
}
