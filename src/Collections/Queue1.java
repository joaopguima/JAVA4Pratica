package Collections;

import java.util.*;

public class Queue1 extends Opcoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Queue<String> filaCliente = new LinkedList<>();

		int opcao;
		String nome;

		do {

			OpcoesFila(args);

			System.out.println("Entre com a opção desejada: ");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Entre com o nome: ");
				sc.nextLine();
				nome = sc.nextLine();
				filaCliente.add(nome);
				System.out.println("Cliente adicionado! \n");
				break;
			case 2:
				if(!filaCliente.isEmpty()) {
				System.out.println("Listando todos os clientes: " + filaCliente);
				break;
				} else {
					System.out.println("Lista vazia...\n");
					break;
				}
				
			case 3:
				if (!filaCliente.isEmpty()) {
					System.out.println("Retirando cliente da fila...\n" + filaCliente.element() + " Você foi chamado!!");
					filaCliente.poll();
					System.out.println("Fila: " + filaCliente);
					System.out.println("O Cliente foi chamado! \n");
					break;
				} else {
					System.out.println("Fila vazia...\n");
					break;
				}
			case 0:
				System.out.println("Programa finalizado!");
				break;
			default:
				System.out.print("Opção inválido!\n");
			}
		} while (opcao != 0);
	}
}
