package com.mgcsis.dev.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgcsis.dev.domain.TipoTelefone;
import com.mgcsis.dev.repositories.TipoTelefoneRepository;
import com.mgcsis.dev.services.exceptions.ObjectNotFoundException;

@Service
public class TipoTelefoneService {

    @Autowired
    TipoTelefoneRepository repository;

    public TipoTelefone findById(Integer id) {
        Optional<TipoTelefone> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id:" + id + ", Tipo: " + TipoTelefone.class.getName()));
    }

    public List<TipoTelefone> findAll() {
        return repository.findAll();
    }

    public TipoTelefone create(TipoTelefone tipoTelefone) {
        return repository.save(new TipoTelefone(null, tipoTelefone.getDsTipoTelefone(), 1, LocalDateTime.now()));
    }

    public TipoTelefone update(Integer id, @Valid TipoTelefone objTipoTelefone) {
        TipoTelefone oldObj = findById(id);

        oldObj.setDsTipoTelefone(objTipoTelefone.getDsTipoTelefone());

        return repository.save(oldObj);
    }

    public void delete(Integer id){
        findById(id);
        
        repository.deleteById(id);
    }
}