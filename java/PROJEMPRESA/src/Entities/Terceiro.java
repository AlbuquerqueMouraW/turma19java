package Entities;

public class Terceiro extends Funcionario {
	
	private double adicional;

	public Terceiro(String matricula, String nome, double adicional) {
		super(matricula, nome);
		this.adicional = adicional;
	}


	public Terceiro(String matricula, String nome, int horasTrabalhadas, double valorHoras, double adicional) {
		super(matricula, nome, horasTrabalhadas, valorHoras);
		this.adicional = adicional;
	}



	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	public double valorHora (double salario) {
		salario = this.getHorasTrabalhadas()*this.getValorHoras() + adicional;
		return salario;
	
	}
	
	
	
	
	

}
