
//cadastrar cliente - nome + códigoID
//listar clientes - exibir clientes cadastrados
//obter cliente pelo códigoID ou pelo nome
//pesquisar clientes - condição de existencia do cliente
//status clientes - se está alugando, se tem alguma multa, etc.


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
		//cadastro/login do usuário
		System.out.println("\n(0) Cadastrar usuário \n(1) entrar \n(2) para encerrar o programa");
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
					System.out.println("Menu de opções: ");
					System.out.println("(0) alugar \n(1) devolver \n(2) verificar status de usuário");
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
					System.out.println("Nome não cadastrado, tente novamente!");
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
			System.out.println("Deseja buscar por: \n(0) nome \n(1) código de usuário");
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
			        	System.out.println(nome + " é cadastrado na loja com o código " + loop.getCodigoID());
			        }
				}
			if (condicao = false) {
				System.out.println(nome + " não é cadastrado na loja");
			}
			break;
			case 1:
				System.out.println("Informe o código do cliente: ");
				int codigo = scanner.nextInt();
				condicao = false;
				for(cadastroUsuario loop: usuarios) {
			       if (loop.getCodigoID() == codigo) {
			    	   condicao = true;
			    	   System.out.println(codigo + " é cadastrado na loja no nome de " + loop.getNome());
			       } else {
			    	   System.out.println(codigo + " não é cadastrado na loja");
				}
			}
		}
	}
}