package Folha;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Comissionado {

	private List<Supervisor> listaDeSupervisores;
	
	public Gerente(String nome) {
		super(nome);
		this.listaDeSupervisores = new ArrayList<Supervisor>();
	}

	public List<Supervisor> getListaDeSupervisores() {
		return listaDeSupervisores;
	}


	@Override
	public Double calcularSalario() {
		// TODO Auto-generated method stub
		return null;
	}

}
