package entities;

public class Juridico extends Contribuintes{
	
	private Integer numberEmployee;
	
	public Juridico() {
		super();
	}

	public Juridico(String name, Double income, Integer numberEmployee) {
		super(name, income);
		this.numberEmployee = numberEmployee;
	}

	public Integer getNumberEmployee() {
		return numberEmployee;
	}

	public void setNumberEmployee(Integer numberEmployee) {
		this.numberEmployee = numberEmployee;
	}
	
	@Override
	public Double calculateTax() {
		if(numberEmployee > 10) {
			return getIncome() * (0.14);
		}
		else {
			return getIncome() *(0.16);
		}
	}
	
	

}
