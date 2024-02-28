// Números Ímpares entre Dois Números: Desenvolva um programa que exiba todos os números ímpares
// entre dois números fornecidos pelo usuário, usando um loop for.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem-vindo ao programa que exibe os números impares entre dois números, espero que goste! :)");

        int[] numero = new int[2];

        System.out.println("Digite dois números: ");
        // laço para incrementar o array
        for (int i = 0; i < numero.length; i++) {
            System.out.print("Numero [" + (i + 1) + "]: ");
            numero[i] = input.nextInt();
        }

        // variáveis para determinar qual dos números é maior e qual é o menor
        int menor = Math.min(numero[0], numero[1]); // determina o menor número entre os dois números digitados pelo usuário
        int maior = Math.max(numero[0], numero[1]); // determina o maior número entre os dois números digitados pelo usuário

        System.out.println("Números ímpares entre " + menor + " e " + maior + ":");

        // laço para exibir os números impares no intervalo de números
        for (int i = menor; i <= maior; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}