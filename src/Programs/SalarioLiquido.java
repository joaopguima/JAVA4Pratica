package Programs;

import java.util.Locale;
import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float salario, adicionalNoturno, horasExtras, descontos = 200, salarioLiquido;

		System.out.println("Entrada dos dados...");
		
		System.out.printf("Salario bruto: R$ " );
		salario = sc.nextFloat();
		
		System.out.printf("Adicional noturno: R$ " );
		adicionalNoturno = sc.nextFloat();
		
		System.out.printf("Horas Extras: R$ " );
		horasExtras = sc.nextFloat();
		
		salarioLiquido = salario + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("Salario líquido: R$ " + salarioLiquido);
		
		sc.close();
		
	}

}
