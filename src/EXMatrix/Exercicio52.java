package EXMatrix;

public class Exercicio52 {
    public static void main(String[] args) {
        int[] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int tamanho = vetor.length;

        for (int i = 0; i < tamanho / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanho - i - 1];
            vetor[tamanho - i - 1] = temp;
        }

        System.out.println("Vetor Invertido:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
