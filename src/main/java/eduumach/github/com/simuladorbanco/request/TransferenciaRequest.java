package eduumach.github.com.simuladorbanco.request;

public class TransferenciaRequest {

    private Long idConta;
    private Long idContaDestino;
    private double valor;

    public TransferenciaRequest() {
    }

    public TransferenciaRequest(Long idConta, Long idContaDestino, double valor) {
        this.idConta = idConta;
        this.idContaDestino = idContaDestino;
        this.valor = valor;
    }

    public Long getIdConta() {
        return idConta;
    }

    public void setIdConta(Long idConta) {
        this.idConta = idConta;
    }

    public Long getIdContaDestino() {
        return idContaDestino;
    }

    public void setIdContaDestino(Long idContaDestino) {
        this.idContaDestino = idContaDestino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
