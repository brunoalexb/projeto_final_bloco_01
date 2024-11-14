package ecommerce.model;

public class Estendida extends Principal{
	
	private int numeroPaginas;
	
	public Estendida(int codigo, int preco, String tipo, int numeroPaginas) {
		super(codigo, preco, tipo);
		this.numeroPaginas = numeroPaginas;	
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	@Override
	public float aplicarDesconto() {
		return getPreco() * 0.15f; 
	}
	
	@Override
	public void exibirProduto(){
		super.exibirProduto(); 
		System.out.print("Número de páginas: " + numeroPaginas);
	}
}
