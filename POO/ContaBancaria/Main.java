public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(4567,"TESTE");
        c1.depositar(200);
        c1.sacar(20);
        System.out.println(c1.getDados());
    }
}
