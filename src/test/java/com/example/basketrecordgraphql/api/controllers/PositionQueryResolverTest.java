package com.example.basketrecordgraphql.api.controllers;

import com.example.basketrecordgraphql.business.abstracts.PlayerService;
import com.example.basketrecordgraphql.business.abstracts.PositionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

class PositionQueryResolverTest {
    @Autowired
    private MockMvc mvc;
    @MockBean
    private PositionService positionService;

    @Test
    void getAll() {
        this.positionService.getAll();
    }
}