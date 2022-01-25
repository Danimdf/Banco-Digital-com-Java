import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String cliente;
        int Deposito;
        int Transferencia;

        System.out.println("Nome do cliente: ");
        cliente = scan.next();
        System.out.println("Valor a se depositar na conta: ");
        Deposito = scan.nextInt();
        System.out.println("Valor para transferência para a poupança: ");
        Transferencia = scan.nextInt();

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(Deposito);
        cc.transferir(Transferencia, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}