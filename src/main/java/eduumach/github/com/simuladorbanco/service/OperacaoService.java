package eduumach.github.com.simuladorbanco.service;

import eduumach.github.com.simuladorbanco.repository.ClienteRepository;
import eduumach.github.com.simuladorbanco.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperacaoService {

    @Autowired
    ClienteRepository clienteRepository;
    ContaRepository contaRepository;

    //public OperacaoResponse deposito(OperacaoRequest operacaoRequest){

    //}

}
