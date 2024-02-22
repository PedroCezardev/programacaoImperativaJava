// Verificador de Par ou Ímpar: Crie um programa que leia um número inteiro e imprima se é par ou ímpar.

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        // variável de quantidade e arrays para armazenar os valores
        int quantidade = 10;
        int[] par = new int[quantidade];
        int[] impar = new int [quantidade];

        // adicionando os números aleatórios nos arrays impar e par
        System.out.println("Escreva números pares: ");
        for(int i = 0; i < quantidade; i++){
            int numeroAleatorio = rand.nextInt(20) + 1;

            if (numeroAleatorio % 2 ==0) {
                par[i] = numeroAleatorio;
            } else {
                impar[i] = numeroAleatorio;
            }
        }

        // print dos números
        System.out.println("Estes são os números Pares: ");
        exibirvetor(par);

        System.out.println("Estes são os números Impares: ");
        exibirvetor(impar);

    }

    // método para identificar um número impar ou par
    public static void exibirvetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                System.out.println(vetor[i] + " ");
            }
        }
    }
}