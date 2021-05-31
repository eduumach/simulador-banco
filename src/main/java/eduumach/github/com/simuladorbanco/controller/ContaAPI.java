package eduumach.github.com.simuladorbanco.controller;

import eduumach.github.com.simuladorbanco.domain.Dados;
import eduumach.github.com.simuladorbanco.model.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@Controller
@RequestMapping("/Conta")
public class ContaAPI {

    @PostMapping("/abrir")
    public void abriConta(@RequestBody Dados dados){
        Cliente cliente = new Cliente(dados.getNome(), dados.getCpf());
    }
}
