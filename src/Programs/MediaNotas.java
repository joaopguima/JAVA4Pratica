package Programs;

import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float n1, n2, n3, n4, media;
		
		System.out.println("Leia as notas do participante...");
		
		System.out.println("Nota 1: ");
		n1 = sc.nextFloat();
		
		System.out.println("Nota 2: ");
		n2 = sc.nextFloat();
		
		System.out.println("Nota 3: ");
		n3 = sc.nextFloat();
		
		System.out.println("Nota 4: ");
		n4 = sc.nextFloat();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.printf("Média final: %.1f", media);
		
		sc.close();

	}

}
