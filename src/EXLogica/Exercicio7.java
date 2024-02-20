import java.util.Scanner;   
public class Exercicio7 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("DIGITE O VALOR QUE DESEJA CONVERTER: ");
       double ml = scanner.nextDouble();
       double conversor = ml / 25.4;
       System.out.println("Milimetro: " + ml + "\n" + "polegada: " + conversor);
       scanner.close();
    }
}
