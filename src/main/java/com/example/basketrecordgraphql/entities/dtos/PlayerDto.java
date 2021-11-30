package com.example.basketrecordgraphql.entities.dtos;

import com.example.basketrecordgraphql.entities.abstracts.Dto;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDto implements Dto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String position;
}
