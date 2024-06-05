package LacosCondicional;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		int codigo;
		float salario, reajuste, novoSalario;

		System.out.println("Código do Cargo Cargo \t Reajuste");
		System.out.println("\n********************************");
		System.out.println("1  \t\tGerente  10%");
		System.out.println("2  \t\tVendedor  7%");
		System.out.println("3  \t\tSupervisor 9%");
		System.out.println("4  \t\tMotorista 6%");
		System.out.println("5  \t\tEstoquista 5%");
		System.out.println("6  \t\tTec. de TI 8%");
		System.out.println("********************************");

		System.out.printf("Nome do colaborador: ");
		nome = sc.nextLine();
		System.out.printf("Cargo: ");
		codigo = sc.nextInt();
		System.out.printf("Salário: R$ ");
		salario = sc.nextFloat();

		switch (codigo) {
		case 1:
			reajuste = (float) 0.10;
			novoSalario = salario + (reajuste * salario);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			System.out.println("Salário: R$ " + novoSalario);
			break;
		case 2:
			reajuste = (float) 0.07;
			novoSalario = salario + (reajuste * salario);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			System.out.println("Salário: R$ " + novoSalario);
			break;
		case 3:
			reajuste = (float) 0.09;
			novoSalario = salario + (reajuste * salario);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			System.out.println("Salário: R$ " + novoSalario);
			break;
		case 4:
			reajuste = (float) 0.06;
			novoSalario = salario + (reajuste * salario);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Motorista");
			System.out.println("Salário: R$ " + novoSalario);
			break;
		case 5:
			reajuste = (float) 0.05;
			novoSalario = salario + (reajuste * salario);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Estoquista");
			System.out.println("Salário: R$ " + novoSalario);
			break;
		case 6:
			reajuste = (float) 0.08;
			novoSalario = salario + (reajuste * salario);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Tec. de TI");
			System.out.println("Salário: R$ " + novoSalario);
			break;
		default:
			System.out.println("Opção inválida!");
		}
		
		sc.close();
	}

}
