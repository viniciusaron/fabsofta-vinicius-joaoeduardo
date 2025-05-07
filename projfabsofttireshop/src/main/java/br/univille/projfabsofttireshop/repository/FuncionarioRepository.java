package br.univille.projfabsofttireshop.repository;

import br.univille.projfabsofttireshop.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    List<Funcionario> findByNome(String nome);
    List<Funcionario> findByCpf(String cpf);
    List<Funcionario> findByCargo(String cargo);
}