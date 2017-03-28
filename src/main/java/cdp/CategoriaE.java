package cdp;

import util.IStrategy;

public class CategoriaE implements IStrategy{

	public double calculaIR(double salario) {
		return salario * 0.275;
	}	

}
