package com.example.basketrecordgraphql.business.abstracts;

import com.example.basketrecordgraphql.entities.concretes.Player;
import com.example.basketrecordgraphql.entities.dtos.PlayerDto;

import java.util.List;

public interface PlayerService {
    List<Player> getAll();
    List<PlayerDto> getPlayerDetails();
    void add(Player player);
    void delete(Player player);

}
