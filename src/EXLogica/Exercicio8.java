import java.util.Scanner;   
public class Exercicio8 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("DIGITE O VALOR QUE DESEJA CONVERTER: ");
       double po = scanner.nextDouble();
       double conversor = po * 25.4;
       System.out.println("polegada: " + po + "\n" + "milimetro: " + conversor);
       scanner.close();
    }
}
