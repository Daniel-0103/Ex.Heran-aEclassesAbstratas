package entities;

public abstract class Contribuintes {
	
	private String name;
	private Double income;
	
	public Contribuintes() {}

	public Contribuintes(String name, Double income) {
		this.name = name;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}
	
	public abstract Double calculateTax(); 
	

}
