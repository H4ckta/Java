package EXLoops;

import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n (o enésimo termo da sequência de Fibonacci): ");
        int n = scanner.nextInt();

        System.out.println("Sequência de Fibonacci até o " + n + "º termo:");

        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.print(primeiroTermo + " ");

        if (n > 1) {
            System.out.print(segundoTermo + " ");
        }

        for (int i = 3; i <= n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(proximoTermo + " ");
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        scanner.close();
    }
}
