// Inverte Array: Desenvolva um programa que inverte a ordem dos elementos de um array.

import java.util.Scanner;

public class InverterArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao programa que inverte a ordem dos elementos de um array. :)");

        // declaração dos arrays
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        // laço for para digitar os valores de um array
        System.out.println("Digite os valores do array: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("vetor [" + i + "]: ");
            array1[i] = input.nextInt();
        }

        // invertendo a ordem do array
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[10 - 1 - i];
        }

        // exibindo o array invertido
        for (int i = 0; i < array1.length; i++) {
            System.out.println("vetor [" + i + "]: " + array2[i]);
        }
        
    }    
}