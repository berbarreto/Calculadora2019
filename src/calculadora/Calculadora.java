package calculadora;
import operacoes.*;

public class Calculadora extends Operadores {
	
	
	public double calculaResultado(double primeroNumero, double segundoNumero, int idOperacao) {
		
		switch(idOperacao) {
			
		case 1:
			Soma soma = new Soma();
			return soma.resultadoSoma(primeroNumero, segundoNumero);
		case 2:
			Subtracao sub = new Subtracao();
			return sub.resultadoSubtracao(primeroNumero, segundoNumero);
		case 3:
			Divisao div = new Divisao();
			return div.resultadoDivisao(primeroNumero, segundoNumero);
		case 4:
			Multiplicacao mult = new Multiplicacao();
			return mult.resultadoMultiplicacao(primeroNumero, segundoNumero);
		case 5:
			Media med = new Media();
			return med.resultadoMedia(primeroNumero, segundoNumero);
		default:
			return 0;	
		}
	}
}
