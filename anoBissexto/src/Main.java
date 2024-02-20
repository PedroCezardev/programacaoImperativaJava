// Escreva um programa que determine se um ano (entrada do usuário) é bissexto.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ano;

        System.out.println("Digite o ano que você deseja analisar: ");
        ano = input.nextInt();

        // verifica se o ano é divisível por 4 e não é divisível por 100, ou se é divisível por 400.
        // Se uma dessas condições for verdadeira, o ano é considerado bissexto
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

    }
}