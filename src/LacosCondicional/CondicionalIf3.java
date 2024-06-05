package LacosCondicional;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalIf3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome, resposta;
		int idade;
		boolean doacao = false;

		System.out.println("Entre com os dados do doador...");

		System.out.printf("Digite o nome do doador: ");
		nome = sc.nextLine();

		System.out.printf("Digite a idade do doador: ");
		idade = sc.nextInt();

		System.out.println("É sua primeira vez doando sangue? [SIM]/[NÃO]");
		sc.nextLine();
		resposta = sc.nextLine();

		if (resposta.equalsIgnoreCase("SIM")) {
			doacao = true;
		} else {
			doacao = false;
		}

		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && idade <= 69 && doacao == false) {
				System.out.println("O doador está apto(a) para fazer a doação de sangue!");
			} else {
				System.out.println("O doador não está apto(a) para fazer a doação de sangue!");
			}
		} else {
			System.out.println("O doador não possuí idade suficiente para doar sangue!");
		}
	}
}
