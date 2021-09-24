package eduumach.github.com.simuladorbanco.model;

public class Conta {
    private double saldo;
    private String extrato = "Seu extrato:";

    //operação
    public void deposito(double a) {
        this.extrato = this.extrato + "\nDeposito: " + a;
        this.saldo += a;
    }

    //Operação
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

    //operação
    public void deposito(double valor, Cliente destino){
            this.saldo += valor;
        this.extrato = this.extrato + "\nTranferencia recebida para: " + destino.getNome() + " no valor: R$" + valor;
    }

    //Operação
    public void transferencia(Cliente destino, double valor) throws Exception {
        if (this.saldo >= valor) {
            this.saque(valor, destino);
            destino.deposito(valor,destino);
        } else {
            throw new Exception("Saldo insuficiente.");
        }
    }

    //Conta
    public String extrato(){
        String mostrar = this.extrato + "\n Seu saldo final é de R$:" + saldo;
        return mostrar;
    }

    //Conta
    public double saldo(){
        return this.saldo;
    }

}
