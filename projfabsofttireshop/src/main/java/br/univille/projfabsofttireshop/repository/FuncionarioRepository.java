package br.univille.projfabsofttireshop.repository;

import br.univille.projfabsofttireshop.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    // Consultas personalizadas podem ser adicionadas aqui, se necessário.
}
