package OperadoresLogicos;

import java.util.Locale;
import java.util.Scanner;

public class SalarioEAbono {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.println("Iniciando o programa...");
		System.out.println("Digite o salário: ");
		salario = sc.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = sc.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("Exibe o Novo Salário: R$ " + novoSalario);
		
		sc.close();

	}

}
