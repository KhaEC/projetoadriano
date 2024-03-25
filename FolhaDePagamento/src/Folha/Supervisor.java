package Folha;

public class Supervisor extends Comissionado {

	private Departamento departamento;
	
	public Supervisor(String nome, Departamento departamento) {
		super(nome);
		this.departamento = departamento;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	@Override
	public Double calcularSalario() {
		// TODO Auto-generated method stub
		return null;
	}

}
