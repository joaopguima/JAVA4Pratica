package Collections;

import java.util.*;

public class Pilha01 extends Opcoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int opcao;
		String livro;
		Stack<String> pilhaLivro = new Stack<>();

		do {
			OpcoesPilha(args);

			System.out.printf("Entre com a opção desejada: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.printf("Digite o nome: ");
				sc.nextLine();
				livro = sc.nextLine();
				pilhaLivro.add(livro);
				break;
			case 2:
				if (!pilhaLivro.isEmpty()) {
					System.out.printf("Lista de livros na Pilha: " + pilhaLivro + "\n");
					break;
				} else {
					System.out.println("Lista de livros vazia...\n");
					break;
				}
			case 3:
				System.out.println("Pilha: ");
				System.out.println("O livro " + pilhaLivro.peek() + " está sendo retirado da pilha\n");
				pilhaLivro.pop();
				System.out.println("Um livro foi retirado da pilha!\n");
				break;
			case 0:
				System.out.println("Programa finalizado");
			}

		} while (opcao != 0);

	}

}
