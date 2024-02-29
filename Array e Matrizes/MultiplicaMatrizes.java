// Multiplicação de Matrizes: Crie um programa que multiplica duas matrizes.

public class MultiplicaMatrizes {
	public static void main(String[] args) {
	    
		System.out.println("Bem-vindo ao programa que Multiplica duas matriz de mesmo tamanho e exibe. :)");

	// declaração da matriz
        int[][] matriz1 = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
        };
        
        int[][] matriz2 = {
            { 10, 11, 12, 13 },
            { 14, 15, 16, 17 },
            { 18, 19, 20, 21 },
            { 22, 23, 24, 25 }
        };
        
        int[][] multiplica = new int[matriz1.length][matriz1[0].length];
        
        // Exibe a matriz original
        System.out.println("\nPrimeira Matriz:");
        exibirMatriz(matriz1);

        System.out.println("\nSegunda Matriz:");
        exibirMatriz(matriz2);
    
        // Realiza a multiplicação das matrizes
        somarMatrizes(matriz1, matriz2, soma);
        
        // exibe o resultado da Multiplicação das matrizes
        System.out.println("O resultado das matrizes somadas é: ");
        exibirMatriz(multiplica);
        
	}
	
	// método para multiplicar as matrizes
	public static void somarMatrizes(int[][] matriz1, int[][] matriz2, int[][] resultado) {
	    int linhas = matriz1.length;
	    int colunas = matriz1.length;
	    
	    for (int i = 0; i < linhas; i++) {
	        for (int j = 0; j < colunas; j++) {
	            resultado[i][j] = matriz1[i][j] * matriz2[i][j];
	        }
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
