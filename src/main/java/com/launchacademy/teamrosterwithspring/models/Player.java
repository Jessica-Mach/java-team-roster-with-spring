package com.launchacademy.teamrosterwithspring.models;

import org.springframework.stereotype.Component;

@Component
public class Player {
  private String name;
  private String position;
  private String teamName;

  public Player() {
    this.teamName = "";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }
}

