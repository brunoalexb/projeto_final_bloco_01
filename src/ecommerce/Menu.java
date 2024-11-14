package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.controller.ContaController;
import ecommerce.model.Estendida;
import ecommerce.util.Cores;


public class Menu {

	public static void main(String[] args) {
		
		ContaController produtos = new ContaController(); 
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, numeroPaginas, codigo;
		String tipo;
		float preco;
		
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
			
			
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}
			
			
			
			if(opcao == 6) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nSebo Mundo - temos um mundo inteiro para você!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Inserir o livro\n\n");
				
				codigo = produtos.gerarCodigo();
				
				System.out.print("Digite o preço do livro: ");
		        preco = leia.nextFloat();
		        
		        System.out.print("Digite o tipo do livro(aventura/romance/ficção científica): ");
		        leia.nextLine(); 
		        tipo = leia.nextLine();
		        
		        System.out.print("Digite o numero de páginas: ");
		        numeroPaginas = leia.nextInt();
		        
		        
				Estendida novoProduto = new Estendida(codigo, preco, tipo, numeroPaginas);
				produtos.cadastrar(novoProduto);
				
				keyPress();
				break;
				
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todos os livros\n\n");
				
				produtos.listarTodos();
				keyPress();
				break;
				
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar o livro - por código\n\n");
				
				System.out.println("Digite o código do livro: ");
				codigo = leia.nextInt();
				
				produtos.procurarPorCodigo(codigo);
				
				keyPress();
				break;
				
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados do livro\n\n");
				
				System.out.print("Digite o código do livro: ");
				codigo = leia.nextInt();
				
				var buscaLivro = produtos.buscarNaCollection(codigo);
				if(buscaLivro != null ) {
					System.out.print("Digite o preço do livro: ");
			        preco = leia.nextFloat();
			        
			        System.out.print("Digite o tipo do livro(aventura/romance/ficção científica): ");
			        leia.nextLine(); 
			        tipo = leia.nextLine();
			        
			        System.out.print("Digite o numero de páginas: ");
			        numeroPaginas = leia.nextInt();
			        
			        produtos.atualizar(new Estendida(codigo, preco, tipo, numeroPaginas));
				}else {
					System.out.println("Livro não encontrado para atualização.");
				}
				
				
				keyPress();
				break;
				
			case 5:
				System.out.println(Cores.TEXT_RED +"Apagar o produto\n\n");
				
				System.out.println("Digite o código do livro: ");
				codigo = leia.nextInt();
				
				
				produtos.deletar(codigo);
				
				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
				keyPress();
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
	
	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
