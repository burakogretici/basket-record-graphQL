package com.example.basketrecordgraphql.business.abstracts;

import com.example.basketrecordgraphql.entities.concretes.Player;

import java.util.List;

public interface PlayerService {
    List<Player> getAll();

    void add(Player player);
    void delete(Player player);

}
