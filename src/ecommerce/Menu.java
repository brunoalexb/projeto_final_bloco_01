package ecommerce;

import java.util.Scanner;
import ecommerce.util.Cores;


public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		while (true) {

			System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                     Sebo Mundo                      ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Inserir produto                      ");
			System.out.println("            2 - Listar todos os produtos             ");
			System.out.println("            3 - Buscar produto                       ");
			System.out.println("            4 - Atualizar produto                    ");
			System.out.println("            5 - Apagar produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
			
			if(opcao == 6) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nSebo Mundo - temos um mundo inteiro para você!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Inserir produtos\n\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todos os produtos\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados do produto - por número\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados do produto\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_RED +"Apagar o produto\n\n");

				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
				break;
			}
			
	}
		
	}
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Agradecemos a preferência!");
		System.out.println("Sebo Mundo - sebovelharias@coisavelha.com");
		System.out.println("***********************************************************");
	}
}
