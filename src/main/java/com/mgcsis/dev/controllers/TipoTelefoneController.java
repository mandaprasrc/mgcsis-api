package com.mgcsis.dev.controllers;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mgcsis.dev.domain.TipoTelefone;
import com.mgcsis.dev.services.TipoTelefoneService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/tipoTelefone")
public class TipoTelefoneController {

    @Autowired
    TipoTelefoneService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<TipoTelefone> findById(@PathVariable Integer id) {
        TipoTelefone obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public ResponseEntity<List<TipoTelefone>> findAll() {
        List<TipoTelefone> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<TipoTelefone> create(@Valid @RequestBody TipoTelefone objTelefone) {
        TipoTelefone newObj = service.create(objTelefone);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<TipoTelefone> update(@PathVariable Integer id,
            @Valid @RequestBody TipoTelefone objTipoTelefone) {
        TipoTelefone newObj = service.update(id, objTipoTelefone);

        return ResponseEntity.ok().body(newObj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);

        return ResponseEntity.noContent().build();
    }
}
