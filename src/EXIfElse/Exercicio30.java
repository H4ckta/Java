import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int n3 = scanner.nextInt();

        if (n1 <= n2 && n1 <= n3) {
            System.out.print(n1 + " ");
            if (n2 <= n3) {
                System.out.print(n2 + " ");
                System.out.print(n3);
            } else {
                System.out.print(n3 + " ");
                System.out.print(n2);
            }
        } else if (n2 <= n1 && n2 <= n3) {
            System.out.print(n2 + " ");
            if (n1 <= n3) {
                System.out.print(n1 + " ");
                System.out.print(n3);
            } else {
                System.out.print(n3 + " ");
                System.out.print(n1);
            }
        } else {
            System.out.print(n3 + " ");
            if (n1 <= n2) {
                System.out.print(n1 + " ");
                System.out.print(n2);
            } else {
                System.out.print(n2 + " ");
                System.out.print(n1);
            }
        }

        scanner.close();
    }
}