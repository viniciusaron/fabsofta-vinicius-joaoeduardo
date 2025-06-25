package br.univille.projfabsofttireshop.service;

import br.univille.projfabsofttireshop.entity.Fornecedor;

import java.util.List;

public interface FornecedorService {
    List<Fornecedor> getAll();
    Fornecedor save(Fornecedor fornecedor);
    void delete(long id);
    Fornecedor findById(long id);
}