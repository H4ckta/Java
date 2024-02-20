import java.util.Scanner;        
        
public class Exercicio1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("DIGITE UM NÚMERO INTEIRO: ");
       int numero = scanner.nextInt();
       int dobro = numero * 2;
       System.out.println("O DOBRO DE " + numero + " É " + dobro);
       scanner.close();
    }
}



