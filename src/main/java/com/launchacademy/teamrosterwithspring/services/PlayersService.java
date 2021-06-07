package com.launchacademy.teamrosterwithspring.services;

import com.launchacademy.teamrosterwithspring.models.Player;
import org.springframework.stereotype.Service;

@Service
public class PlayersService {
  public Player newPlayer(String name, String position) {
    Player newPlayer = new Player();
    newPlayer.setName(name);
    newPlayer.setPosition(position);
    return newPlayer;
  }
}
