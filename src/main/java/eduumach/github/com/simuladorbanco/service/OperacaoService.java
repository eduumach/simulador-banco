package eduumach.github.com.simuladorbanco.service;

import eduumach.github.com.simuladorbanco.entity.ContaEntity;
import eduumach.github.com.simuladorbanco.repository.ClienteRepository;
import eduumach.github.com.simuladorbanco.repository.ContaRepository;
import eduumach.github.com.simuladorbanco.request.OperacaoRequest;
import eduumach.github.com.simuladorbanco.response.OperacaoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperacaoService {

    @Autowired
    ContaRepository contaRepository;

    public OperacaoResponse deposito(OperacaoRequest operacaoRequest){
        ContaEntity contaEntity = contaRepository.getById(operacaoRequest.getConta());
        double saldo = contaEntity.getSaldo();
        saldo += operacaoRequest.getValor();
        String extrato = contaEntity.getExtrato();
        extrato += "\n Deposito no valor de: " + operacaoRequest.getValor();
        contaEntity.setSaldo(saldo);
        contaEntity.setExtrato(extrato);
        contaRepository.save(contaEntity);
        return new OperacaoResponse(contaEntity.getId(), contaEntity.getExtrato());
    }

    public OperacaoResponse saque(OperacaoRequest operacaoRequest){
        ContaEntity contaEntity = contaRepository.getById(operacaoRequest.getConta());
        double saldo = contaEntity.getSaldo();
        if(saldo <= operacaoRequest.getValor()){
            throw new RuntimeException("Saldo insuficiente.");
        }
        saldo -= operacaoRequest.getValor();
        String extrato = contaEntity.getExtrato();
        extrato += "\n Saque no valor de: " + operacaoRequest.getValor();
        contaEntity.setSaldo(saldo);
        contaEntity.setExtrato(extrato);
        contaRepository.save(contaEntity);
        return new OperacaoResponse(contaEntity.getId(), contaEntity.getExtrato());
    }

}
