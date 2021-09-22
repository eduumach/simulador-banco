package eduumach.github.com.simuladorbanco.controller;

import eduumach.github.com.simuladorbanco.domain.Dados;
import eduumach.github.com.simuladorbanco.model.Cliente;
import eduumach.github.com.simuladorbanco.model.Conta;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/contas")
public class ContaAPI {
    private ArrayList<Cliente> salvaCliente = new ArrayList<Cliente>();
    private ArrayList<String> salvaCpf = new ArrayList<String>();
    private int contadorId = 0;

    @GetMapping("/extrato/{id}")
    public String extrato(@PathVariable("id") int id) {
        return salvaCliente.get(id).getConta().extratoTotal();
    }

    @PostMapping("/abrir")
    public String abriConta(@RequestBody Dados dados){
        Conta conta = new Conta();
        Cliente cliente = new Cliente(dados.getNome(), dados.getCpf(), conta);
        if(!salvaCpf.contains(dados.getCpf())){
            salvaCpf.add(dados.getCpf());
            salvaCliente.add(cliente);
            int salvaId = contadorId;
            contadorId++;
            return "Seu Id; "+ salvaId;
        }else {
            return "Já cadastrado";
        }
    }

    @PostMapping("/deposito/{id}")
    public String deposito(@RequestBody Dados dados, @PathVariable("id") int id){
        salvaCliente.get(id).getConta().deposito(dados.getValor());
        return "Valor adcionado: " + dados.getValor();
    }

    @PostMapping("/saque/{id}")
    public String saque(@RequestBody Dados dados, @PathVariable("id") int id) {
        salvaCliente.get(id).getConta().saque(dados.getValor());
        return "Saque de: R$"+ dados.getValor();
    }

    @PostMapping("/transferencia/{id}")
    public String transferencia(@RequestBody Dados dados, @PathVariable("id") int id) {
        Cliente clienteDestino = salvaCliente.get(dados.getIdDestino());
        salvaCliente.get(id).getConta().transferencia(clienteDestino, dados.getValor());
        return "Transferecia De: "+ salvaCliente.get(id) + " para: " + salvaCliente.get(dados.getIdDestino()) +" no valor de: R$"+dados.getValor();
    }
}
