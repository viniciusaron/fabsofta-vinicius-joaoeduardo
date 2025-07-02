package br.univille.projfabsofttireshop.controller;

import br.univille.projfabsofttireshop.entity.Fornecedor;
import br.univille.projfabsofttireshop.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/fornecedores")
public class FornecedorController {
    
    @Autowired
    private FornecedorService service;

    @GetMapping
    public ResponseEntity<List<Fornecedor>> getFornecedores(){
        var listaFornecedores = service.getAll();
        return new ResponseEntity<List<Fornecedor>>(listaFornecedores, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fornecedor> buscarFornecedor(@PathVariable long id) {
        Fornecedor fornecedor = service.findById(id);
        if(fornecedor == null){
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity<Fornecedor>(fornecedor, HttpStatus.OK); 
    }

    @PostMapping
    public ResponseEntity<Fornecedor> postFornecedor(@RequestBody Fornecedor fornecedor){
        if(fornecedor == null){
            return ResponseEntity.badRequest().build();
        }
        if(fornecedor.getId() == 0){
            try {
                Fornecedor saved = service.save(fornecedor);
                return new ResponseEntity<Fornecedor>(saved, HttpStatus.OK);
            } catch (Exception e) {
                e.printStackTrace();
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Fornecedor> putFornecedor(@PathVariable long id, @RequestBody Fornecedor fornecedor){
        if(id <= 0 || fornecedor == null){
            return ResponseEntity.badRequest().build();
        }
        var fornecedorAntigo = service.getById(id);
        if(fornecedorAntigo == null){
            return ResponseEntity.notFound().build();
        }
        
        fornecedorAntigo.setCnpj(fornecedor.getCnpj());
        fornecedorAntigo.setRazaoSocial(fornecedor.getRazaoSocial());
        fornecedorAntigo.setNomeFantasia(fornecedor.getNomeFantasia());

        service.save(fornecedorAntigo);
        return new ResponseEntity<Fornecedor>(fornecedorAntigo, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Fornecedor> deleteFornecedor(@PathVariable long id){
        if(id <= 0){
            return ResponseEntity.badRequest().build();
        }
        var fornecedorExcluir = service.getById(id);
        if(fornecedorExcluir == null){
            return ResponseEntity.notFound().build();
        }

        service.delete(id);
        return new ResponseEntity<Fornecedor>(fornecedorExcluir, HttpStatus.OK);
    }
}