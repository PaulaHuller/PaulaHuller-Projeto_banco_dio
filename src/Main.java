public class Main {

    public static void main(String[] args) {

        Cliente paula = new Cliente();
        paula.setNome("Paula");
        Conta cc = new ContaCorrente(paula);
        Conta poupanca = new ContaPoupanca(paula);
        cc.depositar(200);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }

}
