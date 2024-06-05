package LacosCondicional;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalIf1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, soma;
		
		System.out.printf("Entre com os valores de A, B e C: ");
		
		System.out.printf("\nDigite o número A: ");
		a = sc.nextInt();
		
		System.out.printf("Digite o número B: ");
		b = sc.nextInt();
		
		System.out.printf("Digite o número C: ");
		c = sc.nextInt();
		
		soma = a + b;
		
		if (soma > c) {
			System.out.println("A soma de A + B é igual a " + soma + ", consequente maior do que C, que vale: " + c);			
		} else if (soma < c) {
			System.out.println("A soma de A + B é igual a " + soma + ", consequente menor do que C, que vale: " + c);	
		} else {
			System.out.println("A soma de A + B é igual a " + soma + ", consequente igual a C, que também vale: " + c);
		}
	
		sc.close();
	}

}
