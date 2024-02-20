import java.util.Scanner;   
public class Exercicio11 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("DIGITE O VALOR QUE DESEJA CONVERTER: ");
       double celcius = scanner.nextDouble();
       double conversor = (celcius * (9/5)) + 32;
       System.out.println("Celcius: " + celcius  + "\n" + "Fahrenheit: " + conversor);
       scanner.close();
    }
}
