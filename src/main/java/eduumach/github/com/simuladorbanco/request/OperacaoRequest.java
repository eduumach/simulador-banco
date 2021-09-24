package eduumach.github.com.simuladorbanco.request;

import java.util.Date;

public class OperacaoRequest {

    private String cpf;
    private String cpfDestino;
    private double valor;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpfDestino() {
        return cpfDestino;
    }

    public void setCpfDestino(String cpfDestino) {
        this.cpfDestino = cpfDestino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
