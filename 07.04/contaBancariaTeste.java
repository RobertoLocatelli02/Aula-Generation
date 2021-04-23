
public class contaBancariaTeste {
	public static void main(String[] args) {
		
		contaBancaria[] cliente = new contaBancaria[3];
		
		cliente[0] = new contaBancaria ("Roberto", "1234", "1234", 4000, 0, 4000);
		cliente[1] = new contaBancaria ("José", "2345", "2345", 16000, 4000, 20000);
		cliente[2] = new contaBancaria ("Maria", "4321", "1234", 2000, 500, 2500);
		
		for (contaBancaria loop : cliente) {
			loop.imprimirInformacoes();
			System.out.println();
		}
	}
}
