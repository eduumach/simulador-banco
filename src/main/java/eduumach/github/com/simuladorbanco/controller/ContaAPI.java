package eduumach.github.com.simuladorbanco.controller;

import eduumach.github.com.simuladorbanco.domain.Dados;
import eduumach.github.com.simuladorbanco.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/contas")
public class ContaAPI {
    private ArrayList<Cliente> cliente = new ArrayList<Cliente>();
    private ArrayList<String> cpf = new ArrayList<String>();
    private int id = 0;

    @GetMapping("/extrato/{id}")
    public String extrato(@PathVariable("id") int id) {
        return cliente.get(id).extrato();
    }

    @GetMapping("/saldo/{id}")
    public String saldo(@PathVariable("id") int id){
        double saldo = cliente.get(id).saldo();
        return "Seu saldo é: " + saldo;
    }

    @PostMapping("/abrir")
    public String abriConta(@RequestBody Dados dados){
        Cliente c = new Cliente(dados.getNome(), dados.getCpf());
        if(!cpf.contains(dados.getCpf())){
            cpf.add(dados.getCpf());
            cliente.add(c);
            int idd = id;
            id ++;
            return "Seu Id; "+ idd;
        }else {
            return "Já cadastrado";
        }
    }

    @PostMapping("/deposito/{id}")
    public String deposito(@RequestBody Dados dados, @PathVariable("id") int id){
        cliente.get(id).deposito(dados.getValor());
        return "Valor adcionado: " + dados.getValor();
    }

    @PostMapping("/saque/{id}")
    public String saque(@RequestBody Dados dados, @PathVariable("id") int id) throws Exception {
        cliente.get(id).saque(dados.getValor());
        return "Saque de: R$"+ dados.getValor();
    }

    @PostMapping("/transfrencias/{id}")
    public String transferencia(@RequestBody Dados dados, @PathVariable("id") int id) throws Exception {
        Cliente contaDestino = cliente.get(dados.getIdDestino());
        cliente.get(id).transferencia(contaDestino, dados.getValor());
        return "Transferecia para: "+cliente.get(id) + " para: " +cliente.get(dados.getIdDestino()).dados() +" no valor de: R$"+dados.getValor();
    }
}
