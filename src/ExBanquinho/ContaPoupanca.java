package ExBanquinho;

public class ContaPoupanca extends ContaBancaria {

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

}
