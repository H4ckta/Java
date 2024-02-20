import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.println("Menu:");
        System.out.println("1. Débito");
        System.out.println("2. Pix");
        System.out.println("3. Crédito");
        System.out.print("Escolha a forma de pagamento: ");
        int formaPagamento = scanner.nextInt();

        switch (formaPagamento) {
            case 1:
                double valorDescontoDebito = valorCompra * 0.95; // Desconto de 5%
                System.out.println("Valor final da compra: R$ " + valorDescontoDebito);
                break;
            case 2:
                double valorDescontoPix = valorCompra * 0.90; // Desconto de 10%
                System.out.println("Valor final da compra: R$ " + valorDescontoPix);
                break;
            case 3:
                System.out.println("Crédito Selecionado");
                System.out.print("Escolha o número de parcelas: ");
                int numParcelas = scanner.nextInt();
                double valorFinalCompra;
                if (numParcelas <= 4) {
                    valorFinalCompra = valorCompra * 1.02; // Juros simples de 2%
                } else {
                    valorFinalCompra = valorCompra * 1.05; // Juros simples de 5%
                }
                System.out.println("Valor final da compra: R$ " + valorFinalCompra);
                break;
            default:
                System.out.println("Opção inválida");
        }

        scanner.close();
    }
}
