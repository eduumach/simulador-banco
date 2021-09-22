package eduumach.github.com.simuladorbanco.request;

public class ContaRequest {

    private double saldo;
    private String extrato;

    public ContaRequest() {
    }

    public ContaRequest(double saldo, String extrato) {
        this.saldo = saldo;
        this.extrato = extrato;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getExtrato() {
        return extrato;
    }

    public void setExtrato(String extrato) {
        this.extrato = extrato;
    }
}
