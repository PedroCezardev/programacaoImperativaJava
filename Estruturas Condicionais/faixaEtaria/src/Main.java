// Faixa Etária: Dada a idade de uma pessoa, classifique-a em: criança, adolescente, adulto, ou idoso.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.println("Bem-vindo ao programa que lê a idade da pessoa e classifica se é criança, adulto, ou idoso. Aproveite!");

        System.out.println("Escreva a idade da pessoa: ");
        idade = input.nextInt();

        // lógica para saber a faixa etária da pessoa
        if (idade <= 10) {
            System.out.println("Esta pessoa é uma criança.");
        } else if (idade <= 20) {
            System.out.println("Esta pessoa é um adolescente");
        } else if (idade <= 59) {
            System.out.println("Esta pessoa é um adulto");
        } else if (idade <= 120) {
            System.out.println("Esta pessoa é um idoso");
        } else if (idade >= 121) {
            System.out.println("Esta pessoa foi de base (morreu) :(");
        } else {
            return;
        }

    }
}