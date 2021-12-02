package eduumach.github.com.simuladorbanco.response;

public class OperacaoResponse {
    private Long conta;
    private String extrato;
    private double saldo;

    public OperacaoResponse() {
    }

    public OperacaoResponse(Long conta, String extrato, double saldo) {
        this.conta = conta;
        this.extrato = extrato;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Long getConta() {
        return conta;
    }

    public void setConta(Long conta) {
        this.conta = conta;
    }

    public String getExtrato() {
        return extrato;
    }

    public void setExtrato(String extrato) {
        this.extrato = extrato;
    }
}
