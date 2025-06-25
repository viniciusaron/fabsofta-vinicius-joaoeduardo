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

    public EstoqueServiceImpl(EstoqueRepository estoqueRepository) {
        this.estoqueRepository = estoqueRepository;
    }

    @Override
    public List<Estoque> getAll() {
        return estoqueRepository.findAll();
    }

    @Override
    public Estoque save(Estoque estoque) {
        return estoqueRepository.save(estoque);
    }

    @Override
    public Estoque findById(long id) {
        Optional<Estoque> estoque = estoqueRepository.findById(id);
        return estoque.orElse(null);
    }

    @Override
    public void delete(long id) {
        estoqueRepository.deleteById(id);
    }
}