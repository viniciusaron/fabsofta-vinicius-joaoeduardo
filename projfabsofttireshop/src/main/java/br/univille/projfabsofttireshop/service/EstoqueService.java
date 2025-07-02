package br.univille.projfabsofttireshop.service;

import java.util.List;
import java.util.Optional;

import br.univille.projfabsofttireshop.entity.Estoque;

public interface EstoqueService {
    List<Estoque> getAll();
    Estoque save(Estoque estoque);
    Estoque findById(long id);
    void delete(long id);
    Estoque salvar(Estoque estoque);
    Optional<Estoque> buscarPorId(long id);
}