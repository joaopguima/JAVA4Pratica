package LacosCondicional;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;
		float valorTotal;

		System.out.println("***BEM VINDO AO DOGÃO DA TIA, SIGA O CARDÁPIO***");
		System.out.println("\n********************************");
		System.out.println("1 - Cachorro Quente - R$ 10.00");
		System.out.println("2 - X-Salada - R$ 10.00");
		System.out.println("3 - X-Bacon - R$ 10.00");
		System.out.println("4 - Bauru - R$ 10.00");
		System.out.println("5 - Refrigerante - R$ 10.00");
		System.out.println("6 - Suco de laranja - R$ 10.00");
		System.out.println("********************************");

		System.out.printf("\nSelecione o código do seu pedido: ");
		codigo = sc.nextInt();

		System.out.printf("\nSelecione a quantidade: ");
		quantidade = sc.nextInt();

		switch (codigo) {
		case 1:
			System.out.println("Produto: Cachorro Quente");
			valorTotal = (int) (quantidade * 10.0);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		case 2:
			System.out.println("Produto: X-Salada");
			valorTotal = (int) (quantidade * 15.00);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		case 3:
			System.out.println("Produto: X-Bacon");
			valorTotal = (int) (quantidade * 18.00);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		case 4:
			System.out.println("Produto: Bauru");
			valorTotal = (int) (quantidade * 12.00);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		case 5:
			System.out.println("Produto: Refrigerante");
			valorTotal = (int) (quantidade * 8.00);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		case 6:
			System.out.println("Produto: Suco de Laranja");
			valorTotal = (int) (quantidade * 13.00);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		default:
			System.out.println("Opção inválida!");
		}
		sc.close();
	}

}
