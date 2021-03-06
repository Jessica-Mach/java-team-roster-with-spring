package com.launchacademy.teamrosterwithspring.repositories;

import com.launchacademy.teamrosterwithspring.models.Position;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends CrudRepository<Position, Long> {

  Position findByName(String name);
}
