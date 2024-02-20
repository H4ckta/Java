import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Círculo");
        System.out.println("2. Triângulo Retângulo");
        System.out.println("3. Retângulo");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double area = Math.PI * raio * raio;
                double perimetro = 2 * Math.PI * raio;
                System.out.println("Área = " + area);
                System.out.println("Perímetro = " + perimetro);
                break;
            case 2:
                System.out.print("Digite a base do triângulo: ");
                double base = scanner.nextDouble();
                System.out.print("Digite a altura do triângulo: ");
                double altura = scanner.nextDouble();
                double areaTriangulo = (base * altura) / 2;
                double hipotenusa = Math.sqrt(base * base + altura * altura);
                double perimetroTriangulo = base + altura + hipotenusa;
                System.out.println("Área = " + areaTriangulo);
                System.out.println("Perímetro = " + perimetroTriangulo);
                break;
            case 3:
                System.out.print("Digite a base do retângulo: ");
                double baseRetangulo = scanner.nextDouble();
                System.out.print("Digite a altura do retângulo: ");
                double alturaRetangulo = scanner.nextDouble();
                double areaRetangulo = baseRetangulo * alturaRetangulo;
                double perimetroRetangulo = 2 * (baseRetangulo + alturaRetangulo);
                System.out.println("Área = " + areaRetangulo);
                System.out.println("Perímetro = " + perimetroRetangulo);
                break;
            default:
                System.out.println("Opção inválida");
        }

        scanner.close();
    }
}