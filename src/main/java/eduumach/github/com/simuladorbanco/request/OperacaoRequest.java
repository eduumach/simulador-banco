package eduumach.github.com.simuladorbanco.request;

public class OperacaoRequest {

    private Long conta;
    private double valor;

    public OperacaoRequest() {
    }

    public OperacaoRequest(Long conta, double valor) {
        this.conta = conta;
        this.valor = valor;
    }

    public Long getConta() {
        return conta;
    }

    public void setConta(Long conta) {
        this.conta = conta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
