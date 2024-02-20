// Calculadora de IMC: Crie um programa que calcule o Índice de Massa Corporal (IMC) de uma pessoa.
// IMC = peso (kg) / (altura (m))^2.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // variáveis para adicionar o peso e a altura da pessoa
        double massaCorpo;
        double altura;

        // entrada de dados da massa corporal
        System.out.println("Digite a massa corporal da pessoa que deseja calcular:");
        massaCorpo = input.nextDouble();

        // entrada de dados para altura
        System.out.println("Digite a altura da pessoa:");
        altura = input.nextDouble();

        // calculo do IMC
        double IMC = massaCorpo / (altura * altura);

        System.out.println("O cálculo do IMC da pessoa é: " + IMC);

    }
}
