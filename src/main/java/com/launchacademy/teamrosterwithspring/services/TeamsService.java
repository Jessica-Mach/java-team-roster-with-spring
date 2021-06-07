package com.launchacademy.teamrosterwithspring.services;

import com.launchacademy.teamrosterwithspring.models.Team;
import com.launchacademy.teamrosterwithspring.repositories.TeamRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamsService {
  private TeamRepository teamRepository;

  @Autowired
  public TeamsService(TeamRepository teamRepository) {
    this.teamRepository = teamRepository;
  }


  public List<Team> findAll() {
    return (List<Team>) teamRepository.findAll();
  }

  public Team save(Team team) {
    return teamRepository.save(team);
  }
}
