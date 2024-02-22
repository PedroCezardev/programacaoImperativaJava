// Imposto de Renda: Calcule o imposto de renda a ser pago com base no salário anual do usuário, considerando diferentes faixas de tributação.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double operacao;
        double resultado;

        System.out.println("Bem-vindo ao programa que Calcula o imposto de renda a ser pago com base no salário anual do usuário, " +
                "considerando diferentes faixas de tributação. Espero que goste! ;)");

        // entrada dos dados
        System.out.println("Digite qual é o seu salário anual: ");
        resultado = input.nextDouble();

        // operação para calcular o imposto de renda apartir do salario do cliente
        if (resultado <= 740711) {
            System.out.println("Seu salário está livre do imposto de renda. ;)");
        } else if (resultado <= 992228) {
            operacao = resultado * 0.75;
            System.out.println("Seu salário vai ter 7,5% de imposto de renda, o valor final será: " + operacao);
        } else if (resultado <= 1316700) {
            operacao = resultado * 0.15;
            System.out.println("Seu salário vai ter 15.0% de imposto de renda, o valor final será: " + operacao);
        } else if (resultado <= 1638038) {
            operacao = resultado * 0.2250;
            System.out.println("Seu salário vai ter 22.5% de imposto de renda, o valor final será: " + operacao);
        } else if (resultado >= 1638039) {
            operacao = resultado * 0.2750;
            System.out.println("Seu salário vai ter 27.5% de imposto de renda, o valor final será: " + operacao);
        }

    }
}