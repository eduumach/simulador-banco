package eduumach.github.com.simuladorbanco.controller;

import eduumach.github.com.simuladorbanco.request.ClienteRequest;
import eduumach.github.com.simuladorbanco.response.ClienteResponse;
import eduumach.github.com.simuladorbanco.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping("/criar")
    public ResponseEntity<ClienteResponse> criarCliente(@RequestBody ClienteRequest clienteRequest){
        ClienteResponse clienteResponse = clienteService.criar(clienteRequest);
        return new ResponseEntity<>(clienteResponse, HttpStatus.CREATED);
    }

    @PostMapping("/associaconta")
    public ResponseEntity<ClienteResponse> associaConta(@RequestBody ClienteRequest clienteRequest){
        ClienteResponse clienteResponse = clienteService.associaConta(clienteRequest);
        return new ResponseEntity<>(clienteResponse, HttpStatus.CREATED);
    }

}
