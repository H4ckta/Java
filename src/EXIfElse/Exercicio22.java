import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE O PRIMEIRO NÚMERO: ");
        int number1 = scanner.nextInt();
        System.out.print("DIGITE O SEGUNDO NÚMERO: ");
        int number2 = scanner.nextInt();

        if (number1 > number2){
            System.out.println("O NUMERO N1: " + number1 + " é maior que o número N2: " + number2);
        }

        else {
            System.out.println("O NUMERO N2: " + number2 + " é maior que o número N1: " + number1);
        }
        scanner.close();
    }
}
