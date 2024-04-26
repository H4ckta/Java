package EscrverArquivo;

public class Main {
    public static void main(String[] args) {
        Arquivo meuArquivo = new Arquivo("arquivo.txt");
        
        meuArquivo.abrir();
        meuArquivo.editar("Este é um arquivo de texto.");
        meuArquivo.abrir();
        meuArquivo.renomear("novo_arquivo.txt");
        meuArquivo.limpar();
        meuArquivo.abrir();
    }
}
