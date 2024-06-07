package VetorEMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int localizar;
		boolean encontrado = false;
		String continuacao;

		System.out.printf("Digite o número que você deseja encontrar: ");
		localizar = sc.nextInt();

		for (int x = 0; x < vetor.length; x++) {
			if (vetor[x] == localizar) {// compara se a posição do vetor está igual ao número digitado na variável
				System.out.println("O número " + localizar + " está na posição: " + x);
				return; // Encontra o número e finaliza o laço de repetição.
			}
		}
		
		if (!encontrado) {
			System.out.println("O número " + localizar + " não foi encontrado");
			System.out.printf("Deseja retornar e buscar novamente? [S/N]: ");
			sc.nextLine();
			continuacao = sc.nextLine();
			if(continuacao.equalsIgnoreCase("S")) {
				main(null);
			} else if(continuacao.equalsIgnoreCase("N")){
				System.out.println("Programa finalizado!");
				return;
			} else {
				System.out.println("Opção inválida, programa finalizado...");
			}
		}
	}
}