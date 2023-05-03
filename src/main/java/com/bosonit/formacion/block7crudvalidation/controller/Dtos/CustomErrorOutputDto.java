package com.bosonit.formacion.block7crudvalidation.controller.Dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class CustomErrorOutputDto {
    Date timestamp;
    int httpCode;
    String message;
}
