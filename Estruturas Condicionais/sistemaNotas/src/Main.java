//  Faça um programa que leia três notas de um aluno, calcule e mostre a média aritmética
//  e a situação do aluno (aprovado se média >= 7).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // declaração de variáveis
        double faltas;
        double[] media = new double[4];
        double mediaFinal = 0;

        System.out.println("Bem-vindo ao programa que calcula notas e faltas de aluno, verifica e retorna se o usuário está aprovado, reprovado por média ou falta. Espero que goste! ;)");

        System.out.println("Digite o número de faltas do aluno: ");
        faltas = scanner.nextDouble();

        System.out.println("Digite a média do aluno: ");
        // laço for para adicionar as notas ao array e somar
        for (int i = 0; i < media.length; i++) {
            System.out.print("Nota [" + i + "]: ");
            media[i] = scanner.nextDouble();

            mediaFinal += media[i]; // Acumula as notas para calcular a média final
        }

        mediaFinal /= media.length; // Calcula a média final

        // condicional para decidir se o aluno foi reprovado ou aprovado
        if (faltas >= 15){
            System.out.println("Reprovado por falta, quantidade de falta excedida, limite do sistema: 15.0, faltas do aluno: " + faltas);
        } else if (mediaFinal < 7) {
            System.out.println("Aluno reprovado por média, média final baixa. Número de média do sistema: 7.0, media do aluno: "+ mediaFinal);
        } else {
            System.out.println("Aluno aprovado por média, a nota do aluno é maior que a média estabelecida. Parabêns sua média é: " + mediaFinal + " :)");
        }

    }
}