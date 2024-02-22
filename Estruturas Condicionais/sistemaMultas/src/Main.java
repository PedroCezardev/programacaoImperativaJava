// Calcule o valor da multa a ser paga de acordo com a velocidade capturada em relação ao limite permitido.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double velocidade;
        double limite;
        double valorPago;

        System.out.println("Calcule o valor da multa a ser paga de acordo com a velocidade capturada, espero que goste ;)");

        // entrada de dados
        System.out.println("Digite a velocidade: ");
        velocidade = input.nextDouble();

        System.out.println("Digite o limite permitido da via (40, 60, 80, 100 ou 120): ");
        limite = input.nextDouble();

        // calculo e verificação do valor pago e da velocidade permitida
        // se a velocidade passar do limite aceito ele faz o calculo
        if (limite == 40) {
                valorPago = velocidade * 40;
                // se a velocidade for menor que o limite permitido ele retorna esta mensagem
                if (velocidade < 40) {
                    System.out.println("O veículo está na velocidade permitida. ");
                    return;
                }
            } else if (limite == 60) {
                valorPago = velocidade * 60;
                if (velocidade < 60) {
                    System.out.println("O veículo está na velocidade permitida. ");
                    return;
                }
            } else if (limite == 80) {
                valorPago = velocidade * 80;
                if (velocidade < 80) {
                    System.out.println("O veículo está na velocidade permitida. ");
                    return;
                }
            } else if (limite == 100) {
                valorPago = velocidade * 100;
                if (velocidade < 100) {
                    System.out.println("O veículo está na velocidade permitida. ");
                    return;
                }
            } else if (limite == 120) {
                valorPago = velocidade * 120;
                if (velocidade < 120) {
                    System.out.println("O veículo está na velocidade permitida. ");
                    return;
                }
        } else {
            // se o usuário adicionar uma velocidade que não esta entre as que o programa recomendou previamente, retorna a seguinte mensagem
            System.out.println("Limite de velocidade inválido.");
            return;
        }

        // retorno para o usuário
        System.out.println("A multa a pagar pelo excesso de velocidade é: " + valorPago);

    }
}