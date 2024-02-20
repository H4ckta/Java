import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE UM NÚMERO REAL: ");
        int realNumber =  scanner.nextInt();
        if (realNumber >= 0){
            double raizQuadrada = Math.sqrt(realNumber);
            System.out.printf("A raiz quadrada de " + realNumber + " é " + raizQuadrada);
        }
        else {
            System.out.println("Valor Inválido!");
        }
        scanner.close();
    }
}