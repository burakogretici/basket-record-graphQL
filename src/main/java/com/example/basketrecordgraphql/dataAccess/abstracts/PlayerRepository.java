package com.example.basketrecordgraphql.dataAccess.abstracts;

import com.example.basketrecordgraphql.entities.concretes.Player;
import com.example.basketrecordgraphql.entities.dtos.PlayerDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer> {
    @Query("SELECT NEW com.example.basketrecordgraphql.entities.dtos.PlayerDto"
            +"(p.id,p.firstName,p.lastName,po.positionName)"
            +"FROM Position po INNER JOIN po.players p")
    List<PlayerDto> getPlayerDetails();


}
