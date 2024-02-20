import java.util.Scanner;   
public class Exercicio5 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("DIGITE O VALOR QUE DESEJA CONVERTER: ");
       double km = scanner.nextDouble();
       double conversor = km * 1000;
       System.out.println("KM/h: " + km + "\n" + "M/s: " + conversor);
       scanner.close();
    }
}
