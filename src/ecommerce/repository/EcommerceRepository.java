package ecommerce.repository;

import ecommerce.model.Principal;
public interface EcommerceRepository {
	
	public void procurarPorCodigo(int codigo);
	public void listarTodos();
	public void cadastrar(Principal principal);
	public void atualizar(Principal principal);
	public void deletar(Principal principal);
}
