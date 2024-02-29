// Matriz Transposta: Implemente um programa que gera a transposta de uma matriz dada.

public class MatrizTransposta {
  public static void main (String[]args) {
      
      System.out.println("Bem-vindo ao programa que transpor os valores de uma matriz. :)");

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
        
        // Calcula e exibe a transposta da matriz
        int[][] transposta = calcularTransposta(matriz);
        System.out.println("\nTransposta da matriz: ");
        exibirMatriz(transposta);
  }
  
  // método para calcular a matriz transposta
  public static int[][] calcularTransposta(int [][] matriz) {
      int linhas = matriz.length;
      int colunas = matriz[0].length;
      
      // Cria uma nova matriz para armazenar a transposta
      int[][] transposta = new int[colunas][linhas];
      
      // laço for para incrementar e transpor os valores na matriz
      for (int i = 0; i < linhas; i++ ) {
          for (int j = 0; j < colunas; j++) {
              transposta[j][i] = matriz[i][j];
          }
      }
      
      return transposta;
  }
  
  // método para exibir os valores das matrizes
  public static void exibirMatriz(int[][] matriz) {
      int linhas = matriz.length;
      int colunas = matriz[0].length;
      
      // laço for para incrementar e exibir a matriz
      for (int i = 0; i < linhas; i++) {
          for (int j = 0; j < colunas; j++) {
              System.out.print(matriz[i][j] + " ");
          }
          System.out.println();
      }
      
  }
}
