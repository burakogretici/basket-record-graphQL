package com.example.basketrecordgraphql.api.controllers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.basketrecordgraphql.business.abstracts.PlayerService;
import com.example.basketrecordgraphql.entities.concretes.Player;
import com.example.basketrecordgraphql.entities.dtos.PlayerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PlayerMutationResolver implements GraphQLMutationResolver {
    private PlayerService playerService;

    @Autowired
    public PlayerMutationResolver(PlayerService playerService){
        super();
        this.playerService=playerService;
    }
   public Player add(PlayerDto playerDto){
    return playerService.add(playerDto);
    }


}
