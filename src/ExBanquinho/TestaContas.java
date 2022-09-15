package ExBanquinho;

public class TestaContas {

    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        c.setNomeCliente("Samuel Almeida");
        c.setRa("G2688A");
        c.setNumeroConta("555");

        cc.setNomeCliente("Tiago Quintao");
        cc.setRa("G2688A");
        cc.setNumeroConta("444");

        cp.setNomeCliente("USIMINAS");
        cp.setRa("G2688A");
        cp.setNumeroConta("444");

        c.deposito(1000);
        cc.deposito(2000);
        cp.deposito(3000);

        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);

        System.out.println(c.mostraInfosCliente());
        System.out.println("\n");
        System.out.println(cc.mostraInfosCliente());
        System.out.println("\n");
        System.out.println(cp.mostraInfosCliente());

    }

}
