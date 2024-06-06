package LacosDeRepeticao;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade, menor, maior, contIdade = 0, maiorIdade = 0, outrasIdades = 0;

		System.out.printf("Digite uma idade: ");
		idade = sc.nextInt();

		while (idade != 0) {
			if (idade < 21) {
				contIdade++;
			} else if (idade >= 50) {
				maiorIdade++;
			} else {
				outrasIdades++;
			}
			System.out.printf("Digite 0 se desejar sair!");
			System.out.printf("\nDigite uma idade: ");
			idade = sc.nextInt();
		}
		System.out.println("Total de pessoas menores de 21 anos: " + contIdade);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiorIdade);
		System.out.println("Total de pessoas entre 21 e 50 anos: " + outrasIdades);
	}

}
