package ExBanquinho;

public class ContaBancaria {

    public String numeroConta;
    public String nomeCliente;

    public String ra;
    public double saldo;

    public String saque( double valorSaque){
        boolean saldoSuficiente = this.saldo > valorSaque;
        if (saldoSuficiente) {
            saldo -= valorSaque;
            return String.format("Saque Realizado, seu saldo é de: %.2f%n", this.saldo);
        } else {
            return String.format("Saldo Insuficiente, seu saldo é de: %.2f%n", this.saldo);
        }
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }

    public String deposito ( double valorDeposito){
        saldo += valorDeposito;
        return String.format("Deposito realizado com sucesso, seu saldo é de: %.2f%n", this.saldo);
    }

    public double mostrarSaldo (){
        return this.getSaldo();
    }

    public String mostraInfosCliente (){
        return "Cliente: " + this.nomeCliente + "\nRA: " + this.ra + "\nConta: " + this.numeroConta + "\nSaldo: " + this.getSaldo();
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
