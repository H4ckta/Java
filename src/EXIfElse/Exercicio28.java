import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE UM NÚMERO: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("ERRO");
        }
        
        else{
            if (number % 2 == 0) {
                System.out.println(number + " É PAR");
            }
            else{
                System.out.println(number + " É IMPAR");
            }
        }


        scanner.close();
    }
}