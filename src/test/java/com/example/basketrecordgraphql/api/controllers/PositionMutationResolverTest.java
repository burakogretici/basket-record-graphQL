package com.example.basketrecordgraphql.api.controllers;


import com.example.basketrecordgraphql.business.abstracts.PositionService;
import com.example.basketrecordgraphql.entities.concretes.Position;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

class PositionMutationResolverTest {
    @Autowired
    private MockMvc mvc;
    @MockBean
    private PositionService positionService;

    @Test
    void add(Position position) {
        this.positionService.add(position);
    }
}