package br.univille.projfabsofttireshop.service;

import java.util.List;
import br.univille.projfabsofttireshop.entity.Cliente;

public interface ClienteService {
    Cliente save(Cliente cliente);
    List<Cliente> getAll();
    Cliente getById(long id);
    Cliente delete(long id);

    
}
