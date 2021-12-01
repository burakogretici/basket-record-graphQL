package com.example.basketrecordgraphql.business.concretes;


import com.example.basketrecordgraphql.business.abstracts.PositionService;
import com.example.basketrecordgraphql.dataAccess.abstracts.PositionRepository;
import com.example.basketrecordgraphql.entities.concretes.Position;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class PositionManagerTest {

    @InjectMocks
    private PositionService positionService;
    @Mock
    private PositionRepository positionRepository;

    @Test
    void add() {
        Position position =new Position();
        position.setPositionName("PG");
        Position positionMock= Mockito.mock(Position.class);
        Mockito.when(positionRepository.save(ArgumentMatchers.any(Position.class))).thenReturn(positionMock);
        Position result=positionRepository.save(position);
        assertEquals(result.getPositionName(),position.getPositionName());
    }

    @Test
    void getAll() {
        this.positionService.getAll();
    }
}