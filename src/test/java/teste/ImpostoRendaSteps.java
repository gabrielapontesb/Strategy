package teste;

import org.junit.Assert;

import app.CalcularImposto;
import cdp.Salario;
import cucumber.api.java.en.*;

/**
 * @author gabi
 */
 public class ImpostoRendaSteps{
	
	CalcularImposto calc = new CalcularImposto();
	Salario salario = new Salario();
	double result;
	
	@Given("^O meu salario eh (\\d+)$")
	public void o_meu_salario_eh(int arg1) throws Throwable {
		salario.setSalario(1000);
	}

	@When("^Eu quero calcular o imposto$")
	public void eu_quero_calcular_o_imposto() throws Throwable {
	    result = calc.calcula(salario.getSalario());
	}

	@Then("^Eu vou pagar (\\d+) reais$")
	public void eu_vou_pagar_reais(int arg1) throws Throwable {
	    Assert.assertEquals(0, result, 0.0);
	}
	
}
