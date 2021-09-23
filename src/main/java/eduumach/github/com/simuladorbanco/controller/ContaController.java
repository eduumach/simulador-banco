package eduumach.github.com.simuladorbanco.controller;

import eduumach.github.com.simuladorbanco.domain.Dados;
import eduumach.github.com.simuladorbanco.model.Cliente;
import eduumach.github.com.simuladorbanco.request.ClienteRequest;
import eduumach.github.com.simuladorbanco.response.ClienteResponse;
import eduumach.github.com.simuladorbanco.response.ContaResponse;
import eduumach.github.com.simuladorbanco.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.ArrayList;

@RestController
@RequestMapping("/contas")
public class ContaController {

    @Autowired
    ClienteService clienteService;

    private ArrayList<Cliente> cliente = new ArrayList<Cliente>();
    private ArrayList<String> cpf = new ArrayList<String>();
    private int id = 0;

    @GetMapping("/extrato")
    public String extrato(@RequestBody ClienteRequest clienteRequest) {
        return clienteService.extrato(clienteRequest);
    }

    @GetMapping("/saldo/{id}")
    public String saldo(@PathVariable("id") int id){
        double saldo = cliente.get(id).saldo();
        return "Seu saldo é: " + saldo;
    }

    @PostMapping("/abrir")
    public ResponseEntity<ClienteResponse> abriConta(@RequestBody ClienteRequest clienteRequest) throws ParseException {
        ClienteResponse clienteResponse = clienteService.abrir(clienteRequest);
        return new ResponseEntity<>(clienteResponse, HttpStatus.CREATED);
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

    @PostMapping("/transferencia/{id}")
    public String transferencia(@RequestBody Dados dados, @PathVariable("id") int id) throws Exception {
        Cliente contaDestino = cliente.get(dados.getIdDestino());
        cliente.get(id).transferencia(contaDestino, dados.getValor());
        return "Transferecia para: "+cliente.get(id) + " para: " +cliente.get(dados.getIdDestino()).dados() +" no valor de: R$"+dados.getValor();
    }
}
