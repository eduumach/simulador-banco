package eduumach.github.com.simuladorbanco.controller;

import eduumach.github.com.simuladorbanco.request.ClienteRequest;
import eduumach.github.com.simuladorbanco.response.ClienteResponse;
import eduumach.github.com.simuladorbanco.response.ContaResponse;
import eduumach.github.com.simuladorbanco.service.ClienteService;
import eduumach.github.com.simuladorbanco.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contas")
public class ContaController {

    @Autowired
    ContaService contaService;

    @Autowired
    ClienteService clienteService;

    @PostMapping("/criar")
    public ResponseEntity<ContaResponse> criarConta() {
        ContaResponse contaResponse = contaService.criar();
        return new ResponseEntity<>(contaResponse, HttpStatus.CREATED);
    }

    @PostMapping("/associacliente")
    public ResponseEntity<ClienteResponse> associaCliente(@RequestBody ClienteRequest clienteRequest){
        ClienteResponse clienteResponse = clienteService.associaConta(clienteRequest);
        return new ResponseEntity<>(clienteResponse, HttpStatus.CREATED);
    }
}
