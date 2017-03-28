package cdp;

import util.IStrategy;

public class CategoriaC implements IStrategy{

	public double calculaIR(double salario) {
		return salario * 0.15;
	}	
}
