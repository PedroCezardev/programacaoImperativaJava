// Função Soma: Escreva um método estático que receba dois números como parâmetros e retorne a soma deles.

import java.util.Scanner;

public class FuncaoSoma {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
		System.out.println("Bem-vindo ao programa que recebe dois números, soma e os retorna a soma deles. ");
		
		// declaração das variábeis
		double numero1;
		double numero2;
		double resultado;
		
		// entrada de dados
		System.out.println("Digite o valor do numero 1: ");
		numero1 = input.nextDouble();
		
		System.out.println("Digite o valor do numero 2: ");
		numero2 = input.nextDouble();
		
		// chamada para o metodo somar os números
		resultado = somaNumeros(numero1, numero2);
		
		// exibir o resultado
		System.out.println("O resultado da soma dos números é: " + resultado);
		
	}
	
	// método para somar os números  
	public static double somaNumeros(double numero1,double numero2) {
	    
	    double resultado = numero1 + numero2;
	    
	    return resultado;
	}
}
