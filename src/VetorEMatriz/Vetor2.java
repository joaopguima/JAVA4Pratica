package VetorEMatriz;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero, i, x;
		int[] vetorNumeros = new int[10];
		float media, soma = 0;

		System.out.println("Dada uma lista de 10 números, vamos analisar!");

		for (i = 0; i < vetorNumeros.length; i++) {
			System.out.printf("Digite o " + (i + 1) + "º número: ");
			numero = sc.nextInt();
			vetorNumeros[i] = numero;
			soma += numero;
		}

		System.out.println("Divisores pares: ");
		for (x = 0; x < vetorNumeros.length; x++) {
			if (vetorNumeros[x] % 2 == 0) {
				System.out.printf(vetorNumeros[x] + " ");
			}
		}

		System.out.println("\nDivisores impares: ");
		for (x = 0; x < vetorNumeros.length; x++) {
			if (vetorNumeros[x] % 2 == 1) {
				System.out.printf(vetorNumeros[x] + " ");
			}
		}

		System.out.println("\nSoma: " + soma);
		System.out.printf("Média: %.2f", (float) (media = soma / vetorNumeros.length));
	}
}