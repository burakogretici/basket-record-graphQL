package com.example.basketrecordgraphql.api.controllers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.basketrecordgraphql.business.abstracts.PlayerService;
import com.example.basketrecordgraphql.entities.concretes.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class PlayerMutationResolver implements GraphQLMutationResolver {
    private PlayerService playerService;

    @Autowired
    public PlayerMutationResolver (PlayerService playerService){
        this.playerService=playerService;
    }
   public void add(Player player){
        this.playerService.add(player);
    }
    public void delete(Player player){
        this.playerService.delete(player);
    }

}
