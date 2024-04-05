package EXMatrix;

import java.util.Scanner;

public class Exercicio53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int maiorSomaLinhas = Integer.MIN_VALUE;
        int maiorSomaColunas = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
            if (somaLinha > maiorSomaLinhas) {
                maiorSomaLinhas = somaLinha;
            }
            if (somaColuna > maiorSomaColunas) {
                maiorSomaColunas = somaColuna;
            }
        }

        System.out.println("Maior soma entre as linhas: " + maiorSomaLinhas);
        System.out.println("Maior soma entre as colunas: " + maiorSomaColunas);
        scanner.close();
    }
}
