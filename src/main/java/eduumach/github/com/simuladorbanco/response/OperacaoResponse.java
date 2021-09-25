package eduumach.github.com.simuladorbanco.response;

public class OperacaoResponse {
    private Long conta;
    private String extrato;

    public OperacaoResponse() {
    }

    public OperacaoResponse(Long conta, String extrato) {
        this.conta = conta;
        this.extrato = extrato;
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
