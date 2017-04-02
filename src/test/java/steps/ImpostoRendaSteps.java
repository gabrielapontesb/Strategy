package steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import app.CalcularImposto;
import cdp.Salario;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class ImpostoRendaSteps {

	CalcularImposto calc = new CalcularImposto();
	List<Double> results = new ArrayList<Double>();
	Salario salario1 = new Salario();
	Salario salario2 = new Salario();
	Salario salario3 = new Salario();
	Salario salario4 = new Salario();
	Salario salario5 = new Salario();
	
	
	@Given("^O meu salario eh$")
	public void o_meu_salario_eh(List<Double> salarios) throws Throwable {
		
		salario1.setSalario(salarios.get(0));
		salario2.setSalario(salarios.get(1));
		salario3.setSalario(salarios.get(2));
		salario4.setSalario(salarios.get(3));
		salario5.setSalario(salarios.get(4));
	}

	@When("^Eu quero calcular o imposto de renda$")
	public void eu_quero_calcular_o_imposto_de_renda() throws Throwable {
		
		double result1 = calc.calcula(salario1.getSalario());
		double result2 = calc.calcula(salario2.getSalario());
		double result3 = calc.calcula(salario3.getSalario());
		double result4 = calc.calcula(salario4.getSalario());
		double result5 = calc.calcula(salario5.getSalario());
		
		results.add(result1);
		results.add(result2);
		results.add(result3);
		results.add(result4);
		results.add(result5);
	}

	@Then("^Eu vou pagar$")
	public void eu_vou_pagar(List<Double> impostos) throws Throwable {
		Assert.assertEquals(impostos.get(0), results.get(0));
		Assert.assertEquals(impostos.get(1), results.get(1));
		Assert.assertEquals(impostos.get(2), results.get(2));
		Assert.assertEquals(impostos.get(3), results.get(3));
		Assert.assertEquals(impostos.get(4), results.get(4));
		
	}
}
