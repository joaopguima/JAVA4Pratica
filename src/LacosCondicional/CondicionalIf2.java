package LacosCondicional;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalIf2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Entre com o número");
		
		System.out.printf("Digite um número: ");
		numero = sc.nextInt();
		
		if(numero % 2 == 0 && numero > 0) {
			System.out.println("O número " + numero + " é par e positivo!");
		} else if(numero % 2 == 0 && numero < 0) {
			System.out.println("O número " + numero + " é par e negativo!");
		} else if(numero % 2 == 1 && numero > 0) {
			System.out.printf("O número " + numero + " é impar e positivo!");
		} else {
			System.out.printf("O número " + numero + " é impar e negativo!");
		}
		
		sc.close();
	}

}
