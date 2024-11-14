package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Principal;
import ecommerce.repository.EcommerceRepository;

public class ContaController implements EcommerceRepository{
	
	private ArrayList<Principal> carrinhoProdutos = new  ArrayList<Principal>();
	int codigo = 0;
	
	@Override
	public void procurarPorCodigo(int codigo) {
	    var produto = buscarNaCollection(codigo);
	    
	    if(produto != null)
	    	produto.exibirProduto();
	    else
	    	System.out.println("\n O livro de código " + codigo + " não foi encontrado!");
	}

	@Override
	public void listarTodos() {
		for (var produtos : carrinhoProdutos) {
			produtos.exibirProduto();
		}
		
	}

	@Override
	public void cadastrar(Principal principal) {
		carrinhoProdutos.add(principal);
		System.out.print("\nO produto de código: " + principal.getCodigo() + " foi criado com sucesso!");
		
	}

	@Override
	public void atualizar(Principal principal) {
		var buscaLivro = buscarNaCollection(principal.getCodigo());
		
		
		if (buscaLivro!= null ) {
			carrinhoProdutos.set(carrinhoProdutos.indexOf(buscaLivro), principal);
			System.out.print("\nO livro de código: " + principal.getCodigo() + " foi atualizado com sucesso!");
		}else {
			System.out.print("\nO livro de código: " + principal.getCodigo() + " não foi encontrado!");
		}
		
	}

	@Override
	public void deletar(int codigo) {
		var produto = buscarNaCollection(codigo);
		
		if (produto != null) {
			if( carrinhoProdutos.remove(produto) == true)
				System.out.print("\nO livro de código: " + codigo + " foi deletado com sucesso!");
		}else {
			System.out.print("\nO livro de código: " + codigo + " foi deletado com sucesso!");
		}
			
		
	}
	
	public int gerarCodigo() {
		
		return ++ codigo;
	}
	
	public Principal buscarNaCollection(int codigo) {
		for (var produto : carrinhoProdutos) {
			if (produto.getCodigo() == codigo) {
				return produto;
			}
		}
		
		return null;
	}

}
