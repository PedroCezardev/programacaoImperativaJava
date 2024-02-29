// Verifica Primo: Crie um método estático que recebe um número e verifica se ele é primo, retornando um valor booleano.

import java.util.Scanner;

public class VerificaPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem-vindo ao verificador de números primos!");

        // Inicialização das variáveis
        int numero;
        boolean continuar;

        // Loop para verificar números primos
        do {
            System.out.println("\nDigite um número para verificar se é primo: ");
            numero = input.nextInt(); // Entrada do número

            // Verificação se o número é primo
            if (isPrimo(numero)) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }

            // Pergunta se deseja continuar
            System.out.println("Deseja verificar outro número? (S/N)");
            char resposta = input.next().charAt(0);
            continuar = (resposta == 'S' || resposta == 's');
            
            if (!continuar) {
                System.out.println("Obrigado por usar nosso verificador de números primos!");
            }
        } while (continuar);

        input.close();
    }

    // Método para verificar se um número é primo
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

