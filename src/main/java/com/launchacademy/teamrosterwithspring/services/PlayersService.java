package com.launchacademy.teamrosterwithspring.services;

import com.launchacademy.teamrosterwithspring.models.Player;
import com.launchacademy.teamrosterwithspring.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayersService {

  private PlayerRepository playerRepository;

  @Autowired
  public PlayersService(
      PlayerRepository playerRepository) {
    this.playerRepository = playerRepository;
  }

  public Player findByPosition(String position) {
    return playerRepository.findByPosition(position);
  }
}

//  public Player newPlayer(String name, String position) {
//    Player newPlayer = new Player();
//    newPlayer.setName(name);
//    newPlayer.setPosition(position);
//    return newPlayer;
//  }