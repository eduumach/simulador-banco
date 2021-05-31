package eduumach.github.com.simuladorbanco.model;

public class Cliente {
    private String nome;
    private String cpf;
    private Conta conta;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public boolean validacpf(String cpf){
        if(cpf == this.cpf){
            return true;
        }else{
            return false;
        }
    }

    public void deposito(double valor) {
        this.conta.deposito(valor);
    }

    public void saque(double valor) throws Exception {
        this.conta.saque(valor);
    }

    public void transferencia(String cpf,Cliente cliente, double valor) throws Exception {
        if(cliente.validacpf(cpf)){
            this.conta.transferencia(cliente.conta, valor);
        }
    }

    public String extrato(){
        return this.conta.extrato();
    }

    public double saldo(){
        return this.conta.saldo();
    }
}
