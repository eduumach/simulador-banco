package eduumach.github.com.simuladorbanco.model;

import eduumach.github.com.simuladorbanco.controller.ContaAPI;

public class Cliente extends Conta {
    private String nome;
    private String cpf;
    public Conta conta;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String dados(){
        return this.nome + " " + this.cpf;
    }

    public boolean validacpf(String cpf){
        if(cpf == this.cpf){
            return true;
        }else{
            return false;
        }
    }


}
