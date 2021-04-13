package Entities;

public class Funcionario {
	
	private String matricula;
	private String nome;
	private int horasTrabalhadas;
	private double valorHoras;
	
	
	public Funcionario(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}


	public Funcionario(String matricula, String nome, int horasTrabalhadas, double valorHoras) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHoras = valorHoras;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}


	public double getValorHoras() {
		return valorHoras;
	}


	public void setValorHoras(double valorHoras) {
		this.valorHoras = valorHoras;
	}
	
	public double valorSalario() {
		return horasTrabalhadas* valorHoras;
		
	}
	
	
		

}
