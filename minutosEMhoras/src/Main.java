// Crie um programa que converta uma quantidade de minutos em horas e minutos
// (exemplo: 90 minutos = 1 hora e 30 minutos).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minutos;
        int horas;
        int minutosRest;

        System.out.println("Digite quantos minutos você deseja converter: ");
        minutos = input.nextInt();

        // calculo para converter horas em minutos
        horas = minutos / 60;
        minutosRest = minutos % 60;

        System.out.println(minutos + " minutos equivalem a " + horas + " horas e " + minutosRest + " minutos.");
    }
}