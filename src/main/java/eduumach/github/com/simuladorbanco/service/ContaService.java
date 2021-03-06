package eduumach.github.com.simuladorbanco.service;

import eduumach.github.com.simuladorbanco.entity.ContaEntity;
import eduumach.github.com.simuladorbanco.repository.ClienteRepository;
import eduumach.github.com.simuladorbanco.repository.ContaRepository;
import eduumach.github.com.simuladorbanco.request.ContaRequest;
import eduumach.github.com.simuladorbanco.response.ContaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    public ContaResponse criar(){
        ContaEntity contaEntity = new ContaEntity();
        contaEntity.setExtrato("Seu extrato é: ");
        contaEntity = contaRepository.save(contaEntity);
        return new ContaResponse(contaEntity.getId(), contaEntity.getExtrato());
    }

}
