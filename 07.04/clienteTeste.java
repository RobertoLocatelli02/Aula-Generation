
public class clienteTeste {
	public static void main(String[] args) {
		
		cliente[] pessoa = new cliente [3];
		
		pessoa[0] = new cliente ("Roberto", "rlocatelli02@gmail.com", "Rua 123", "11948091727");
		pessoa[1] = new cliente ("Jos�", "jose@gmail.com", "Rua das goiabeiras", "11912345678");
		pessoa[2] = new cliente ("Maria", "maria@gmail.com", "Rua maria jos�", "11987654321");
		
		for (cliente loop : pessoa) {
			loop.imprimirInformacoes();
			System.out.println();
		}
	}
}
