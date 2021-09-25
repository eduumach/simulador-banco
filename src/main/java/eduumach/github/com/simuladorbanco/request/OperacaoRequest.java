package eduumach.github.com.simuladorbanco.request;

import java.util.Date;

public class OperacaoRequest {

    private Long conta;
    private Long contaDestino;
    private double valor;

    public OperacaoRequest() {
    }

    public OperacaoRequest(Long conta, double valor) {
        this.conta = conta;
        this.valor = valor;
    }

    public OperacaoRequest(Long conta, Long contaDestino, double valor) {
        this.conta = conta;
        this.contaDestino = contaDestino;
        this.valor = valor;
    }

    public Long getConta() {
        return conta;
    }

    public void setConta(Long conta) {
        this.conta = conta;
    }

    public Long getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Long contaDestino) {
        this.contaDestino = contaDestino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
