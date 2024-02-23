// Jogo de Adivinhação: Peça ao usuário para adivinhar um número entre 1 e 10 e informe se ele acertou ou não.

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // inicialização das bibliotecas de entrada e sorteio
        Scanner input = new Scanner(System.in);
        Random sort = new Random();

        // declaração das varáveis para o calculo
        int tentativa;
        int sorteio = sort.nextInt(50) + 1;
        int contador;
        boolean continuar;

        System.out.println("Bem-vindo do Jogo da Adivinhação, aqui o programa sorteia um número e a sua missão é tentar acertar o número, você tem 10 tentativas, comece Já! ;)");

        do {
            // Sorteia um novo número para cada nova partida
            sorteio = sort.nextInt(10) + 1;

            // Reinicia o contador a cada nova tentativa
            contador = 0;

                // laço while para contar o número de vezes jogadas e repetir o código da verificação do número
            while (contador < 10) {
                // entrada do número pelo usuário
                System.out.println("Digite um número para jogar: ");
                tentativa = input.nextInt();

                // condição para saber se a tentativa é menor, maior ou igual ao número sorteado.
                if (tentativa > sorteio) {
                    System.out.println("O número sorteado é menor, tente novamente!");
                } else if (tentativa < sorteio) {
                    System.out.println("O número sorteado é maior, tente novamente!");
                } else if (tentativa == sorteio) {
                    System.out.println("Você acertou o número sorteado, parabéns! '" + sorteio + "' ;)");
                    break;
                } else {
                    System.out.println("Expirou o némero de chances dísponível, comece novamente. :)");
                    return;
                }
                // contador para ir acrescentando o número de vezes jogadas.
                contador++;
            }

            // se o jogador excedeu o número de tentativas essa mensagem será exibida
            if (contador == 10) {
                System.out.println("Expirou o número de tentativas disponíveis. O número sorteado era: " + sorteio);
            }

            // Verifica se o usuário deseja continuar jogando
            System.out.println("Deseja continuar jogando? (S/N)");
            char resposta = input.next().charAt(0);
            continuar = (resposta == 'S' || resposta == 's');
        } while (continuar);

        System.out.println("Obrigado por jogar! ;)");
    }
}