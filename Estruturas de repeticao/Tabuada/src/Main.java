// Tabuada: Escreva um programa que recebe um número do usuário e imprime a tabuada desse número de 1 a 10, usando um loop for.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // inicializando variáveis
        int numero;
        boolean continuar;

        System.out.println("Bem-vindo ao programa de Tabuada, onde você informa o número e o programa retorna a tabuada, espero que goste! :)");

        // laço de repetição para rodar um codigo em loop
        do {
            System.out.println("Digite um número para executar a tabuada: ");
            numero = input.nextInt();

            // laço para incrementação dos numeros de 0 a 10
            for (int i = 0; i < 11; i++) {
                System.out.println(numero + "x" + i + " = " + (numero * i));
            }

            // pergunta se o usuário deseja continuar gerando os números ou não
            System.out.println("Deseja continuar gerando números? (S/N)");
            char resposta = input.next().charAt(0);
            continuar = (resposta == 'S' || resposta == 's');
        } while (continuar);

        System.out.println("Programa encerrado!");
    }
}