package eduumach.github.com.simuladorbanco.model;

public class Conta {
    private double saldo;
    private String totalExtrato = "Seu extrato:";

    public void deposito(double valor) {
        this.totalExtrato = this.totalExtrato + "\nDeposito: " + valor;
        this.saldo += valor;
    }

    public void saque(double valor) {
        if(this.saldo >= valor) {
            this.totalExtrato = this.totalExtrato + "\nSaque: " + valor;
            this.saldo -= valor;
        }else{
            System.out.println("Não foi possivel fazer o saque.");
        }
    }

    public void transferencia(Cliente clienteDestino, double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            this.totalExtrato = this.totalExtrato + "\nTranferencia enviada para: " + clienteDestino.getNome() + " no valor: R$" + valor;
            clienteDestino.getConta().deposito(valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public String extratoTotal(){
        return this.totalExtrato + "\n Seu saldo final é de R$:" + saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
