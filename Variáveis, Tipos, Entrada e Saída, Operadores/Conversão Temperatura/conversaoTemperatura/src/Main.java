// Conversão de Temperatura: Escreva um programa que converta temperatura de
// Celsius para Fahrenheit. A fórmula é F = C * 9/5 + 32.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // arrays para entrada de temperatura
        float[] Celsius = new float[6];
        float[] Fahrenheit = new float[6];

        // entrada das temperaturas em graus celsius
        System.out.println("Digite a temperatura em Graus Celsius que você deseja converter:");
        for (int i = 0; i < Celsius.length; i++) {
            System.out.print("vetorA[" + i + "]: ");
            Celsius[i] = input.nextFloat();
        }

        // calculo das temperaturas e print dos valores em fahrenheit
        System.out.println("Temperatura convertida para Fahrenheit:");
        for (int i = 0; i < Fahrenheit.length; i++) {
            Fahrenheit[i] = (Celsius[i] * 9/5) + 32;
            System.out.println("vetorB[" + i + "]: " + Fahrenheit[i] + " ");
        }

        input.close();
    }
}