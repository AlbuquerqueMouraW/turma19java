package POO;

public class Exercicio2classe {

	public String modelo;
	public String tipo;
	public String companhia;
	public char nacInt;
	
	public String tipoVoo() {
		String recebeVoo = "";
	if (nacInt == '1') {
		recebeVoo = "Voo Nacional";
	} else if (nacInt =='2') {
		recebeVoo = "Voo Internacional";
		
	}
	return recebeVoo;
	
	}
	
	
	
}
