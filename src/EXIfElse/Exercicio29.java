import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE O PRIMEIRO NÚMERO: ");
        int lado1 = scanner.nextInt();
        System.out.print("DIGITE O SEGUNDO NÚMERO: ");
        int lado2 = scanner.nextInt();
        System.out.print("DIGITE O TERCEIRO NÚMERO: ");
        int lado3 = scanner.nextInt();

        if (lado1 < 0 || lado2 < 0 || lado3 < 0) {
            System.out.println("ERRO VALOR INVÁLIDO");
        }

        else{
            if (lado1 < (lado2 + lado3) || lado2 < (lado1 + lado3) || lado3 < (lado1 + lado2)) {
                System.out.println(("*").repeat(20));
                System.out.println("TRIÂNGULO VALIDO");
                System.out.println(("*").repeat(20));
                if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
                    System.out.println("TRIÂNGULO EQUILÁTERO");
                }
                else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                    System.out.println("TRIÂNGULO ISÓCELES");
                }
                else{
                    System.out.println("TRIÂNGULO ESCALENO");
                }
    
            }
    
            else{
                System.out.println("TRIÂNGULO INVÁLIDO");
            }
        }



        scanner.close();
    }
}
