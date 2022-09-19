package com.mgcsis.dev.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class TipoTelefone implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "O campo Tipo de Telefone é requerido!")
    private String dsTipoTelefone;
    private Integer criadoPor;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime criadoEm;

    // region public static class TipoTelefoneBuilder {
    // private LocalDateTime criadoEm = LocalDateTime.now();
    //
    // }

}
