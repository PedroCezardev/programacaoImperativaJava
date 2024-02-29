// Encontra Elemento: Escreva um programa que verifica se um determinado elemento está presente em um array.

import java.util.Scanner;
import java.util.Arrays;

public class BuscaNumero {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Bem-vindo ao programa que busca um número dentro de um array. ");
		
		// declarando valores
		int[] array = new int[6];
		int numero;
		int comparador = 0;
		
		// laço de repetição para adicionar os valores no array
    	System.out.println("Digite os números do array: ");
    	for (int i = 0; i < array.length; i++) {
    	    System.out.println("vetor [" + (i + 1) + "]: ");
    	    array[i] = input.nextInt();
    	}
    	
    	// digitar o número procurado
    	System.out.println("Digite o número que você procura: ");
    	numero = input.nextInt();
    	
    	// laço for para incrementar o array
    	for (int i = 0; i < array.length; i++) {
    	    // condição para achar e exibir o numero procurado 
    	    if (verificarValor(array, numero)){
    	        System.out.println("O elemento " + numero + " está presente no array.");
    	        return;
    	    } else {
    	        System.out.println("Número não encontrado. ");
    	        return;
    	    }
    	}
	}
	
	// método para buscar o numero procurado
	public static boolean verificarValor(int[] array, int numero) { 
	    // Ordena o array para utilizar busca binária
        Arrays.sort(array);
        
        // Busca binária para verificar a presença do elemento no array ordenado
        int index = Arrays.binarySearch(array, numero);
        
        // Se o índice for maior ou igual a zero, significa que o elemento está presente
        return index >= 0;
	}
}
