package calculadora;

public class GUI {

	public void menu() {
		
		System.out.println("Qual operação deseja realizar? (Digite 9 para sair)\n");
		System.out.println("1 - Soma");
		System.out.println("2 - Subração");
		System.out.println("3 - Divisão");
		System.out.println("4 - Multiplicação");
		System.out.println("5 - Média\n");	
		System.out.println("-> ");			
	}
	
	public void primeiroInput() {
		
		System.out.println("Digite o primeiro número: ");
	}
	public void segundoInput() {
		
		System.out.println("Digite o segundo número: ");
	}
	public void resultadoFinal(double resultadoFinal) {
		
		System.out.println("O resultado final é: " + resultadoFinal);
	}
	public void mostrarErro() {
		System.out.println("Operação Inválida, tente novamente");
	}
}
