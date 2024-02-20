import java.util.Scanner;   
public class Exercicio17 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Digite a velocidade inicial (em m/s): ");
       double velocidadeInicial = scanner.nextDouble();
       System.out.print("Digite a aceleração (em m/s^2): ");
       double aceleracao = scanner.nextDouble();
       System.out.print("Digite o tempo de percurso (em segundos): ");
       double tempo = scanner.nextDouble();
       double velocidadeFinal = velocidadeInicial + (aceleracao * tempo);
       System.out.println("A velocidade final do corpo é: " + velocidadeFinal + " m/s");
       scanner.close();
    }
}
