package Collections;

import java.util.*;

public class Set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num;
		Set<Integer> listaNumeros = new HashSet<>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

		System.out.println("Digite o número que você deseja encontrar: ");
		num = sc.nextInt();
		
		for(Integer numList : listaNumeros) {
			if(listaNumeros.contains(num)) {
				System.out.println("O número " + num + " foi encontrado!");	
				break;
			} else {
				System.out.println("O número " + num + " não foi encontrado!");	
				break;
			}
		}

	}

}
