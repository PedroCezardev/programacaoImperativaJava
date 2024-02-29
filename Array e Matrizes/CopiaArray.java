// Cópia de Array: Crie um programa que copia um array para outro.

import java.util.Scanner;

public class CopiaArray {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
		System.out.println("Hello World");
		
		// declarando os arrays
		int[] array1 = new int[6];
		int[] array2 = new int[6];
		
		// laço incremental para digitar os valores
		System.out.println("Digite os números do Array: ");
		for (int i = 0; i < array1.length; i++ ) {
		    System.out.println("array1 [" + i + "]: ");
		    array1[i] = input.nextInt();
		}
		
		// laço incremental para adicionar os valores no array 2 e exibir
		for (int i = 0; i < array1.length; i++ ) {
		    array2[i] = array1[i];   
		    
		    System.out.println("Os valores do array2 são: " + array2[i]);
		}
		
		System.out.println("\nPrograma finalizado.");
	}
}
