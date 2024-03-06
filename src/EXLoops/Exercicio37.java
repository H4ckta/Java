package EXLoops;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Inicializando variáveis para armazenar o maior e o menor números
    int maiorNumero = Integer.MIN_VALUE;
        int menorNumero = Integer.MAX_VALUE;
        
        // Pedindo ao usuário para digitar 5 números inteiros
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "º número inteiro: ");
            int numero = scanner.nextInt();
            
            // Atualizando o maior e o menor número se necessário
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }
        
        // Exibindo o maior e o menor números
        System.out.println("O maior número digitado é: " + maiorNumero);
        System.out.println("O menor número digitado é: " + menorNumero);
        
        scanner.close();

    }
}
