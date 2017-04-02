Feature: Calcular imposto de renda
	
Scenario: Calcular imposto de acordo com a categoria
	Given O meu salario eh 
		|1000|2000|3000|4000|5000|
	When Eu quero calcular o imposto de renda
	Then Eu vou pagar
		|0|150|450|900|1375|