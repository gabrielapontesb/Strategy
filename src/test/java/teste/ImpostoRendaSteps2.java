package teste;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import app.CalcularImposto;
import cdp.Salario;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class ImpostoRendaSteps2 {

	CalcularImposto calc = new CalcularImposto();
	List<Salario> salarios = new ArrayList<Salario>();
	List<Double> resultados = new ArrayList<Double>();
	List<Double> esperados = new ArrayList<Double>();
	double result;
	
	@Given("^O meu salario eh$")
	public void o_meu_salario_eh(List<Salario> arg1) throws Throwable {
	    this.salarios = arg1;
	}

	@When("^Eu quero calcular o imposto de renda$")
	public void eu_quero_calcular_o_imposto_de_renda() throws Throwable {
	    for (Salario s: this.salarios){
	    	result = calc.calcula(s.getSalario());
	    }
	    resultados.add(result);
	}

	@Then("^Eu vou pagar$")
	public void eu_vou_pagar(List<Double> arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		for (double r: this.resultados){
			for (double e : this.esperados){
				Assert.assertEquals(r, e, 0.0);
			}
		}
	}
}
