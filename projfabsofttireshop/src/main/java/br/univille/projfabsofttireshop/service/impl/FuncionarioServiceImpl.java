package br.univille.projfabsofttireshop.service.impl;

import br.univille.projfabsofttireshop.entity.Funcionario;
import br.univille.projfabsofttireshop.repository.FuncionarioRepository;
import br.univille.projfabsofttireshop.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public List<Funcionario> listarTodos() {
        return funcionarioRepository.findAll();
    }

    @Override
    public Optional<Funcionario> buscarPorId(long id) {
        return funcionarioRepository.findById(id);
    }

    @Override
    public Funcionario salvar(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    @Override
    public void excluir(long id) {
        funcionarioRepository.deleteById(id);
    }

    @Override
    public List<Funcionario> buscarPorNome(String nome) {
        return funcionarioRepository.findByNome(nome);
    }

    @Override
    public List<Funcionario> buscarPorCpf(String cpf) {
        return funcionarioRepository.findByCpf(cpf);
    }

    @Override
    public List<Funcionario> buscarPorCargo(String cargo) {
        return funcionarioRepository.findByCargo(cargo);
    }
}