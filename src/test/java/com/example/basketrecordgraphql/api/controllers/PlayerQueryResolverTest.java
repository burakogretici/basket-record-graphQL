package com.example.basketrecordgraphql.api.controllers;

import com.example.basketrecordgraphql.business.abstracts.PlayerService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

class PlayerQueryResolverTest {
    @Autowired
    private MockMvc mvc;
    @MockBean
    private PlayerService playerService;

    @Test
    void getAll() {
        this.playerService.getAll();
    }

    @Test
    void getPlayerDetails() {
        this.playerService.getPlayerDetails();
    }
}