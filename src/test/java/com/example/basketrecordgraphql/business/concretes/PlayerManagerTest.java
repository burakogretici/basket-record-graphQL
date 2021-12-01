package com.example.basketrecordgraphql.business.concretes;

import com.example.basketrecordgraphql.business.abstracts.PlayerService;
import com.example.basketrecordgraphql.dataAccess.abstracts.PlayerRepository;
import com.example.basketrecordgraphql.entities.concretes.Player;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class PlayerManagerTest {
    @InjectMocks
    private PlayerService playerService;
    @Mock
    private PlayerRepository playerRepository;

    @Test
    void getAll() {
    this.playerService.getAll();
    }

    @Test
    void getPlayerDetails() {
        this.playerService.getPlayerDetails();
    }

    @Test
    void add() {
        Player player=new Player();
        player.setFirstName("Burak");
        player.setLastName("Öğretici");
        player.setPosition(player.getPosition());
        Player playerMock=Mockito.mock(Player.class);
        Mockito.when(playerRepository.save(ArgumentMatchers.any(Player.class))).thenReturn(playerMock);
        Player result=playerRepository.save(player);
        assertEquals(result.getFirstName(),player.getFirstName());
    }

    @Test
    void delete() {
        Player player=new Player();
        player.setFirstName("Burak");
        this.playerService.delete(player);
    }
}