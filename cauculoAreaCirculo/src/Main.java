// Escreva um programa que leia o raio de um círculo e calcule sua área (A = πr^2).
// Use Math.PI para o valor de π.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declaração das variáveis para entrada de das
        double raioCirculo;
        double area;

        // entrada de dados do raio do circulo
        System.out.println("Digite o número do raio para fazer o cálculo da área: ");
        raioCirculo = input.nextDouble();

        // calculo da area do circulo
        area =  Math.PI * raioCirculo * raioCirculo;

        System.out.println("A área do circulo é: " + area);

    }
}