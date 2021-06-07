package com.launchacademy.teamrosterwithspring.services;

import com.launchacademy.teamrosterwithspring.models.Player;
import com.launchacademy.teamrosterwithspring.models.Position;
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

  public Player findByPositionId(Integer positionId) {
    return playerRepository.findByPositionId(positionId);
  }

  public void save(Player player) {
    playerRepository.save(player);
  }
}
