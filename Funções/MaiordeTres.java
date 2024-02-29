// Maior de Três: Crie um método estático que recebe três números como parâmetros e retorna o maior deles.

import java.util.Scanner;

public class MaiordeTres {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
		System.out.println("Bem-vindo ao programa que recebe dois números soma e os retorna a soma deles. ");
		
		// declaração das variábeis
		double numero1;
		double numero2;
		double numero3;
		double maiorNumero;
		
		// entrada de dados
		System.out.println("Digite o valor do numero 1: ");
		numero1 = input.nextDouble();
		
		System.out.println("Digite o valor do numero 2: ");
		numero2 = input.nextDouble();
		
		System.out.println("Digite o valor do numero 3: ");
		numero3 = input.nextDouble();
		
		// chamada para o metodo identificar o maior número
		maiorNumero = maiorNumero(numero1, numero2, numero3);
		
		// exibir o resultado
		System.out.println("O maior número digitado é: " + maiorNumero);
		
	}
	
	// método para identificar o maior número
	public static double maiorNumero(double numero1, double numero2, double numero3) {
	    
	    double maiorNumero = numero1;
	    
        if (numero2 > maiorNumero) {
            maiorNumero = numero2;
        }
        if (numero3 > maiorNumero) {
            maiorNumero = numero3;
        }
	    
	    return maiorNumero;
	}
}
