package Folha;

public abstract class Comissionado implements Pessoa {

	private String nome;
	
	public Comissionado(String nome) {
		super();
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract Double calcularSalario();

}
