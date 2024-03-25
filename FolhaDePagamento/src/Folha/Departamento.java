package Folha;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

	private String nome;
	private Integer id;
	private List<Vendedor> listaDeVendedores;
	public Departamento(String nome, Integer id) {
		super();
		this.nome = nome;
		this.id = id;
		this.listaDeVendedores = new ArrayList<Vendedor>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Vendedor> getListaDeVendedores() {
		return listaDeVendedores;
	}
	
	
	




}
