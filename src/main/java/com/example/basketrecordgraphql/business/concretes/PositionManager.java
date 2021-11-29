package com.example.basketrecordgraphql.business.concretes;

import com.example.basketrecordgraphql.business.abstracts.PositionService;
import com.example.basketrecordgraphql.dataAccess.abstracts.PositionRepository;
import com.example.basketrecordgraphql.entities.concretes.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionManager implements PositionService {

    private PositionRepository positionRepository;
    @Autowired
    public PositionManager(PositionRepository positionRepository){
        super();
        this.positionRepository=positionRepository;
    }
    @Override
    public void add(Position position) {
        positionRepository.save(position);
    }

    @Override
    public List<Position> getAll() {
      return positionRepository.findAll();
    }
}
