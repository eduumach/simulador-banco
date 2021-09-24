package eduumach.github.com.simuladorbanco.controller;

import eduumach.github.com.simuladorbanco.domain.Dados;
import eduumach.github.com.simuladorbanco.model.Cliente;
import eduumach.github.com.simuladorbanco.request.ClienteRequest;
import eduumach.github.com.simuladorbanco.response.ContaResponse;
import eduumach.github.com.simuladorbanco.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/contas")
public class ContaController {

    @Autowired
    ContaService contaService;

    @PostMapping("/criar")
    public ResponseEntity<ContaResponse> criarConta() {
        ContaResponse contaResponse = contaService.criar();
        return new ResponseEntity<>(contaResponse, HttpStatus.CREATED);
    }
}
