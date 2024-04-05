package EXMatrix;

public class Exercicio56 {
    public static void main(String[] args) {
        int[][] matrizA = {{1, 2}, {3, 4}, {5, 6}};
        int[][] matrizB = {{7, 8}, {9, 10}};
        int[][] produto = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    produto[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(produto[i][j] + " ");
            }
            System.out.println();
        }
    }
}
