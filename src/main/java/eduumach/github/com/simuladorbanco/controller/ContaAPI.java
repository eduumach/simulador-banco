package eduumach.github.com.simuladorbanco.controller;

import eduumach.github.com.simuladorbanco.domain.Dados;
import eduumach.github.com.simuladorbanco.model.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conta")
public class ContaAPI {

    @GetMapping("/teste")
    public String teste(){
        return "Ola mundão!";
    }

    @PostMapping("/abrir")
    public void abriConta(@RequestBody Dados dados){
        Cliente cliente = new Cliente(dados.getNome(), dados.getCpf());
    }
}
