package br.edu.ifpb.gugawag.social.repositories;

import br.edu.ifpb.gugawag.social.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
