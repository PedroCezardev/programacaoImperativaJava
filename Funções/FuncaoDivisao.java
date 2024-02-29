// Divisão: Implemente um método estático que divide um número pelo outro e retorna o resultado.

import java.util.Scanner;

public class FuncaoDivisao {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
		System.out.println("Bem-vindo ao programa que recebe dois números, divide e os retorna a soma deles. ");
		
		// declaração das variábeis
		double numero1;
		double numero2;
		double resultado;
		
		// entrada de dados
		System.out.println("Digite o valor do numero 1: ");
		numero1 = input.nextDouble();
		
		System.out.println("Digite o valor do numero 2: ");
		numero2 = input.nextDouble();
		
		// chamada para o metodo dividir os números
		resultado = divisaoNumeros(numero1, numero2);
		
		// exibir o resultado
		System.out.println("O resultado da divisão dos números é: " + resultado);
		
	}
	
	// método para dividir os números  
	public static double divisaoNumeros(double numero1,double numero2) {
	    
	    double resultado = numero1 / numero2;
	    
	    return resultado;
	}
}