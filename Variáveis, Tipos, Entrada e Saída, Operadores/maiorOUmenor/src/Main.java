//  Escreva um programa que leia dois números e indique qual é o maior, o menor ou se são iguais.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // váriáveis usada para armazenar números
        double numero1;
        double numero2;
        double resultado = 0;

        // entrada de dados
        System.out.println("Digite um número: ");
        numero1 = input.nextDouble();

        System.out.println("Digite outro número: ");
        numero2 = input.nextDouble();

        // estrutura de decisão para saber qual número é maior ou se eles são iguais.
        if (numero1 > numero2) {
            System.out.println("O primeiro número é maior.");
        } else if (numero1 < numero2) {
            System.out.println("O primeiro número é menor.");
        } else {
            System.out.println("Os números são iguais.");
        }

    }
}