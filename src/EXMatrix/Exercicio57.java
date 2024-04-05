package EXMatrix;

import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de linhas da matriz A: ");
        int linhasA = scanner.nextInt();
        System.out.print("Informe o número de colunas da matriz A: ");
        int colunasA = scanner.nextInt();
        System.out.print("Informe o número de linhas da matriz B: ");
        int linhasB = scanner.nextInt();
        System.out.print("Informe o número de colunas da matriz B: ");
        int colunasB = scanner.nextInt();

        if (colunasA != linhasB) {
            System.out.println("Não é possível calcular a matriz produto.");
        }

        int[][] matrizA = lerMatriz(scanner, linhasA, colunasA);
        int[][] matrizB = lerMatriz(scanner, linhasB, colunasB);

        int[][] produto = new int[linhasA][colunasB];
        for (int i = 0; i < linhasA; i++)
            for (int j = 0; j < colunasB; j++)
                for (int k = 0; k < colunasA; k++)
                    produto[i][j] += matrizA[i][k] * matrizB[k][j];

        exibirMatriz(produto);
    }

    public static int[][] lerMatriz(Scanner scanner, int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        System.out.println("Informe os elementos da matriz:");
        for (int i = 0; i < linhas; i++)
            for (int j = 0; j < colunas; j++)
                matriz[i][j] = scanner.nextInt();
        return matriz;
    }

    public static void exibirMatriz(int[][] matriz) {
        System.out.println("Matriz Produto:");
        for (int[] linha : matriz) {
            for (int elemento : linha)
                System.out.print(elemento + " ");
            System.out.println();
        }
    }
}
