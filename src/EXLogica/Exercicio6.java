import java.util.Scanner;   
public class Exercicio6 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("DIGITE O VALOR QUE DESEJA CONVERTER: ");
       double ms = scanner.nextDouble();
       double conversor = ms * 3.6;
       System.out.println("M/s: " + ms + "\n" + "KM/h: " + conversor);
       scanner.close();
    }
}
