package com.example.basketrecordgraphql.api.controllers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.basketrecordgraphql.business.abstracts.PlayerService;
import com.example.basketrecordgraphql.dataAccess.abstracts.PlayerRepository;
import com.example.basketrecordgraphql.entities.concretes.Player;
import com.example.basketrecordgraphql.entities.dtos.PlayerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PlayerQueryResolver implements GraphQLQueryResolver {
    private PlayerService playerService;

    @Autowired
    public PlayerQueryResolver(PlayerService playerService){
        super();
        this.playerService=playerService;
    }
    public List<Player> getAll(){
         var result=  playerService.getAll();
         return result;
        }

        public List<PlayerDto> getPlayerDetails(){
           var result=playerService.getPlayerDetails();
           return result;
        }
}
