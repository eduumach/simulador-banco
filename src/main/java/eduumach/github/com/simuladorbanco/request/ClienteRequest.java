package eduumach.github.com.simuladorbanco.request;

import eduumach.github.com.simuladorbanco.entity.ContaEntity;

public class ClienteRequest {

    private String cpf;
    private String nome;
    private Long idConta;

    public ClienteRequest() {
    }

    public ClienteRequest(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public Long getIdConta() {
        return idConta;
    }

    public void setIdConta(Long idConta) {
        this.idConta = idConta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
