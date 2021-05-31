package eduumach.github.com.simuladorbanco.model;

public class Conta {
    private double saldo;
    private String extrato = "Seu extrato:";

    public void deposito(double a) {
        this.extrato = this.extrato + "\nDeposito: " + a;
        this.saldo += a;
    }

    public void saque(double a) throws Exception {
        if(this.saldo >= a) {
            this.extrato = this.extrato + "\nSaque: " + a;
            this.saldo -= a;
        }else{
            throw new Exception("Não foi possivel fazer o saque.");
        }
    }

    public void transferencia(Conta destino, double valor) throws Exception {
        if (this.saldo >= valor) {
            this.saque(valor);
            destino.deposito(valor);
        } else {
            throw new Exception("Saldo insuficiente.");
        }
    }

    public String extrato(){
        this.extrato = this.extrato + "\n" + saldo;
        return this.extrato;
    }

    public double saldo(){
        return this.saldo;
    }
}
