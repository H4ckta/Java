import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE O PRIMEIRO NOTA: ");
        int nota1 = scanner.nextInt();
        System.out.print("DIGITE O SEGUNDO NOTA: ");
        int nota2 = scanner.nextInt();
        System.out.print("DIGITE O TERCEIRA NOTA: ");
        int nota3 = scanner.nextInt();
        System.out.print("DIGITE O QUARTA NOTA: ");
        int nota4 = scanner.nextInt();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (nota1 > 10 || nota2 > 10 || nota3 > 10 || nota4 > 10) {
            System.out.println("NOTAS ERRADAS");
        }
        else if (nota1 < 0 || nota2 < 0 || nota3 < 0 || nota4 < 0) {
            System.out.println("NOTAS ERRADAS");
        }

        else{
            if(media >= 8.5){
                System.out.println("MÉDIA A");
            }
            else if(media >= 7 && media < 8.5){
                System.out.println("MÉDIA B");
            }
            else if(media >= 5 && media < 7){
                System.out.println("MÉDIA C");
            }
            else{
                System.out.println("MÉDIA D");
            }
        }
        scanner.close();
    }
}