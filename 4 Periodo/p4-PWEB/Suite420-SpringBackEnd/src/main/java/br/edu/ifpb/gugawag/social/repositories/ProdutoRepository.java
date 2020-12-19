package br.edu.ifpb.gugawag.social.repositories;

import br.edu.ifpb.gugawag.social.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
