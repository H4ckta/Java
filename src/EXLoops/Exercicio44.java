package EXLoops;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            boolean jogadorPerdeu = false;

            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    int resultadoEsperado = i * j;
                    System.out.print("Qual é o resultado de " + i + " x " + j + "? ");
                    int resposta = scanner.nextInt();

                    if (resposta != resultadoEsperado) {
                        System.out.println("Resposta incorreta! O resultado era " + resultadoEsperado);
                        jogadorPerdeu = true;
                        break;
                    }
                }
                if (jogadorPerdeu) {
                    break;
                }
            }

            if (jogadorPerdeu) {
                System.out.println("Você perdeu! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você completou a tabuada sem erros!");
            }

            System.out.print("Deseja jogar novamente? (Digite 's' para sim ou qualquer outra coisa para não): ");
            String respostaJogarNovamente = scanner.next();
            jogarNovamente = respostaJogarNovamente.equalsIgnoreCase("s");
        }

        System.out.println("Obrigado por jogar! Até mais!");
        scanner.close();
    }
}
