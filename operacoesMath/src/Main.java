// Desenvolva um programa que realize operações básicas (soma, subtração, multiplicação, divisão)
// entre dois números.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String operacao;

        int resposta = 0;
        int numero1;
        int numero2;

        // entrada dos números para as variáveis
        System.out.println("Digite um número: ");
        numero1 = input.nextInt();

        System.out.println("Digite outro número: ");
        numero2 = input.nextInt();

        System.out.println("Digite a operação (+, -, *, /): ");
        operacao = input.next();

        // operação switch para o usuário escolher qual tipo de operação deseja fazer
        switch(operacao){
            case "+":
                resposta = numero1 + numero2;
                break;
            case "-":
                resposta = numero1 - numero2;
                break;
            case "*":
                resposta = numero1 * numero2;
                break;
            case "/":
                resposta = numero1 / numero2;
                break;
            default:
                System.out.printf("%d%n", "Operação inválida");
                break;
        }
        // resultado da operação
        System.out.println("Operação " + operacao + " resultado: " + resposta);
    }

}