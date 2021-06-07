package com.launchacademy.teamrosterwithspring.controllers;

import com.launchacademy.teamrosterwithspring.models.League;
import com.launchacademy.teamrosterwithspring.models.Player;
import com.launchacademy.teamrosterwithspring.models.Team;
import com.launchacademy.teamrosterwithspring.services.NewTeamService;
import com.launchacademy.teamrosterwithspring.services.TeamsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

@Controller
@RequestMapping("/")
public class TeamsController {

  private TeamsService teamsService;

  @Autowired
  public TeamsController(TeamsService teamsService) {
    this.teamsService = teamsService;
  }

  @GetMapping
  public String listTeams(Model model) {
    model.addAttribute("teams", League.getLeague().getTeams());
    return "teams/index";
  }

  @GetMapping("/teams/{index}")
  public String showTeam(@PathVariable Integer index, Model model) {
    try{
      if(index != null) {
        model.addAttribute("team", League.getLeague().getTeams().get(index));
      }
    }catch (IndexOutOfBoundsException exception) {
      throw new ResponseStatusException(
          HttpStatus.NOT_FOUND
      );
    }
    return "teams/show";
  }

  @GetMapping("/fantasy/teams")
  public String getFantasyTeams(Model model) {
    model.addAttribute("teams", teamsService.getTeams());
    return "fantasy/teams/index";
  }

  @GetMapping("/fantasy/teams/new")
  public String getFantasyTeamForm(@ModelAttribute NewTeamService newTeamService) {
    return "fantasy/teams/new";
  }

  @GetMapping("/fantasy/teams/{index}")
  public String showFantasyTeam(@PathVariable Integer index, Model model) {
    try{
      if(index != null) {
        model.addAttribute("team", teamsService.getTeams().get(index));
      }
    }catch (IndexOutOfBoundsException exception) {
      throw new ResponseStatusException(
          HttpStatus.NOT_FOUND
      );
    }
    return "teams/show";
  }

  @GetMapping("/positions")
  public String getPositionsList(Model model){
    model.addAttribute("positions", League.getLeague().getPositions());
    return "/positions/index";
  }

  @GetMapping("/positions/{position}")
  public String getListOfPlayersByPosition(@PathVariable String position, Model model) {
    List<Player> playersByPosition = League.getLeague().getPlayersByPosition(position);
    if(position != null && playersByPosition != null) {
      model.addAttribute("players", playersByPosition);
    } else {
      throw new ResponseStatusException(
          HttpStatus.NOT_FOUND
      );
    }
    return "positions/show";
  }

  @PostMapping("/fantasy/teams")
  public String createFantasyTeam(@ModelAttribute NewTeamService newTeamService) {
    Team newTeam = newTeamService.instantiateTeam();
    teamsService.addToList(newTeam);
    return "redirect:/fantasy/teams";
  }
}
