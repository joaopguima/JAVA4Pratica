package Collections;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> listaCores = new ArrayList<>();
		String cor;
		
		System.out.println("Digite as cores desejadas: ");
		for(int i = 0; i < 5; i++) {
			
			cor = sc.nextLine();
			listaCores.add(cor);
		}
		
		System.out.println("Lista de cores digitada:");
		System.out.println(listaCores);
		
		System.out.println("\nOrdenando a lista... \n\nLista ordenada: ");
		Collections.sort(listaCores);
		System.out.println(listaCores);

	}

}
