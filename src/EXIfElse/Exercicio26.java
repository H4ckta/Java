import java.util.Scanner;

public class Exercicio26 {
    public void Logo() {
        System.out.println(
            "\r\n" + //
            "░█████╗░░█████╗░██╗██╗░░██╗░█████╗░\r\n" + //
            "██╔══██╗██╔══██╗██║╚██╗██╔╝██╔══██╗\r\n" + //
            "██║░░╚═╝███████║██║░╚███╔╝░███████║\r\n" + //
            "██║░░██╗██╔══██║██║░██╔██╗░██╔══██║\r\n" + //
            "╚█████╔╝██║░░██║██║██╔╝╚██╗██║░░██║\r\n" + //
            "░╚════╝░╚═╝░░╚═╝╚═╝╚═╝░░╚═╝╚═╝░░╚═╝\r\n" + //
            "███████╗██╗░░░░░███████╗████████╗██████╗░░█████╗░███╗░░██╗██╗░█████╗░░█████╗░\r\n" + //
            "██╔════╝██║░░░░░██╔════╝╚══██╔══╝██╔══██╗██╔══██╗████╗░██║██║██╔══██╗██╔══██╗\r\n" + //
            "█████╗░░██║░░░░░█████╗░░░░░██║░░░██████╔╝██║░░██║██╔██╗██║██║██║░░╚═╝██║░░██║\r\n" + //
            "██╔══╝░░██║░░░░░██╔══╝░░░░░██║░░░██╔══██╗██║░░██║██║╚████║██║██║░░██╗██║░░██║\r\n" + //
            "███████╗███████╗███████╗░░░██║░░░██║░░██║╚█████╔╝██║░╚███║██║╚█████╔╝╚█████╔╝\r\n" + //
            "╚══════╝╚══════╝╚══════╝░░░╚═╝░░░╚═╝░░╚═╝░╚════╝░╚═╝░░╚══╝╚═╝░╚════╝░░╚════╝░"
        );
    }

    public static void main(String[] args) {
        Exercicio26 exercicio = new Exercicio26();
        Scanner scanner = new Scanner(System.in);
        exercicio.Logo();
        System.out.println();
        System.out.println("*".repeat(77));
        System.out.println("OPÇÕES:");
        System.out.println("=".repeat(77));
        System.out.println("OPÇÃO = 5 (Cadastrar)");
        System.out.println("OPÇÃO = 6 (Sacar)");
        System.out.println("OPÇÃO = 7 (Depositar)");
        System.out.println("OPÇÃO = 8 (Transferir)");
        System.out.println("OPÇÃO = 9 (Sair)");

        System.out.println("*".repeat(77));
        System.out.print("DIGITE SUA OPÇÃO: ");
        int opcao = scanner.nextInt();
        System.out.println("*".repeat(77));
        System.out.println();

        if (opcao > 9 || opcao < 5) {
            System.out.println("OPÇÃO INVÁLIDA");
        }
        
        else{
            if (opcao == 5) {
                System.out.println("*".repeat(77));
                System.out.println("CADASTRAR CLIENTE");
                System.out.println("*".repeat(77));
                System.out.print("CADASTRAR NOME: ");
                String nome = scanner.nextLine();

                nome = scanner.nextLine();

                System.out.print("CADASTRAR CPF: ");
                String cpf = scanner.nextLine();

                System.out.print("CADASTRAR EMAIL: ");
                String email = scanner.nextLine();

                System.out.print("CADASTRAR TELEFONE: ");
                int tel = scanner.nextInt();
                System.out.println("*".repeat(77));
                System.out.println("SUCESSO AO CADASTRAR!");
                System.out.println(nome + " " + cpf + " " + email + " " + tel);
    
            }
            else if (opcao == 6) {
                double saldoFicticio = 1000;
                System.out.println("*".repeat(77));
                System.out.println("SACAR");
                System.out.println("*".repeat(77));
                System.out.print("DIGITE O VALOR QUE DESEJA SACAR: ");
                double valor = scanner.nextDouble();
                if (valor > saldoFicticio || valor < 0) {
                    System.out.println("SALDO INSUFICIENTE!");
                }else if (valor == 0) {
                    System.out.println("VOCÊ NÃO PODE RETIRAR R$0,00");
                }
                else{
                    saldoFicticio -= valor;
                    System.out.println("VALOR SACADO R$" + valor + " VOCÊ POSSUI AGORA R$" + saldoFicticio);
                }
                
            }
           else if (opcao == 7) {
                double saldoFicticio = 0;
                System.out.println("*".repeat(77));
                System.out.println("DEPOSITAR");
                System.out.println("*".repeat(77));
                System.out.print("DIGITE O VALOR QUE DESEJA DEPOSITAR: ");
                double valor = scanner.nextDouble();
                if (valor < 0) {
                    System.out.println("NÃO PODE DEPOSITAR VALOR NEGATIVO");
                }else if (valor == 0) {
                    System.out.println("VOCÊ NÃO PODE RETIRAR R$0,00");
                }
                else{
                    saldoFicticio += valor;
                    System.out.println("VALOR DEPOSITADO R$" + valor + " VOCÊ POSSUI AGORA R$" + saldoFicticio);
                }
                
            }
            else if (opcao == 8) {
                double saldoFicticio = 100;
                System.out.println("*".repeat(77));
                System.out.println("TRANSFERIR");
                System.out.println("*".repeat(77));
                System.out.print("DIGITE O NOME DA PESSOA: ");
                String nome = scanner.nextLine();
                
                // Limpa o buffer do scanner
                scanner.nextLine();
                
                System.out.print("DIGITE O VALOR QUE DESEJA TRANSFERIR: ");
                
                double valor = scanner.nextDouble();
                if (valor <= 0 || valor > saldoFicticio) {
                        System.out.println("ERRO AO TRANFERIR: Valor inválido ou saldo insuficiente.");
                } else {
                    saldoFicticio -= valor;
                    // Formata a saída para representar moeda
                    System.out.printf("VALOR TRANSFERIDO R$%.2f PARA %s. VOCÊ POSSUI AGORA R$%.2f\n", valor, nome, saldoFicticio);
                }
            }
            
        }
        scanner.close();
    }
}
