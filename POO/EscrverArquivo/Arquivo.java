package EscrverArquivo;

public class Arquivo {
    private String nome;
    private int tamanho;
    private StringBuilder conteudo;

    public Arquivo(String nome) {
        this.nome = nome;
        this.tamanho = 0; 
        this.conteudo = new StringBuilder();
    }

    public void abrir() {
        System.out.println("Nome do arquivo: " + nome);
        System.out.println("Tamanho do arquivo: " + tamanho + " bits");
        System.out.println("Conteúdo do arquivo: " + conteudo.toString());
    }

    public void editar(String texto) {
        conteudo.append(texto);
        tamanho += texto.length() * 8; 
    }

    public void renomear(String novoNome) {
        nome = novoNome;
    }

    public void limpar() {
        conteudo.setLength(0); 
        tamanho = 0; 
    }
}

