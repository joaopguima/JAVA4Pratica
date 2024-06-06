package LacosDeRepeticao;

import java.util.Scanner;

public class LacoFor1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1, n2;

		System.out.printf("Digite o primeiro número do intervalo: ");
		n1 = sc.nextInt();
		System.out.printf("Digite o último número do intervalo: ");
		n2 = sc.nextInt();

		if (n1 > n2) {
			System.out.println("Opção inválida!");
		} else {
			System.out.println("No intervalo entre " + n1 + " e " + n2);
			for (int x = n1; x <= n2; x++) {
				if (x % 3 == 0 && x % 5 == 0) {
					System.out.println(x + " é múltiplo de 3 e 5");
				}
			}
		}
		sc.close();
	}
}

