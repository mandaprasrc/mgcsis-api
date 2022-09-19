package com.mgcsis.dev.services;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgcsis.dev.domain.TipoTelefone;
import com.mgcsis.dev.repositories.TipoTelefoneRepository;

@Service
public class DBService {
    @Autowired
    TipoTelefoneRepository tipoTelefoneRepository;

    public void instanciaDB() {
        TipoTelefone tt1 = new TipoTelefone(null, "Celular", 1, LocalDateTime.now());

        tipoTelefoneRepository.saveAll(Arrays.asList(tt1));
    }
}
