package LacosDeRepeticao;

import java.util.Scanner;

public class DoWhile2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, somaMult3 = 0, contEntradas = 0;
		float media;
		
		do {
			System.out.printf("Digite um número: ");
			num = sc.nextInt();
			if(num % 3 == 0 && num != 0) {
				somaMult3 += num;
				contEntradas++;
			
			}
		} while (num != 0);

		
		media = somaMult3 / contEntradas;
		
		System.out.printf("A média de todos os números múltiplos de 3 é: %.2f", media);
		
	}	
}
