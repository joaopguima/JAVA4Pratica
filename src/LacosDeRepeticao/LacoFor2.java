package LacosDeRepeticao;

import java.util.Scanner;

public class LacoFor2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero, par = 0, impar = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o " + i + "º número: ");
			numero = sc.nextInt();

			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("\nTotal de números pares: " + par);
		System.out.println("Total de números impares: " + impar);
	}

}
