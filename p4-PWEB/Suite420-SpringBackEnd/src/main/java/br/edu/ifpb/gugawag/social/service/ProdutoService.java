package br.edu.ifpb.gugawag.social.service;

import br.edu.ifpb.gugawag.social.model.Cliente;
import br.edu.ifpb.gugawag.social.model.Produto;
import br.edu.ifpb.gugawag.social.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> getProdutos() {
        return this.produtoRepository.findAll();
    }

    public Produto getProdutoPorId(Long id) {
        return this.produtoRepository.findById(id).orElse(null);
    }

    @Transactional
    public Produto inserirouAtualizar(Produto produto) {
        return this.produtoRepository.save(produto);
    }

    public void apagar(Long id){
        this.produtoRepository.deleteById(id);
    }
}
