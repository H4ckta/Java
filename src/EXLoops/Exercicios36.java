package EXLoops;

import java.util.Scanner;

/**
 * Exercicios36
 */
public class Exercicios36 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("DIGITE UM NÚMERO: ");
         int number = scanner.nextInt();

         for(int i = 0; i <= 10; i++){
            System.out.println(i*number);
         }

         scanner.close();
    }
}