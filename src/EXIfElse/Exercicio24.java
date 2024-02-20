import java.util.Scanner;

public class Exercicio24 {
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
                System.out.println("REPROVADOOOOO!");
                System.out.print("DIGITE A NOTA DA RECUPERAÇÃO 1: ");
                int recuperacao1 = scanner.nextInt();
                System.out.print("DIGITE A NOTA DA RECUPERAÇÃO 2: ");
                int recuperacao2 = scanner.nextInt();
                double mediaRecuperacao = (recuperacao1 + recuperacao2) / 2;
                if (mediaRecuperacao >= 5) {
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