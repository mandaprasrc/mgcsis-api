package com.mgcsis.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mgcsis.dev.domain.TipoTelefone;

@Repository
public interface TipoTelefoneRepository extends JpaRepository<TipoTelefone, Integer>{
    
}
