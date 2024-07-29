public class Main {
    public static void main(String[] args) {

        Conta ccElso = new ContaCorrente(new Cliente("Elso"));
        Conta cpElso = new ContaPoupanca(new Cliente("Elso"));
        Conta cpLeticia = new ContaPoupanca(new Cliente("Leticia"));
        Conta ccMichel = new ContaCorrente(new Cliente("Michel"));
        Conta cpMichel = new ContaCorrente(new Cliente("Michel"));
        Conta ccVera = new ContaCorrente(new Cliente("Vera"));


        ccElso.depositar(100.55);
        ccElso.transferir(50.42, cpLeticia);

        ccElso.imprimirExtrato();
        cpLeticia.imprimirExtrato();

        //Lista de clientes do banco
        System.out.println(Banco.getClientes());

    }
}