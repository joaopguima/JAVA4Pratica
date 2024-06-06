package LacosDeRepeticao;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeros, somaPositivos = 0, somaNegativos = 0;
	
		System.out.printf("Digite um número: ");
		numeros = sc.nextInt();
		
		do {
			if(numeros > 0) {
				somaPositivos++;
				System.out.printf("Digite um número: ");
				numeros = sc.nextInt();
			} else {
				somaNegativos++;
				System.out.printf("Digite um número: ");
				numeros = sc.nextInt();
			}
		} while (numeros != 0);
			System.out.println("Você digitou 0 e o programa finalizou.");

			
		System.out.println("A soma dos números positivos é: " + somaPositivos);
		System.out.println("A soma dos números negativos é: " + somaNegativos);
		
	}
}