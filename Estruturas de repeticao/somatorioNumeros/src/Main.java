// Somatório de Números: Desenvolva um programa que soma números de 1 até N, onde N é um valor inserido pelo usuário.
// Use um loop do-while.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declaração das variaveis
        int tamanho = 0;
        int[] array = new int[tamanho];
        boolean continuar;

        do{

            // entrada para o usuário
            System.out.println("Digite a quantidade de números que você deseja gerar: ");
            tamanho = input.nextInt();

            // laço for para incrementar os número no array
            for (int i = 0; i <= tamanho; i++) {
                System.out.println("Número = " + i);
            }

            // solicitação se o usuário deseja continuar gerando os números ou não
            System.out.println("Você deseja continuar gerando os números? ");
            char resposta = input.next().charAt(0);
            continuar = (resposta == 'S' || resposta == 's');

        } while (continuar);
    }
}