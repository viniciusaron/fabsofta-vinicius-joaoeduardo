package br.univille.projfabsofttireshop.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.univille.projfabsofttireshop.entity.Estoque;
import br.univille.projfabsofttireshop.repository.EstoqueRepository;
import br.univille.projfabsofttireshop.service.EstoqueService;

@Service
public class EstoqueServiceImpl implements EstoqueService {

    private final EstoqueRepository estoqueRepository;
    private EstoqueRepository repository;

    public EstoqueServiceImpl(EstoqueRepository repository) {
        this.estoqueRepository = null;
        this.repository = repository;
    }

    @Override
    public List<Estoque> getAll() {
        return repository.findAll();
    }

    @Override
    public Estoque save(Estoque estoque) {
        return repository.save(estoque);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

    @Override
    public Estoque findById(long id) {
        Optional<Estoque> estoque = repository.findById(id);
        return estoque.orElse(null);
    }

    @Override
    public Estoque salvar(Estoque estoque) {
        return estoqueRepository.save(estoque);
    }

    @Override
    public Optional<Estoque> buscarPorId(long id) {
        return estoqueRepository.findById(id);
    }
}