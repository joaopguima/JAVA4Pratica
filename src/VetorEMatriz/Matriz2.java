package VetorEMatriz;

import java.util.Locale;
import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float[][] matrizReal = new float[10][4];
		int linha, coluna;
		float somaNota = 0;
		float[] vetorMedia = new float[10];

		for (linha = 0; linha < matrizReal.length; linha++) {
			for (coluna = 0; coluna < 4; coluna++) {
				System.out.printf("Entre com o valor da linha [" + linha + "] e coluna [" + coluna + "]: ");
				matrizReal[linha][coluna] = sc.nextFloat();
				if (matrizReal[linha][coluna] < 0 || matrizReal[linha][coluna] > 10) {
					System.out.println(
							"Erro de digitação, a nota não pode ser menor do 0 e maior do que 10\nRetornando para o início do programa");
					main(null);
				} else {
					somaNota += matrizReal[linha][coluna];
				}
			}
			vetorMedia[linha] = somaNota / 4;
			somaNota = 0;

		}

		for (int i = 0; i < 10; i++) {
			System.out.printf("A média do aluno " + (i + 1) + " foi: %.1f\n", vetorMedia[i]);
		}

		System.out.println();

	}

}
