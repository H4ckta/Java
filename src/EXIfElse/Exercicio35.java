import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("INSIRA O DINHEIRO: ");
        double valor = scanner.nextDouble();
        System.out.println("Menu:");
        System.out.println("1. Café Expresso R$ 0,50\n" + "2. Café Longo R$ 1,00\n" + "3. Capuccino R$ 2,50\n" + "4. Chocolate R$ 2,00");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("BEBIDA SELECIONADA CAFÉ EXPRESSO");
                System.out.println("SEU TROCO " + (valor - 0.50) );
                break;
            case 2:
                System.out.println("BEBIDA SELECIONADA CAFÉ LONGO");
                System.out.println("SEU TROCO " + (valor - 1.0) );
                break;
            case 3:
                System.out.println("BEBIDA SELECIONADO CAPUCCINO");
                System.out.println("SEU TROCO " + (valor - 2.50) );
                break;
            case 4:
                System.out.println("BEBIDA SELECIONADA CHOCOLATE");
                System.out.println("SEU TROCO: R$" + (valor - 2.0) );
                break;
            default:
                System.out.println("Opção inválida");
        }

        scanner.close();
    }
}