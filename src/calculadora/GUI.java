package calculadora;

public class GUI {

	public void menu() {
		
		System.out.println("Qual opera��o deseja realizar? (Digite 9 para sair)\n");
		System.out.println("1 - Soma");
		System.out.println("2 - Subra��o");
		System.out.println("3 - Divis�o");
		System.out.println("4 - Multiplica��o");
		System.out.println("5 - M�dia\n");	
		System.out.println("-> ");			
	}
	
	public void primeiroInput() {
		
		System.out.println("Digite o primeiro n�mero: ");
	}
	public void segundoInput() {
		
		System.out.println("Digite o segundo n�mero: ");
	}
	public void resultadoFinal(double resultadoFinal) {
		
		System.out.println("O resultado final �: " + resultadoFinal);
	}
	public void mostrarErro() {
		System.out.println("Opera��o Inv�lida, tente novamente");
	}
}
