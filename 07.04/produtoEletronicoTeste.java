
public class produtoEletronicoTeste {
	public static void main(String[] args) {
		
		produtoEletronico[] produto = new produtoEletronico[4];
		
		produto[0] = new produtoEletronico ("Xiaomi", "Redmi note 9", 2020, 1599);
		produto[1] = new produtoEletronico ("Apple", "Iphone 12 Pro Max", 2020, 8200);
		produto[2] = new produtoEletronico ("Sony", "PlayStation 5", 2020, 5000);
		produto[3] = new produtoEletronico ("Microsoft", "Xbox series x", 2020, 5000);
		
		for (produtoEletronico loop : produto) {
			loop.imprimirInformacoes();
			System.out.println();
		}
	}
}
