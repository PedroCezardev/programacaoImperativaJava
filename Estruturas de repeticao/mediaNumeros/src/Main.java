// Média dos Números: Faça um programa que calcula a média de números inseridos pelo usuário até que ele digite 0.
// Utilize um loop while.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // adicionando variáveis
        double[] media = new double[4];
        double mediaFinal = 0;
        boolean continuar;

        System.out.println("Bem-vindo ao programa que calcula a média de números inseridos pelo usuário, espero que goste! ;)");

        // laço de repetição para o loop de gerar as medias
        do {
            System.out.println("Digite quatro números para o programa fazer a média: ");
            // laço for para incrementar os números de entrada no array
            for (int i = 0; i < media.length; i++) {
                System.out.println("Número [" + (i + 1) + "]: ");
                media[i] = input.nextDouble(); // adicionando a entrada no array

                mediaFinal += media[i]; // Acumula as notas para calcular a média final
            }
            mediaFinal /= media.length;// Calcula a média final
            System.out.println("A média dos números adicionados é: " + mediaFinal);

            System.out.println("Deseja continuar gerando números? (S/N)");
            char resposta = input.next().charAt(0);
            continuar = (resposta == 'S' || resposta == 's');
        } while (continuar);

        System.out.println("Código encerrado!");
    }
}