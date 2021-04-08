package Entity;

public class Conta {

	//atributos
	public int numero;
	public String cpf;
	public double saldo;
	public boolean ativa;
	
	public Conta() {
		
	}
	
	
	public void debito(double valor) {
		saldo = saldo - valor;
	}
	
	public void credito(double valor) {
		saldo = saldo + valor;
	}
	
	
	
	
}
