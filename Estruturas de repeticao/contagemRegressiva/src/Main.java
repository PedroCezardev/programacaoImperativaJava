// Contagem Regressiva: Crie um programa que exiba uma contagem regressiva de 100 até 1, utilizando um loop while.

public class Main {
    public static void main(String[] args) {

        System.out.printf("Bem-vindo ao programa que exibe de forma decrescente 100 números");

        int contador = 100;

        // Loop while para a contagem regressiva
        while (contador >= 1) {
            System.out.println(contador);
            contador--;
        }
    }
}