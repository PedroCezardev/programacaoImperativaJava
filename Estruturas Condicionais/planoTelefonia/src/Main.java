// Plano de Telefonia: Baseado no consumo mensal de minutos, determine o plano mais econômico para o usuário.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int operacao;

        System.out.println("Bem-vindo ao programa que baseado no consumo mensal de minutos, determina o plano mais econômico para o usuário.");

        // entrada de dados
        System.out.println("Digite quantos minutos você deseja comprar. Temos planos apartir de 8640 minutos para baixo (1080, 2160, 4320, 8640): ");
        operacao = input.nextInt();

        // estrutura de decisão para ver qual melhor plano a decisão do cliente
        if (operacao <= 1080) {
            System.out.println("O plano pra você gastar menos, plano de minutos ilimitados por 1 semana está por apenas 15,00 R$.");
        } else if (operacao <= 2160) {
            System.out.println("Este é o plano intermediário, plano de minutos ilimitados por 1 mês está por apenas 30,00 R$.");
        } else if (operacao <= 4320) {
            System.out.println("Este é para aquelas pessoas que precisam de um pouco mais, plano de minutos ilimitados por 3 meses está por apenas 60,00 R$.");
        } else if (operacao <= 8640) {
            System.out.println("Este é o plano premium, para o seu maior conforto, plano de minutos ilimitados por 6 meses está por apenas 100,00 R$.");
        } else {
            System.out.println("Ainda não disponíbilizamos esse plano.");
            return;
        }

    }
}