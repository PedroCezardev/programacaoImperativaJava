// Fatorial: Escreva um programa que calcula o fatorial de um número N fornecido pelo usuário, usando um loop while.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem-vindo ao programa que calcula o fatorial de um número e o exibe, espero que goste! :)");

        // inicializando variáveis
        int numero;
        int fatorial = 1;
        int contador = 1;

        // entrada do número
        System.out.println("Digite um número para calcular o fatorial: ");
        numero = input.nextInt();

        // calculo do número fatorial
        while (contador <= numero) {
            fatorial *= contador;
            contador++;
        }

        // exibe o número
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}