// Multiplicação: Desenvolva um método estático para multiplicar dois números passados como parâmetros.

import java.util.Scanner;

public class Multiplicacao {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
		System.out.println("Bem-vindo ao programa que recebe dois números, multiplica e os retorna a soma deles. ");
		
		// declaração das variábeis
		double numero1;
		double numero2;
		double resultado;
		
		// entrada de dados
		System.out.println("Digite o valor do numero 1: ");
		numero1 = input.nextDouble();
		
		System.out.println("Digite o valor do numero 2: ");
		numero2 = input.nextDouble();
		
		// chamada para o metodo multiplicar os números
		resultado = multiplicaNumeros(numero1, numero2);
		
		// exibir o resultado
		System.out.println("O resultado da multiplicação dos números é: " + resultado);
		
	}
	
	// método para multiplicar os números  
	public static double multiplicaNumeros(double numero1,double numero2) {
	    
	    double resultado = numero1 * numero2;
	    
	    return resultado;
	}
}
