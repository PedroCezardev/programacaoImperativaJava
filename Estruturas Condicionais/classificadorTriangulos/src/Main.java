// Classificador de Triângulos: Dado três lados, determine se formam um triângulo e, em caso afirmativo, se é equilátero, isósceles ou escaleno.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo ao programa que lê a entrada dos 3 lados do triângulo e " +
                "retorna se é equilátero, isósceles ou escaleno. Aproveite! ;)");

        // entrada de dados nas variáveis
        System.out.println("Digite o comprimento dos três lados do triângulo:");
        double lado1 = input.nextDouble();
        double lado2 = input.nextDouble();
        double lado3 = input.nextDouble();

        // verificar qual o tipo de triangulo
        if (verificarTriangulo(lado1, lado2, lado3)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("É um Triângulo Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É um Triângulo Isósceles.");
            } else {
                System.out.println("É um Triângulo Escaleno.");
            }
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }
    }

    // metodo para calculo o triangulo
    public static boolean verificarTriangulo(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
}