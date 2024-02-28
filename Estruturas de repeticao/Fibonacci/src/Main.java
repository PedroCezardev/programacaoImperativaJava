// Fibonacci: Crie um programa que gere a sequência de Fibonacci até um termo N, que é inserido pelo usuário.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem-vindo ao programa que gera a sequência de Fibonacci!");

        int numero;
        int primeiroTermo = 0; // Inicializando os primeiros dois termos da sequência de Fibonacci
        int segundoTermo = 1;
        int proximoTermo;  // Inicializando uma variável para armazenar o próximo termo da sequência

        System.out.println("Digite o número de termos que você deseja gerar na sequência de Fibonacci: ");
        numero = input.nextInt();

        System.out.println("Sequência de Fibonacci até o termo " + numero + ":");

        // Exibe os primeiros dois termos, pois eles são conhecidos
        System.out.print(primeiroTermo + ", " + segundoTermo);

        // Iteramos para gerar os próximos termos da sequência até o número desejado de termos
        for (int i = 3; i <= numero; i++) {
            // O próximo termo é a soma dos dois termos anteriores
            proximoTermo = primeiroTermo + segundoTermo;

            // Exibimos o próximo termo
            System.out.print(", " + proximoTermo);

            // Atualizamos os dois termos anteriores para os próximos cálculos
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
        System.out.println();
    }
}