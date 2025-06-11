package br.univille.projfabsofttireshop.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.univille.projfabsofttireshop.entity.Estoque;
import br.univille.projfabsofttireshop.service.EstoqueService;

@RestController
@RequestMapping("/api/v1/estoque")
public class EstoqueController {

    private final EstoqueService estoqueService;

    public EstoqueController(EstoqueService estoqueService) {
        this.estoqueService = estoqueService;
    }

    @GetMapping
    public List<Estoque> getAll() {
        return estoqueService.getAll();
    }

    @PostMapping
    public ResponseEntity<Estoque> save(@RequestBody Estoque estoque) {
        Estoque savedEstoque = estoqueService.save(estoque);
        return ResponseEntity.ok(savedEstoque);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estoque> findById(@PathVariable long id) {
        Estoque estoque = estoqueService.findById(id);
        if (estoque == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(estoque);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        estoqueService.delete(id);
        return ResponseEntity.noContent().build();
    }
}