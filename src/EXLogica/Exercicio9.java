import java.util.Scanner;   
public class Exercicio9 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("DIGITE O VALOR QUE DESEJA CONVERTER: ");
       double km = scanner.nextDouble();
       double conversor = km / 1.609;
       System.out.println("Quilometro: " + km + "\n" + "Milhas: " + conversor);
       scanner.close();
    }
}
