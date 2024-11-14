package ecommerce.model;

public abstract class Principal {
	
	
	private int codigo;
	private float preco;
	private String tipo;
	
	
	public Principal(int codigo, float preco, String tipo) {
		this.codigo = codigo;
		this.preco = preco;
		this.tipo = tipo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public abstract float aplicarDesconto();
	
	public void exibirProduto(){
		System.out.print("Codigo: " + codigo);
		System.out.print("Preço: " + preco);
		System.out.print("Tipo de livro: " + tipo);
	}
}
