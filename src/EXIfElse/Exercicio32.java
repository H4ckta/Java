import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE O NUMERO: ");
        float n1 = scanner.nextFloat();
        System.out.println("DIGITE O NUMERO: ");
        float n2 = scanner.nextFloat();

        System.out.println("Menu");
        System.out.println("1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão\n");

        System.out.println("DIGITE UMA OPÇÃO: ");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                float soma = n1 + n2;
                System.out.println("A SOMA DE " + n1 + n2 + " É " + soma);
                break;
            case 2:
                float subtracao = n1 - n2;
                System.out.println("A SUBTRAÇÃO DE " + n1 + n2 + " É " + subtracao);
                break;
            case 3:
                float multi = n1 * n2;
                System.out.println("A MULTIPLICAÇÃO DE " + n1 + n2 + " É " + multi);
                break;
            case 4:
                float div = n1 / n2;
                System.out.println("A DIVISÃO DE " + n1 + n2 + " É " + div);
                break;
            default:
                System.out.println("ERRO");
                break;
        }
        scanner.close();
    }
}