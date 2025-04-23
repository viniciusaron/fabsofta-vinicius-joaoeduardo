package br.univille.projfabsofttireshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.projfabsofttireshop.entity.Cliente;
import br.univille.projfabsofttireshop.service.ClienteService;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public ResponseEntity<List<Cliente>> getClientes(){
        var listaClientes = service.getAll();

        return new ResponseEntity<List<Cliente>>(listaClientes, 
                    HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Cliente>
            postCliente(@RequestBody Cliente cliente){
        if(cliente == null){
            return ResponseEntity.badRequest().build();
        }
        if(cliente.getId() == 0){
            service.save(cliente);
            return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
        }
        return ResponseEntity.badRequest().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> 
        putCliente(@PathVariable long id,
                    @RequestBody Cliente cliente){
        if(id <= 0 || cliente == null){
            return ResponseEntity.badRequest().build();
        }
        var clienteAntigo = service.getById(id);
        if(clienteAntigo == null){
            return ResponseEntity.notFound().build();
        }
        
        clienteAntigo.setNome(cliente.getNome());
        clienteAntigo.setCpf(cliente.getCpf());
        clienteAntigo.setEmail(cliente.getEmail());
        clienteAntigo.setTelefone(cliente.getTelefone());
        clienteAntigo.setEndereco(cliente.getEndereco());

        service.save(clienteAntigo);
        return new ResponseEntity<Cliente>(clienteAntigo, HttpStatus.OK);
    }

    
}
