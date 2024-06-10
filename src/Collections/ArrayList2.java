package Collections;

import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num = 0;
		ArrayList<Integer> listaNumeros = new ArrayList<>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

		while (num >= 0 && num <= 10) {
			System.out.println("Digite o número que você deseja encontrar: ");
			num = sc.nextInt();

			if (num >= 0 && num <= 10) {
				System.out.println("O número " + num + " está localizado na posição: " + listaNumeros.indexOf(num));
				break;
			} else {
				System.out.println("O número " + num + " não foi encontrado!");
			}
		}

	}
}