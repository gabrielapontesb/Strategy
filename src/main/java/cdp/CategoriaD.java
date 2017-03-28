package cdp;

import util.IStrategy;

public class CategoriaD implements IStrategy{

	public double calculaIR(double salario) {
		return salario * 0.225;
	}	

}
