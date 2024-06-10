package Collections;

import java.util.*;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num;

		Set<Integer> listaNumeros = new HashSet<>();

		System.out.println("Digite 10 valores inteiros: ");

		for (int i = 0; i < 10; i++) {
			num = sc.nextInt();
			listaNumeros.add(num);
		}

		Iterator<Integer> iNumeros = listaNumeros.iterator();
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}

	}

}
