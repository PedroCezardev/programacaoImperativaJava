// Números Pares até 100: Crie um programa que exiba todos os números pares de 1 até 100 utilizando um loop for.

public class Main {
    public static void main(String[] args) {

        System.out.printf("Bem-vindo ao programa que exibe números pares de 1 até 100, espero que goste! :)");

        // Laço for para incrementar os números pares
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}