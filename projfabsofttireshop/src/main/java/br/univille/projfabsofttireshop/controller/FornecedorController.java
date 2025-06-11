package br.univille.projfabsofttireshop.controller;

import br.univille.projfabsofttireshop.entity.Fornecedor;
import br.univille.projfabsofttireshop.service.FornecedorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fornecedores")
public class FornecedorController {
    private final FornecedorService service;

    public FornecedorController(FornecedorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Fornecedor> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Fornecedor save(@RequestBody Fornecedor fornecedor) {
        return service.save(fornecedor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        service.delete(id);
    }

    @GetMapping("/{id}")
    public Fornecedor findById(@PathVariable long id) {
        return service.findById(id);
    }
}