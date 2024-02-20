import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE O PRIMEIRO NOTA: ");
        int nota1 = scanner.nextInt();
        System.out.print("DIGITE O SEGUNDO NOTA: ");
        int nota2 = scanner.nextInt();

        double media = (nota1 + nota2) / 2;

        if (nota1 > 10 || nota2 > 10) {
            System.out.println("NOTAS ERRADAS");
        }
        else if (nota1 < 0 || nota2 < 0) {
            System.out.println("NOTAS ERRADAS");
        }

        else{
            if (media >= 5) {
                System.out.println("Aprovado!");
            }
            
            else{
                if (media > 5) {
                    System.out.println("Aprovado!");
                }
    
                else{
                    System.out.println("REPROVADOOOOO!");
                }
            }
        }
        scanner.close();
    }
}