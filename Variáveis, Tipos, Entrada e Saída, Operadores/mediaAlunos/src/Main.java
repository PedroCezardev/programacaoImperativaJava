//  Faça um programa que leia três notas de um aluno, calcule e mostre a média aritmética
//  e a situação do aluno (aprovado se média >= 7).


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // digitar o numero do estudantes
        System.out.print("Digite o número de estudantes: ");
        int numEstudantes = scanner.nextInt();

        // declarando variáveis
        int[] notas = new int[numEstudantes];
        int soma = 0;

        // codigo para calcular a media dos alunos
        for (int i = 0; i < numEstudantes; i++) {
            int nota;
            do {
                // digitar a nota dos estudantes
                System.out.printf("Digite a nota do estudante %d (0 a 10): ", (i+1));
                nota = scanner.nextInt();
                // codigo para calcular a média aritmérica das notas
            }while (nota < 0 || nota > 10 );

            notas[i] = nota;
            soma += nota;
        }
        // codigo para armazenar a media dos estudantes e mostrar na tela
        double media = (double) soma / numEstudantes;
        System.out.println("A média aritmética das notas é: " + media);

    }
}