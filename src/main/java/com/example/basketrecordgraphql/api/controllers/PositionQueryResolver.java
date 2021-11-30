package com.example.basketrecordgraphql.api.controllers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.basketrecordgraphql.business.abstracts.PositionService;
import com.example.basketrecordgraphql.entities.concretes.Position;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*import java.util.List;

@Component
@RequiredArgsConstructor
public class PositionQueryResolver implements GraphQLQueryResolver {

    private PositionService positionService;
    @Autowired
    public PositionQueryResolver(PositionService positionService) {
        this.positionService = positionService;
    }
    public List<Position> getAll(){
        var result=  positionService.getAll();
        return result;
    }
}*/
