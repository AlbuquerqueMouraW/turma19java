package Entity;

public class Estudantes {
	
	private int matricula;
	private String cpf;
	private double pontos;
	private boolean status;
	
	public Estudantes(int matricula, String cpf) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
	}
	public int getMatricula() {
		return matricula;
	}
	/*public void setMatricula(int matricula) {
		this.matricula = matricula;
	}*/
	public String getCpf() {
		return cpf;
	}
	/*public void setCpf(String cpf) {
		this.cpf = cpf;
	}*/
	public double getPontos() {
		return pontos;
	}
	/*public void setPontos(double pontos) {
		this.pontos = pontos;
	}*/
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void adicionarNota(double notas) {
		this.pontos += notas;
	}
	
	public void tirarNota(double notas) {
		this.pontos -= notas;
	}

}