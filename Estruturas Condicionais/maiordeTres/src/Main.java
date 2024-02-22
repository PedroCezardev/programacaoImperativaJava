// Maior de Três: Dados três números, imprima o maior deles.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;

        // entrada dos dados para cada variável
        System.out.println("Digite o 1° número pra ver qual é o maior: ");
        numero1 = input.nextInt();

        System.out.println("Digite o 2° número para fazer a análise: ");
        numero2 = input.nextInt();

        System.out.println("Digite o 3° número para fazer a análise: ");
        numero3 = input.nextInt();

        // calculo para saber quem é o maior número
        int maiorNumero = numero1;
        if (numero2 > maiorNumero) {
            maiorNumero = numero2;
        }
        if (numero3 > maiorNumero) {
            maiorNumero = numero3;
        }

        // saida dos dados
        System.out.println("O maior número é: " + maiorNumero);
    }
}