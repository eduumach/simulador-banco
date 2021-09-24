package eduumach.github.com.simuladorbanco.response;

import com.sun.istack.NotNull;
import eduumach.github.com.simuladorbanco.entity.ContaEntity;

public class ClienteResponse {

    private Long id;
    @NotNull
    private String cpf;
    private String nome;
    private Long idConta;

    public ClienteResponse() {
    }

    public ClienteResponse(Long id, String cpf, String nome) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
    }

    public ClienteResponse(Long id, String cpf, String nome, Long idConta) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.idConta = idConta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
