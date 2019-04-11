import java.util.Scanner;
import calculadora.*;

public class Main {

	public static void main(String[] args) {
		
	 GUI gui = new GUI();
	 Scanner sc = new Scanner(System.in);
	 Calculadora calc = new Calculadora();
	 
	
	 gui.primeiroInput();
	 calc.primeiroNumero = sc.nextDouble();
	 gui.segundoInput();
	 calc.segundoNumero = sc.nextDouble();
	 gui.menu();	 
	 calc.idOperacao = sc.nextInt();
	 while(calc.idOperacao > 5 || calc.idOperacao < 1) {
		 gui.mostrarErro();
		 gui.menu();
		 calc.idOperacao = sc.nextInt();
	 } 
	 
	 calc.resultadoOperacao = calc.calculaResultado(calc.primeiroNumero, calc.segundoNumero, calc.idOperacao);
	 gui.resultadoFinal(calc.resultadoOperacao);
	 sc.close();
	 }
}