package JogoLuta;
import java.util.Random;

public class Personagem {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;
    private boolean vivo;
    
    
    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.vivo = true;
        Random rand = new Random();
        this.ataque = rand.nextInt(11) + 20;
        this.defesa = rand.nextInt(6) + 10;
    }
    
    
    public void atacar(Personagem adversario) {
        if (!this.vivo) {
            System.out.println(this.nome + " está morto e não pode atacar.");
            return;
        }
        
        if (!adversario.vivo) {
            System.out.println(adversario.nome + " já está morto.");
            return;
        }
        
        int dano = Math.max(0, this.ataque - adversario.defesa);
        adversario.vida -= dano;
        if (adversario.vida <= 0) {
            adversario.vida = 0;
            adversario.vivo = false;
            System.out.println(this.nome + " derrotou " + adversario.nome + "!");
        } else {
            System.out.println(this.nome + " atacou " + adversario.nome + " causando " + dano + " de dano.");
        }
    }
    
   
    public boolean estaVivo() {
        return this.vivo;
    }
    
    
    public String getNome() {
        return this.nome;
    }
    
    
    public int getVida() {
        return this.vida;
    }
    
    
    public int getAtaque() {
        return this.ataque;
    }
    
    
    public int getDefesa() {
        return this.defesa;
    }
}
