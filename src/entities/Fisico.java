package entities;

public class Fisico extends Contribuintes{
	
	private Double healthIncome;
	
	public Fisico() {
		super();
	}

	public Fisico(String name, Double income, Double healthIncome) {
		super(name, income);
		this.healthIncome = healthIncome;
	}

	public Double getHealthIncome() {
		return healthIncome;
	}

	public void setHealthIncome(Double healthIncome) {
		this.healthIncome = healthIncome;
	}
	
	public Double totalHealth() {
		return healthIncome * 0.5;
	}
	
	@Override
	public Double calculateTax() {
		if(getIncome() < 20000.00) {
			return getIncome() * (0.15) - totalHealth();  
		}
		else {
			return getIncome() * (0.25) - totalHealth();  
		}
	}
	

}
