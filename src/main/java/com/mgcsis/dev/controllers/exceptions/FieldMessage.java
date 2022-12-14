package com.mgcsis.dev.controllers.exceptions;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class FieldMessage implements Serializable{
    private static final long serialVersionUID = 1L;

    private String fieldName;
    private String message;
}
