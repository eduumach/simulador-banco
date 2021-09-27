package eduumach.github.com.simuladorbanco.service;

import eduumach.github.com.simuladorbanco.entity.ClienteEntity;
import eduumach.github.com.simuladorbanco.entity.ContaEntity;
import eduumach.github.com.simuladorbanco.repository.ClienteRepository;
import eduumach.github.com.simuladorbanco.repository.ContaRepository;
import eduumach.github.com.simuladorbanco.request.ClienteRequest;
import eduumach.github.com.simuladorbanco.response.ClienteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    ContaRepository contaRepository;

    public ClienteResponse criar(ClienteRequest clienteRequest){
        if(clienteRepository.findByCpf(clienteRequest.getCpf()) != null){
            throw new RuntimeException("Cpf já cadastrado.");
        }
        ClienteEntity clienteEntity = new ClienteEntity(clienteRequest.getCpf(), clienteRequest.getNome());
        clienteEntity = clienteRepository.save(clienteEntity);
        return new ClienteResponse(clienteEntity.getId(), clienteEntity.getCpf(), clienteEntity.getNome());
    }

    public ClienteResponse associaConta(ClienteRequest clienteRequest){
        if(!contaRepository.existsById(clienteRequest.getIdConta())){
            throw new RuntimeException("Conta não existe.");
        }else if (clienteRepository.findByCpf(clienteRequest.getCpf()) == null){
            throw new RuntimeException("Cria um cliente.");
        }else if (clienteRepository.findByCpf(clienteRequest.getCpf()).getConta() != null){
            throw new RuntimeException("Conta já adicionada a cliente.");
        }
        ContaEntity contaEntity = contaRepository.getById(clienteRequest.getIdConta());
        ClienteEntity clienteEntity = clienteRepository.findByCpf(clienteRequest.getCpf());
        clienteEntity.setConta(contaEntity);
        clienteEntity = clienteRepository.save(clienteEntity);
        return new ClienteResponse(clienteEntity.getId(), clienteEntity.getCpf(), clienteEntity.getNome(), contaEntity.getId());
    }
}
