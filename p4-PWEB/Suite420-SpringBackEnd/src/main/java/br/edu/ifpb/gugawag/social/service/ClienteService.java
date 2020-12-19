package br.edu.ifpb.gugawag.social.service;


import br.edu.ifpb.gugawag.social.model.Cliente;
import br.edu.ifpb.gugawag.social.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getClientes() {
        return this.clienteRepository.findAll();
    }

    public Cliente getClientePorId(Long id) {
        return this.clienteRepository.findById(id).orElse(null);
    }

    @Transactional
    public Cliente inserirouAtualizar(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    public void apagar(Long id){
        this.clienteRepository.deleteById(id);
    }
}
