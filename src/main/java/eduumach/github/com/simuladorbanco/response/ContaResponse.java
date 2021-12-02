package eduumach.github.com.simuladorbanco.response;

public class ContaResponse {

    private Long id;
    private double saldo;
    private String extrato;

    public ContaResponse() {
    }

    public ContaResponse(Long id, String extrato) {
        this.id = id;
        this.extrato = extrato;
    }

    public ContaResponse(String extrato) {
        this.extrato = extrato;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
