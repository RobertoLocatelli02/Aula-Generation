
public class funcionarioTeste {
	public static void main(String[] args) {
		
		funcionario[] pessoa = new funcionario[3];
		
		pessoa[0] = new funcionario ("Jos�", 43, "celulares", "2 anos", 4700);
		pessoa[1] = new funcionario ("Maria", 8, "carro", "8 meses", 3400);
		pessoa[2] = new funcionario ("Joaquim", 137, "produtos aliment�cios", "1 ano", 4000);
		
		for (funcionario loop : pessoa) {
			loop.imprimirInformacoes();
			System.out.println();
		}
	}
}
