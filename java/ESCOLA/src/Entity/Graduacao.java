package Entity;

public class Graduacao extends Estudantes {
	
	private double bonus;

	public Graduacao(int matricula, String cpf, double bonus) {
		super(matricula, cpf);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}