package VetorEMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] matrizNumeros = new int[3][3];
		int linha, coluna, somaPrincipal = 0, somaSecundaria = 0;

		for (linha = 0; linha < matrizNumeros.length; linha++) {
			for (coluna = 0; coluna < matrizNumeros.length; coluna++) {
				System.out.printf("Entre com o valor da linha [" + linha + "]" + " e coluna [" + coluna + "]: ");
				matrizNumeros[linha][coluna] = sc.nextInt();
			}
		}

		System.out.println("\nElementos da Diagonal Principal: ");
		for (linha = 0; linha < matrizNumeros.length; linha++) {
			System.out.printf(matrizNumeros[linha][linha] + " ");
			somaPrincipal += matrizNumeros[linha][linha];
		}

		System.out.println("\nElementos da Diagonal Secundaria: ");
		for (linha = 0; linha < matrizNumeros.length; linha++) {
			System.out.printf(matrizNumeros[linha][(2 - linha)] + " ");
			somaSecundaria += matrizNumeros[linha][linha];
		}

		System.out.println("\nSoma dos elementos principais: " + somaPrincipal);
		System.out.println("\nSoma dos elementos secundários: " + somaSecundaria);

	}
}
