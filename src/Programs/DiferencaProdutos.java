package Programs;

import java.util.Locale;
import java.util.Scanner;

public class DiferencaProdutos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.printf("Numero 1: " );
		n1 = sc.nextFloat();
		
		System.out.printf("Numero 2: " );
		n2 = sc.nextFloat();
		
		System.out.printf("Numero 3: " );
		n3 = sc.nextFloat();
		
		System.out.printf("Numero 4: " );
		n4 = sc.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("Diferença: " + diferenca);
		
		sc.close();

	}

}
