import java.util.Scanner;   
public class Exercicio16 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Digite o raio do cilindro: ");
       double raio = scanner.nextDouble();
       System.out.print("Digite a altura do cilindro: ");
       double altura = scanner.nextDouble();
       double volume = Math.PI * raio * raio * altura;
       System.out.println("O volume do cilindro é: " + volume);
       scanner.close();
    }
}