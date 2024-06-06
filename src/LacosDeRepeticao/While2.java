package LacosDeRepeticao;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade, genero, dev, contDev = 0, somaIdades = 0, devBack = 0, mulETransBack = 0, homETrans = 0, nbiEFull = 0,
				pesquisa = 0;
		float mediaIdade = 0;

		String listaGenero = "1 - Mulher Cis\n" + "2 - Homem Cis\n" + "3 - Não Binário\n" + "4 - Mulher Trans\n"
				+ "5 - Homem Trans\n" + "6 - Outros", resposta = "s";
		String listaDesenvolvedor = "1 - Backend\n" + "2 - Frontend\n" + "3 - Mobile\n" + "4 - FullStack";

		while (resposta.equalsIgnoreCase("S")) {
			System.out.printf("Digite a idade: ");
			idade = sc.nextInt();

			somaIdades += idade;

			System.out.printf("\nLista de gênero\n" + listaGenero + "\n\nCód. Genero: ");
			genero = sc.nextInt();

			System.out.println("\nPessoa desenvolvedora\n" + listaDesenvolvedor + "\n\nCód. Desenvolvedor: ");
			dev = sc.nextInt();

			if (dev == 1) {
				devBack += 1;
			}
			if ((genero == 1 || genero == 4) && dev == 1) {
				mulETransBack += 1;
			} 
			if ((genero == 2 || genero == 5) && dev == 3 && idade > 40) {
				homETrans += 1;
			}
			if (genero == 3 && dev == 4 && idade < 30) {
				nbiEFull += 1;
			}
			pesquisa += 1;

			System.out.printf("Deseja continuar (S/N): ");
			sc.nextLine();
			resposta = sc.nextLine();
		}

		mediaIdade = somaIdades / pesquisa;

		System.out.println("\nTotal de pessoas desenvolvedoras BackEnd " + devBack);
		System.out.println("Total de Homens Cis e Trans desenvolvedores mobile maiores de 40 anos: " + homETrans);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + nbiEFull);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + pesquisa);
		System.out.println("A média da idade das pessoas que responderam à pesquisa: " + mediaIdade);

	}

}
