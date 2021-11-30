package com.example.basketrecordgraphql.business.concretes;

import com.example.basketrecordgraphql.business.abstracts.PlayerService;
import com.example.basketrecordgraphql.dataAccess.abstracts.PlayerRepository;
import com.example.basketrecordgraphql.entities.concretes.Player;
import com.example.basketrecordgraphql.entities.dtos.PlayerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerManager implements PlayerService {
    private PlayerRepository playerRepository;

    @Autowired
    public PlayerManager(PlayerRepository playerRepository){
        super();
        this.playerRepository=playerRepository;
    }
    @Override
    public List<Player> getAll() {
        return this.playerRepository.findAll();
    }

    @Override
    public List<PlayerDto> getPlayerDetails() {
        return playerRepository.getPlayerDetails();
    }

    @Override
    public void add(Player player) {
      this.playerRepository.save(player);
    }

    @Override
    public void delete(Player player) {
    this.playerRepository.delete(player);
    }

}
