Feature: Calcular imposto de renda

Scenario: Imposto na categoria A
	Given O meu salario eh 1000 
	When Eu quero calcular o imposto
	Then Eu vou pagar 0 reais

Scenario: Imposto na categoria B
	Given O meu salario eh 2000
	When Eu quero calcular o imposto
	Then Eu vou pagar 150 reais
	
Scenario: Imposto na categoria C
	Given O meu salario eh 3000
	When Eu quero calcular o imposto
	Then Eu vou pagar 450 reais
	
Scenario: Imposto na categoria D
	Given O meu salario eh 4000
	When Eu quero calcular o imposto
	Then Eu vou pagar 900 reais
	
Scenario: Imposto na categoria E
	Given O meu salario eh 5000
	When Eu quero calcular o imposto
	Then Eu vou pagar 1375 reais
