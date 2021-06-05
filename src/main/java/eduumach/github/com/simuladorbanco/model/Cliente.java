package eduumach.github.com.simuladorbanco.model;

public class Cliente extends Conta {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String dados(){
        return "Nome: " + this.nome + " CPF: " + this.cpf;
    }
}
