package EXMatrix;

import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }

        int maior = vetor[0];
        int menor = vetor[0];
        int posicaoMaior = 0;
        int posicaoMenor = 0;

        for (int i = 1; i < 10; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                posicaoMenor = i;
            }
        }

        System.out.println("O maior número é " + maior + " e está na posição " + (posicaoMaior + 1));
        System.out.println("O menor número é " + menor + " e está na posição " + (posicaoMenor + 1));
        scanner.close();
    }
}

