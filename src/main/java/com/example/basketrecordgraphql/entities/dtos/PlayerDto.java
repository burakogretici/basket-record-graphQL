package com.example.basketrecordgraphql.entities.dtos;

import com.example.basketrecordgraphql.entities.abstracts.Dto;
import lombok.*;


@Data
@Getter
@Setter
public class PlayerDto implements Dto {

    private String firstName;
    private String lastName;
    private String position;
}
