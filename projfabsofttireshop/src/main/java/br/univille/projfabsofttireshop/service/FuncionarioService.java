package br.univille.projfabsofttireshop.service;

import br.univille.projfabsofttireshop.entity.Funcionario;

import java.util.List;
import java.util.Optional;

public interface FuncionarioService {
    List<Funcionario> listarTodos();
    Optional<Funcionario> buscarPorId(long id);
    Funcionario salvar(Funcionario funcionario);
    void excluir(long id);
    List<Funcionario> buscarPorNome(String nome);
    List<Funcionario> buscarPorCpf(String cpf);
    List<Funcionario> buscarPorCargo(String cargo);
}