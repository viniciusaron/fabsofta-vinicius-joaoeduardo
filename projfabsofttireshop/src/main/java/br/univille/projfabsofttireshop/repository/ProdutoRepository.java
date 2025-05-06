package br.univille.projfabsofttireshop.repository;

import br.univille.projfabsofttireshop.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Consultas personalizadas podem ser adicionadas aqui, se necessário.
}
