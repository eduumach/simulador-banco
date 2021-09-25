package eduumach.github.com.simuladorbanco.controller;

import eduumach.github.com.simuladorbanco.request.OperacaoRequest;
import eduumach.github.com.simuladorbanco.response.OperacaoResponse;
import eduumach.github.com.simuladorbanco.service.OperacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/operacao")
public class OperacaoController {

    @Autowired
    OperacaoService operacaoService;

    @PostMapping("/deposito")
    public ResponseEntity<OperacaoResponse> deposito(@RequestBody OperacaoRequest operacaoRequest){
        OperacaoResponse operacaoResponse = operacaoService.deposito(operacaoRequest);
        return new ResponseEntity<>(operacaoResponse, HttpStatus.ACCEPTED);
    }
}
