package eduumach.github.com.simuladorbanco.request;

public class ClienteRequest {

    private String cpf;
    private String nome;

    public ClienteRequest() {
    }

    public ClienteRequest(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
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
