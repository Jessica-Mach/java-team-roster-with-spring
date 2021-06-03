package com.launchacademy.teamrosterwithspring.services;

import com.launchacademy.teamrosterwithspring.models.Team;
import java.util.List;

public interface TeamsService {
  List<Team> getTeams();
  void addToList(Team team);
}
