import java.util.Scanner;   
public class Exercicio4 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("DIGITE SUA NOTA 1: ");
       float N1 = scanner.nextFloat();
       System.out.print("DIGITE SUA NOTA 2: ");
       float N2 = scanner.nextFloat();
       float media = (N1 + N2) / 2;
       System.out.println("A SUA MÉDIA É " + media);
       scanner.close();
    }
}
