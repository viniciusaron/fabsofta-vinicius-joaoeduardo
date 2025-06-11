package br.univille.projfabsofttireshop.service;

import java.util.List;
import br.univille.projfabsofttireshop.entity.Estoque;

public interface EstoqueService {
    List<Estoque> getAll();
    Estoque save(Estoque estoque);
    Estoque findById(long id);
    void delete(long id);
}