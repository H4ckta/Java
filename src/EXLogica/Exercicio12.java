import java.util.Scanner;   
public class Exercicio12 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Digite a nota 1: ");
       double nota1 = scanner.nextDouble();
       System.out.print("Digite a nota 2: ");
       double nota2 = scanner.nextDouble();
       double media = (nota1 * 1 + nota2 * 2) / 3;
       System.out.println("A média ponderada é: " + media);
       scanner.close();
    }
}
