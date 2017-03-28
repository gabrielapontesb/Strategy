package app;

import cdp.CategoriaA;
import cdp.CategoriaB;
import cdp.CategoriaC;
import cdp.CategoriaD;
import cdp.CategoriaE;

public class CalcularImposto {
	
	public double calcula(double salario){
		
		if (salario < 1710.78){
			CategoriaA a = new CategoriaA();
			return a.calculaIR(salario);
		}
		
		else if (salario > 1710.79 && salario < 2563.91){
			CategoriaB b = new CategoriaB();
			return b.calculaIR(salario);
		}
		
		else if (salario > 2563.92 && salario < 3418.59){
			CategoriaC c = new CategoriaC();
			return c.calculaIR(salario);
		}
		
		else if (salario > 3418.6 && salario < 4271.59){
			CategoriaD d = new CategoriaD();
			return d.calculaIR(salario);
		}
		
		else {
			CategoriaE e = new CategoriaE();
			return e.calculaIR(salario);
		}
	}
}
