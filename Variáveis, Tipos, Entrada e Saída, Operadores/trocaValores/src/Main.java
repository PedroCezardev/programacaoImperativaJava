// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroA;
        int numeroB;

        // entrada dos dados
        System.out.println("Digite o número da primeira posição: ");
        numeroA = input.nextInt();

        System.out.println("Digite o número da segunda posição: ");
        numeroB = input.nextInt();

        // calculo para mudar as posições
        numeroA = numeroA + numeroB;
        numeroB = numeroA - numeroB;
        numeroA = numeroA - numeroB;

        // print das posições
        System.out.println("Troca das variáveis realizada: ");
        System.out.println("numero A: " + numeroA);
        System.out.println("numero B: " + numeroB);
    }
}