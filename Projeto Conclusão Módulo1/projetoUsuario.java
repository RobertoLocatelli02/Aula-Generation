
//cadastrar cliente - nome + c�digoID
//listar clientes - exibir clientes cadastrados
//obter cliente pelo c�digoID ou pelo nome
//pesquisar clientes - condi��o de existencia do cliente
//status clientes - se est� alugando, se tem alguma multa, etc.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class projetoUsuario {
	public static void main(String[] args) {
		
		int codigoID = 0;
		String nomeNovo;
		boolean condicao;
		
				
		Scanner scanner = new Scanner (System.in);
		List<cadastroUsuario> usuarios = new ArrayList<cadastroUsuario>();

		int op;
		do {
		//cadastro/login do usu�rio
		System.out.println("\n(0) Cadastrar usu�rio \n(1) entrar \n(2) para encerrar o programa");
		op = scanner.nextInt();
		switch (op) {
			case 0:
				System.out.println("\nCadastro do cliente: ");
				System.out.println("Nome: ");
				nomeNovo = scanner.next().toLowerCase();
				codigoID++;
				cadastroUsuario cliente = new cadastroUsuario(nomeNovo,codigoID);
				usuarios.add(cliente);
				break;
			case 1:
				System.out.println("Informe seu nome: ");
				String nomeCadastrado = scanner.next().toLowerCase();
				if (usuarios.contains(nomeCadastrado)) {
					System.out.println("Menu de op��es: ");
					System.out.println("(0) alugar \n(1) devolver \n(2) verificar status de usu�rio");
					int op2 = scanner.nextInt();
					
					//parte com o edu
					switch (op2) {
					case 0: 
						break;
					case 1:
						break;
					case 2:
						break;
					}
				} else {
					System.out.println("Nome n�o cadastrado, tente novamente!");
				}
		} 
		} while (op != 2);
		
		//listar os clientes
		System.out.println("---------------------------");
		for (cadastroUsuario loop : usuarios) {
			System.out.println(loop.getNome());
			System.out.println(loop.getCodigoID());
			System.out.println("---------------------------");
		}
		//buscar clientes
			System.out.println("Buscar clientes: ");
			System.out.println("Deseja buscar por: \n(0) nome \n(1) c�digo de usu�rio");
			int op3 = scanner.nextInt();
			
			
			switch (op3) {
			case 0:
				System.out.println("Informe o nome do cliente: ");
				String nome = scanner.next();
				cadastroUsuario teste = new cadastroUsuario (nome,codigoID);
				condicao = false;
				for(cadastroUsuario loop: usuarios) {
			        if(loop.getNome().equals(nome)) {
			        	condicao = true;
			        	System.out.println(nome + " � cadastrado na loja com o c�digo " + loop.getCodigoID());
			        }
				}
			if (condicao = false) {
				System.out.println(nome + " n�o � cadastrado na loja");
			}
			break;
			case 1:
				System.out.println("Informe o c�digo do cliente: ");
				int codigo = scanner.nextInt();
				condicao = false;
				for(cadastroUsuario loop: usuarios) {
			       if (loop.getCodigoID() == codigo) {
			    	   condicao = true;
			    	   System.out.println(codigo + " � cadastrado na loja no nome de " + loop.getNome());
			       } else {
			    	   System.out.println(codigo + " n�o � cadastrado na loja");
				}
			}
		}
	}
}