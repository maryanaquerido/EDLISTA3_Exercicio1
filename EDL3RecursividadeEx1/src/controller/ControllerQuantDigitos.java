package controller;

public class ControllerQuantDigitos {
	public ControllerQuantDigitos () {
		super();
		}
	
	public static int QuantDigitos (int num) {
		if (num == 0) { // CONDIÇÃO DE PARADA: QUANDO NUM FOR 0, RETORNAMOS 0, JÁ QUE OS DÍGITOS PARA CONTAR ACABARAM
			return 0;
			
		}
		else {
			return 1 + QuantDigitos(num / 10);
		}
	}

}

// COMO ESCREVER A FUNÇÃO PARA O TERMO N EM FUNÇÃO DO TERMNO ANTERIOR? 
//SEMPRE QUE CHAMAMOS A FUNÇÃO DIVIDIMOS NUM POR 10. JÁ QUE ESTAMOS TRABALHANDO COM INT, 
//A VÍRGULA SE DESLOCA IGNORANDO OS VALORES A DIREITA E SOMAMOS  1 AO RESULTADO DA CHAMADA 
//ANTERIOR. ESSA SOMA DE 1, ACUMULADO EM QUANT, REPRESENTA O TERMO ATUAL EM FUNÇÃO DO TERMO ANTERIOR.