package com.example.basketrecordgraphql.business.abstracts;

import com.example.basketrecordgraphql.entities.concretes.Position;

import java.util.List;

public interface PositionService {
    void add(Position position);
    List<Position> getAll();
}
