import java.util.Scanner;   
public class Exercicio10 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("DIGITE O VALOR QUE DESEJA CONVERTER: ");
       double mi = scanner.nextDouble();
       double conversor = mi * 1.609;
       System.out.println("Milha: " + mi + "\n" + "Quilometro: " + conversor);
       scanner.close();
    }
}
