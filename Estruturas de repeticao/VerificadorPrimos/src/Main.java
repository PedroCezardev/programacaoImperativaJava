// Verificador de Primos: Desenvolva um programa que verifica se um número N inserido é primo ou não.
// Use estruturas de repetição para verificar.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem-vindo ao programa que verifica se um número inserido é primo ou não, espero que goste! :)");

        // inicialização das variáveis
        int numero;
        boolean continuar;

        // laço de repetição para que o usuário continue gerando os números
        do {
            System.out.println("Digite um número para realizar a verificação: ");
            numero = input.nextInt(); // entrada do número na variável

            // estrutura de decisão se o número é ou não primo
            if (isPrimo(numero)) {
                System.out.println(numero + " é um número primo. ");
            } else {
                System.out.println(numero + " não é um número primo.");
            }

            // pergunta se o usuário deseja ou não continuar rodando o programa
            System.out.println("Você deseja continuar gerando números? (S/N)");
            char resposta = input.next().charAt(0);
            continuar = (resposta == 'S' || resposta == 's');
        } while (continuar);

    }
    // método para calcular o número primo
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}