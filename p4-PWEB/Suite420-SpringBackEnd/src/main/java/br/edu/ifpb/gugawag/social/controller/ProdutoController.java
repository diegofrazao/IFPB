package br.edu.ifpb.gugawag.social.controller;

import br.edu.ifpb.gugawag.social.model.Produto;
import br.edu.ifpb.gugawag.social.service.ProdutoService;
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
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/produtos")
    public List<Produto> getClientes(){
        return this.produtoService.getProdutos();
    }

    @GetMapping("/produtos/{id}")
    public Produto getProdutoPorId(@PathVariable("id") Long id){
        return this.produtoService.getProdutoPorId(id);
    }

    @PostMapping("/produtos")
    public Produto inserirProduto(@RequestBody Produto produto){
        return this.produtoService.inserirouAtualizar(produto);
    }

    @PutMapping("/produtos/{id}")
    public Produto atualizarProduto(@RequestBody Produto produto){
        return this.produtoService.inserirouAtualizar(produto);
    }

    @DeleteMapping("/produtos/{id}")
    public void apagarProduto(@PathVariable("id") Long id){
        this.produtoService.apagar(id);
    }
}
