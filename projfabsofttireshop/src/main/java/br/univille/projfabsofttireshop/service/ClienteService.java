package br.univille.projfabsofttireshop.service;

import java.util.List;
import java.util.Optional;

import br.univille.projfabsofttireshop.entity.Cliente;

public interface ClienteService {
    Cliente save(Cliente cliente);
    List<Cliente> getAll();
    Cliente getById(long id);
    Cliente delete(long id);
    static Optional<Cliente> buscarPorId(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

    
}
