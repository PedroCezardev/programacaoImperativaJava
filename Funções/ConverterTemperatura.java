// Converte Celsius para Fahrenheit: Desenvolva um método estático que recebe um valor em Celsius e retorna o correspondente em Fahrenheit.

import java.util.Scanner;

public class ConverterTemperatura {
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

        converterTemperatura(Celsius, Fahrenheit);
        
        // Impressão dos valores convertidos para Fahrenheit
        System.out.println("Temperatura convertida para Fahrenheit:");
        for (int i = 0; i < Fahrenheit.length; i++) {
            System.out.println("vetorB[" + i + "]: " + Fahrenheit[i] + " ");
        }
        
        input.close();
    }
    
    // método para o calculo das temperaturas
    public static void converterTemperatura(float[] Celsius, float[] Fahrenheit) {
        
        for (int i = 0; i < Fahrenheit.length; i++) {
            Fahrenheit[i] = (Celsius[i] * 9.0f / 5.0f) + 32;
        }
    }
}
