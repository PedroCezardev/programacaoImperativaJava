// Zerando a Diagonal: Implemente um programa que zera os elementos da diagonal principal de uma matriz.

public class ZerandoDiagonal {
  public static void main (String[]args) {
      
      System.out.println("Bem-vindo ao programa que zera a diagonal principal de uma matriz. :)");

	// declaração da matriz
        int[][] matriz = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
        };
        
       // Exibe a matriz original
        System.out.println("\nMatriz original:");
        exibirMatriz(matriz);
        
        // Zera os elementos da diagonal principal da matriz
        zerarDiagonalPrincipal(matriz);
        
        // Exibe a matriz após zerar os elementos da diagonal principal
        System.out.println("\nMatriz após zerar diagonal principal:");
        exibirMatriz(matriz);
        
    }
    
    // Método para zerar os elementos da diagonal principal de uma matriz
    public static void zerarDiagonalPrincipal(int[][] matriz) {
        int tamanho = Math.min(matriz.length, matriz[0].length);
        
        // laço for para incrementar os valores e adicionar 0
        for (int i = 0; i < tamanho; i++) {
            matriz[i][i] = 0;
        }
    }
    
    // Método para exibir uma matriz
    public static void exibirMatriz(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        
        // laço for para incrementar nas linhas e colunas da matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}