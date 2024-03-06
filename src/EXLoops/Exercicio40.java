package EXLoops;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE UM NÚMERO: ");
        int number = scanner.nextInt();
        for(int i = number; i > number; i--){
            System.out.println(i);
        }
        scanner.close();
    }
}
