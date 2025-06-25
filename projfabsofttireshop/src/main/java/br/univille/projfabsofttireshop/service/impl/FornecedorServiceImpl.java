package br.univille.projfabsofttireshop.service.impl;

import br.univille.projfabsofttireshop.entity.Fornecedor;
import br.univille.projfabsofttireshop.repository.FornecedorRepository;
import br.univille.projfabsofttireshop.service.FornecedorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorServiceImpl implements FornecedorService {
    private final FornecedorRepository repository;

    public FornecedorServiceImpl(FornecedorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Fornecedor> getAll() {
        return repository.findAll();
    }

    @Override
    public Fornecedor save(Fornecedor fornecedor) {
        return repository.save(fornecedor);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

    @Override
    public Fornecedor findById(long id) {
        Optional<Fornecedor> fornecedor = repository.findById(id);
        return fornecedor.orElse(null);
    }
}