import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE UM DIA DA SEMANA ENTRE 1 E 7: ");
        int opcao = scanner.nextInt();
        switch (opcao) {

            case  1:
            System.out.println("DOMINGO ");
            break;
            
            case 2:
                System.out.println("SEGUNDA");
                break;
            case 3:
                System.out.println("TERÇA-FEIRA");
                break;

            case 4:
                System.out.println("QUARTA-FEIRA");
                break;

            case 5:
                System.out.println("QUINTA-FEIRA");
                break;

            case 6:
                System.out.println("SEXTA-FEIRA");
                break;

            case 7:
                System.out.println("SÁBADO");
                break;

            default:
                System.out.println("ERRO");
                break;
            
            }
        scanner.close();
    }
}