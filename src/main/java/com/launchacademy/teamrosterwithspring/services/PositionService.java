package com.launchacademy.teamrosterwithspring.services;

import com.launchacademy.teamrosterwithspring.models.Position;
import com.launchacademy.teamrosterwithspring.repositories.PositionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionService {
  private PositionRepository positionRepository;

  @Autowired
  public PositionService(PositionRepository positionRepository) {
    this.positionRepository = positionRepository;
  }

  public List<Position> findAll() {
    return (List<Position>) positionRepository.findAll();
  }

  public void save(Position position) {
    positionRepository.save(position);
  }

  public Position findByName(String name) {
    return positionRepository.findByName(name);
  }
}
