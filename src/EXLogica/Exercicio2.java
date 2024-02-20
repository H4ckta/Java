import java.util.Scanner;   

public class Exercicio2 {
    public static void main(String[] args) {
        

    Scanner scanner = new Scanner(System.in);
       System.out.print("DIGITE UM NÚMERO INTEIRO: ");
       int numero = scanner.nextInt();
       int quadrado = numero * numero;
       System.out.println("O QUADRADO DE " + numero + " É " + quadrado);
       scanner.close();
    }
}
