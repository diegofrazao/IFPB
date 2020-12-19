package br.edu.ifpb.gugawag.social.controller;

import br.edu.ifpb.gugawag.social.model.Cliente;
import br.edu.ifpb.gugawag.social.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> getClientes(){
        return this.clienteService.getClientes();
    }

    @GetMapping("/clientes/{id}")
    public Cliente getClientePorId(@PathVariable("id") Long id){
        return this.clienteService.getClientePorId(id);
    }

    @PostMapping("/clientes")
    public Cliente inserirCliente(@RequestBody Cliente cliente){
        return this.clienteService.inserirouAtualizar(cliente);
    }

    @PutMapping("/clientes/{id}")
    public Cliente atualizarCliente(@RequestBody Cliente cliente){
        return this.clienteService.inserirouAtualizar(cliente);
    }

    @DeleteMapping("/clientes/{id}")
    public void apagarCliente(@PathVariable("id") Long id){
        this.clienteService.apagar(id);
    }
}
