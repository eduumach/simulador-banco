package eduumach.github.com.simuladorbanco.controller;

import eduumach.github.com.simuladorbanco.request.OperacaoRequest;
import eduumach.github.com.simuladorbanco.request.TransferenciaRequest;
import eduumach.github.com.simuladorbanco.response.OperacaoResponse;
import eduumach.github.com.simuladorbanco.service.OperacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/operacao")
public class OperacaoController {

    @Autowired
    OperacaoService operacaoService;

    @GetMapping("/saldo")
    public ResponseEntity<OperacaoResponse> saldo(@RequestBody OperacaoRequest operacaoRequest){
        OperacaoResponse operacaoResponse = operacaoService.saldo(operacaoRequest);
        return new ResponseEntity<>(operacaoResponse, HttpStatus.OK);
    }
    @PostMapping("/deposito")
    public ResponseEntity<OperacaoResponse> deposito(@RequestBody OperacaoRequest operacaoRequest){
        OperacaoResponse operacaoResponse = operacaoService.deposito(operacaoRequest);
        return new ResponseEntity<>(operacaoResponse, HttpStatus.ACCEPTED);
    }

    @PostMapping("/saque")
    public ResponseEntity<OperacaoResponse> saque(@RequestBody OperacaoRequest operacaoRequest){
        OperacaoResponse operacaoResponse = operacaoService.saque(operacaoRequest);
        return new ResponseEntity<>(operacaoResponse, HttpStatus.ACCEPTED);
    }

    @PostMapping("/transferencia")
    public ResponseEntity<OperacaoResponse> transferencia(@RequestBody TransferenciaRequest transferenciaRequest){
        OperacaoResponse operacaoResponse = operacaoService.transferancia(transferenciaRequest);
        return new ResponseEntity<>(operacaoResponse, HttpStatus.ACCEPTED);
    }

}
