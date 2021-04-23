
public class animalTeste {
	public static void main(String[] args) {
		
	cachorro animal1 = new cachorro ("Bob", "10", true);
	cavalo animal2 = new cavalo ("Pferd", "13", true);
	preguica animal3 = new preguica ("Marley", "4", true);
	
	animal1.isCorrer();
	animal2.isCorrer();
	animal3.isSubir();
	
	System.out.println("Banco de dados: \n------------------------");
	animal1.printInformacao();
	animal1.imprimirCachorro();
	System.out.println("------------------------");
	animal2.printInformacao();
	animal2.imprimirCavalo();
	System.out.println("------------------------");
	animal3.printInformacao();
	animal3.imprimirPreguica();
	System.out.println("------------------------");
	}
}
