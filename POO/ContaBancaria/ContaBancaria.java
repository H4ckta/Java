public class ContaBancaria {
    private int numero;
    private double saldo;
    private String titular;

    public ContaBancaria(int numero, String titular){
        this.numero = numero;
        this.saldo = 0.0;
        this.titular = titular;
    }

    public void depositar(double valorDepositar){
        if (valorDepositar>0) {
            this.saldo += valorDepositar;
        }
    }

    public void sacar(double valorSacar){
        if (valorSacar > 0 && this.saldo>=valorSacar) {
            this.saldo -= valorSacar;   
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getDados() {
        return "Número da Conta: " + this.numero + "\n" +
               "Saldo: " + this.saldo + "\n" +
               "Titular: " + this.titular;
    }
    


}
