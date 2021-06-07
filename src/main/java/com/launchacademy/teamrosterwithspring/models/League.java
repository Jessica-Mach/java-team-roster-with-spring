package com.launchacademy.teamrosterwithspring.models;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class League {
  private List<Team> teams;
  private List<String> positions;

  public League() {
    this.teams = new ArrayList<Team>();
    this.positions = new ArrayList<>();
    this.positions.add("Skip");
    this.positions.add("Lead");
    this.positions.add("Second");
    this.positions.add("Third");
    this.positions.add("Alternate");
  }

  public void addTeam(Team team) {
    teams.add(team);
  }


  public List<Team> getTeams() {
    return teams;
  }

  public List<String> getPositions() {
    return positions;
  }

  public void setPositions(List<String> positions) {
    this.positions = positions;
  }

  public List<Player> getPlayersByPosition(String position) {
    if(!this.positions.contains(position)){
      return null;
    }
    List<Player> playersByPosition = new ArrayList<>();
    for(Team team : this.teams) {
      for(Player player : team.getPlayers()){
//        if(player.getPosition().equalsIgnoreCase(position)) {
////          player.setTeamName(team.getTeamName());
//          playersByPosition.add(player);
//        }
      }
    }
    return playersByPosition;
  }
}

