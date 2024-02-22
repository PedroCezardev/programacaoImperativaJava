// Calcule o valor a ser pago por um produto, considerando que o pagamento à vista tem desconto de 10% e no cartão tem acréscimo de 5%.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor;
        double resultado;
        int operacao;

        System.out.println("Bem vindo a calculadora de tarifa, calculamos quanto deu a sua tarifa no valor de sua compra.");

        // entrada de dados para entrar o valor
        System.out.println("Digite aqui quanto deu o valor da compra: ");
        valor = input.nextDouble();

        // escolher se a transação é a vista ou no cartão
        System.out.println("Digite 1 para transação á vista, ou 2 para transação no cartão: ");
        operacao = input.nextInt();

        // cálculo para as transações a vista ou no cartão
        switch (operacao) {
            case 1:
                resultado = valor * 0.9;
                break;
            case 2:
                resultado = valor * 1.05;
                break;
            default:
                System.out.println("Opção de pagamento inválida.");
                return;
        }

        // saida do resultado do calculo
        System.out.println("O valor final à vista será: " + resultado + " ;)");

    }
}