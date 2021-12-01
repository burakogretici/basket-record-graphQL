package com.example.basketrecordgraphql.api.controllers;

import com.example.basketrecordgraphql.business.abstracts.PlayerService;
import com.example.basketrecordgraphql.entities.concretes.Player;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

class PlayerMutationResolverTest {
    @Autowired
    private MockMvc mvc;
    @MockBean
    private PlayerService playerService;

    @Test
    void add(Player player) {
        this.playerService.add(player);
    }

    @Test
    void delete(Player player) {
        this.playerService.add(player);

    }
}