package com.mgcsis.dev.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder(builderClassName = "DadoCriacaoBuilder")
@Data
public class DadoCriacao {

    private LocalDateTime criadoEm;
    private Integer criadoPor;

    public static class DadoCriacaoBuilder {
        private LocalDateTime criadoEm = LocalDateTime.now();

    }
}
