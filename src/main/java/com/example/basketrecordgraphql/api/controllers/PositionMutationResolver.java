/*package com.example.basketrecordgraphql.api.controllers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.basketrecordgraphql.business.abstracts.PositionService;
import com.example.basketrecordgraphql.entities.concretes.Position;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PositionMutationResolver  implements GraphQLMutationResolver {
    private PositionService positionService;

    @Autowired
    public PositionMutationResolver(PositionService positionService) {
        this.positionService = positionService;
    }

    public void add(Position position){
        this.positionService.add(position);
    }

}*/
