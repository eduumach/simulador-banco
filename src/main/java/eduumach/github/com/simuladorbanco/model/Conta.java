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
    public void saque(double valor, Cliente destino){
        this.saldo -= valor;
        this.extrato = this.extrato + "\nTranferencia enviada para: " + destino.getNome() + " no valor: R$" + valor;

    }

    public void transferencia(Cliente destino, double valor) throws Exception {
        if (this.saldo >= valor) {
            this.saque(valor, destino);
            destino.getConta().deposito(valor);
        } else {
            throw new Exception("Saldo insuficiente.");
        }
    }

    public String extrato(){
        String mostrar = this.extrato + "\n Seu saldo final é de R$:" + saldo;
        return mostrar;
    }

    public double saldo(){
        return this.saldo;
    }

}
