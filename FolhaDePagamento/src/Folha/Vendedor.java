package Folha;

import java.util.ArrayList;
import java.util.List;

public class Vendedor implements Pessoa {

	private String nome;
	private List<Venda> listaDeVendas;
	
	public Vendedor(String nome) {
		super();
		this.nome = nome;
		this.listaDeVendas = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Venda> getListaDeVendas() {
		return listaDeVendas;
	}

	
	
	
	@Override
	public Double calcularSalario() {
		// TODO Auto-generated method stub
		return null;
	}

}
