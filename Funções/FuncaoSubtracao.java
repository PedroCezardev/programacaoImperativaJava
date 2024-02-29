// Função Subtração: Crie um método estático que realiza a subtração entre dois números fornecidos como argumentos.

import java.util.Scanner;

public class FuncaoSubtracao {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
		System.out.println("Bem-vindo ao programa que recebe dois números, subtrai e os retorna a soma deles. ");
		
		// declaração das variábeis
		double numero1;
		double numero2;
		double resultado;
		
		// entrada de dados
		System.out.println("Digite o valor do numero 1: ");
		numero1 = input.nextDouble();
		
		System.out.println("Digite o valor do numero 2: ");
		numero2 = input.nextDouble();
		
		// chamada para o metodo subtrair os números
		resultado = subtrairNumeros(numero1, numero2);
		
		// exibir o resultado
		System.out.println("O resultado da subtração dos números é: " + resultado);
		
	}
	
	// método para subtrair os números  
	public static double subtrairNumeros(double numero1,double numero2) {
	    
	    double resultado = numero1 - numero2;
	    
	    return resultado;
	}
}
