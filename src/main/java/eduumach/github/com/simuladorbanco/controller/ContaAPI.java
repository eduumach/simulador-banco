package eduumach.github.com.simuladorbanco.controller;

import eduumach.github.com.simuladorbanco.domain.Dados;
import eduumach.github.com.simuladorbanco.model.Cliente;
import eduumach.github.com.simuladorbanco.model.Conta;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/conta")
public class ContaAPI {
    private ArrayList<Cliente> cliente = new ArrayList<Cliente>();
    private int id = 0;

    @GetMapping("/teste")
    public String teste(){
        return "Ola mundão!";
    }

    @PostMapping("/abrir")
    public String abriConta(@RequestBody Dados dados){
        Cliente c = new Cliente(dados.getNome(), dados.getCpf());
        cliente.add(c);
        int idd = id;
        id ++;
        return "Seu Id; "+ idd ;
    }

    @PostMapping("/{id}/deposito/{valor}")
    public String deposito(@PathVariable("id") int conta, @PathVariable("valor") double valor){
        cliente.get(conta).deposito(valor);
        return "Valor adcionado: " + valor;
    }

    @PostMapping("/{id}/saque/{valor}")
    public String saque(@PathVariable("id") int conta, @PathVariable("valor") double valor) throws Exception {
        cliente.get(conta).saque(valor);
        return "Saque de: R$"+ valor;
    }

    @PostMapping("/{id-c}/transfrencia/{id-d}/{valor}")
    public String transferencia(@PathVariable("id-c") int contaC,@PathVariable("id-d") int contaD, @PathVariable("valor") double valor) throws Exception {
        Cliente conta = cliente.get(contaD);
        cliente.get(contaC).transferencia(conta, valor);
        return "Transferecia para: "+cliente.get(contaC).dados()+ " para: " +cliente.get(contaD).dados() +" no valor de: R$"+valor;
    }

    @GetMapping("/{id}/extrato")
    public String extrato(@PathVariable("id") int conta) {
        return cliente.get(conta).extrato();
    }

    @GetMapping("/{id}/saldo")
    public String saldo(@PathVariable("id") int conta){
        double saldo = cliente.get(conta).saldo();
        return "Seu saldo é: " + saldo;
    }
}
