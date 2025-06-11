package br.univille.projfabsofttireshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.univille.projfabsofttireshop.entity.Estoque;

@Repository
public interface EstoqueRepository 
        extends JpaRepository<Estoque, Long> {
}