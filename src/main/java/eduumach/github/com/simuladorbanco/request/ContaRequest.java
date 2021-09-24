package eduumach.github.com.simuladorbanco.request;

public class ContaRequest {

    private double valorTranferencia;
    private Long idDestino;

    public ContaRequest() {
    }

    public ContaRequest(double valorTranferencia, Long idDestino) {
        this.valorTranferencia = valorTranferencia;
        this.idDestino = idDestino;
    }

    public double getValorTranferencia() {
        return valorTranferencia;
    }

    public void setValorTranferencia(double valorTranferencia) {
        this.valorTranferencia = valorTranferencia;
    }

    public Long getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(Long idDestino) {
        this.idDestino = idDestino;
    }
}
