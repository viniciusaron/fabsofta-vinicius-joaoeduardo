package br.univille.projfabsofttireshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.univille.projfabsofttireshop.entity.Fornecedor;
import br.univille.projfabsofttireshop.repository.FornecedorRepository;
import br.univille.projfabsofttireshop.service.FornecedorService;

@Service
public class FornecedorServiceImpl implements FornecedorService {

    @Autowired
    private FornecedorRepository repository;

    @Override
    public Fornecedor save(Fornecedor fornecedor) {
        System.out.println("Salvando fornecedor: " + fornecedor.getCnpj() + " - " + fornecedor.getRazaoSocial());
        try {
            Fornecedor saved = repository.save(fornecedor);
            System.out.println("Fornecedor salvo com sucesso. ID: " + saved.getId());
            return saved;
        } catch (Exception e) {
            System.err.println("Erro ao salvar fornecedor: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Fornecedor> getAll() {
        return repository.findAll();
    }

    @Override
    public Fornecedor getById(long id) {
        var retorno = repository.findById(id);
        if(retorno.isPresent()){
            return retorno.get();
        }
        return null;
    }

    @Override
    public Fornecedor delete(long id) {
        var fornecedor = getById(id);
        if(fornecedor != null){
            repository.deleteById(id);
        }
        return fornecedor;
    }

    @Override
    public Fornecedor findById(long id) {
        var retorno = repository.findById(id);
        if (retorno.isPresent())
            return retorno.get();
        return null;
    }
}

