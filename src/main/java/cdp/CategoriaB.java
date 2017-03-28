package cdp;

import util.IStrategy;

public class CategoriaB implements IStrategy{

	public double calculaIR(double salario) {
		return salario * 0.075;
	}	
}
