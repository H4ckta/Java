package EXMatrix;

public class Exercicio51 {
    public static void main(String[] args) {
        int[] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] v2 = new int[10];

        for (int i = 0; i < 10; i++) {
            v2[i] = v1[9 - i];
        }

        System.out.println("Vetor Original:");
        for (int num : v1) {
            System.out.print(num + " ");
        }

        System.out.println("\nVetor Invertido:");
        for (int num : v2) {
            System.out.print(num + " ");
        }
    }
}
