package com.launchacademy.teamrosterwithspring.services;

import com.launchacademy.teamrosterwithspring.models.Player;

public class PlayersService {
  public Player newPlayer(String name, String position) {
    Player newPlayer = new Player();
    newPlayer.setName(name);
    newPlayer.setPosition(position);
    return newPlayer;
  }
}
