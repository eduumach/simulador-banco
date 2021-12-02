package eduumach.github.com.simuladorbanco.request;

public class ContaRequest {

    private double valorTranferencia;
    private Long idDestino;
    private Long conta;
    private String cpf;

    public ContaRequest() {
    }

    public ContaRequest(Long conta, String cpf) {
        this.conta = conta;
        this.cpf = cpf;
    }

    public ContaRequest(double valorTranferencia, Long idDestino) {
        this.valorTranferencia = valorTranferencia;
        this.idDestino = idDestino;
    }

    public Long getConta() {
        return conta;
    }

    public void setConta(Long conta) {
        this.conta = conta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
