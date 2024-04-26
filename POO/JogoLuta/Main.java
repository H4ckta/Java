package JogoLuta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao jogo de luta!");
        System.out.println("Digite o nome do primeiro personagem:");
        Personagem personagem1 = new Personagem(scanner.next());
        
        System.out.println("Digite o nome do segundo personagem:");
        Personagem personagem2 = new Personagem(scanner.next());
        
        while (personagem1.estaVivo() && personagem2.estaVivo()) {
            personagem1.atacar(personagem2);
            if (!personagem2.estaVivo()) {
                System.out.println(personagem2.getNome() + " foi derrotado!");
                break;
            }
            personagem2.atacar(personagem1);
            if (!personagem1.estaVivo()) {
                System.out.println(personagem1.getNome() + " foi derrotado!");
                break;
            }
        }
        
        if (personagem1.estaVivo()) {
            System.out.println("O vencedor é: " + personagem1.getNome());
        } else {
            System.out.println("O vencedor é: " + personagem2.getNome());
        }
    }

    
}
