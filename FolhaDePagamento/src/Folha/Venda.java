package Folha;

public class Venda {

	private String produto;
	private Double valor;
	public Venda(String produto, Double valor) {
		super();
		this.produto = produto;
		this.valor = valor;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
	
	
}
