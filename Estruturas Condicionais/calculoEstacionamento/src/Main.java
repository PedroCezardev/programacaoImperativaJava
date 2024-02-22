// Estacionamento: Calcule o valor a ser pago pelo estacionamento baseando-se no tempo de permanência.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tempo;
        double resultado;

        System.out.println("Hello and welcome!");

        // entrada de dados
        System.out.println("Digite o tempo que vc deseja passar no estacionamento: ");
        tempo = input.nextDouble();

        // condição para calcular o valor
        if (tempo <= 30) {
            resultado = tempo / 3;
            System.out.println("O tempo de até 30 minutos tem um preço fixo de: " + resultado);
        } else if (tempo <= 60) {
            resultado = tempo / 3;
            System.out.println("O tempo de até 60 minutos tem um preço fixo de: " + resultado);
        } else if (tempo <= 120) {
            resultado = tempo / 3;
            System.out.println("O tempo de até 2 horas tem um preço fixo de: " + resultado);
        } else if (tempo >= 121) {
            resultado = tempo / 3;
            System.out.println("O tempo de até 2 horas tem um preço fixo de: " + resultado);
        } else {
            System.out.println("Não aderimos esse plano ainda, veja outro plano que desponíbilizamos.");
        }
    }
}