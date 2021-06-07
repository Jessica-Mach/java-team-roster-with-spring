package com.launchacademy.teamrosterwithspring.seeders;

import com.google.inject.internal.util.Lists;
import com.launchacademy.teamrosterwithspring.models.Player;
import com.launchacademy.teamrosterwithspring.models.Position;
import com.launchacademy.teamrosterwithspring.models.Team;
import com.launchacademy.teamrosterwithspring.services.PlayersService;
import com.launchacademy.teamrosterwithspring.services.PositionService;
import com.launchacademy.teamrosterwithspring.services.TeamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringRosterSeeder implements CommandLineRunner {

  private TeamsService teamsService;
  private PlayersService playersService;
  private PositionService positionService;

  @Autowired
  public SpringRosterSeeder(TeamsService teamsService,
      PlayersService playersService,
      PositionService positionService) {
    this.teamsService = teamsService;
    this.playersService = playersService;
    this.positionService = positionService;
  }

  @Override
  public void run(String... args) throws Exception {

    if(Lists.newArrayList(teamsService.findAll()).size() == 0) {
      Position skip = new Position();
      skip.setName("Skip");
      positionService.save(skip);

      Position lead = new Position();
      lead.setName("Lead");
      positionService.save(lead);

      Position second = new Position();
      second.setName("Second");
      positionService.save(second);

      Position third = new Position();
      third.setName("Third");
      positionService.save(third);

      Position alternate = new Position();
      alternate.setName("Alternate");
      positionService.save(alternate);

      Team team = new Team();
      team.setTeamName("Norway");
      teamsService.save(team);
      Player player = new Player();
      player.setPosition(skip);
      player.setName("Thomas Ulsrud");
      player.setTeam(team);
      playersService.save(player);

      player = new Player();
      player.setPosition(third);
      player.setName("Torger Nergård");
      player.setTeam(team);
      playersService.save(player);

      player = new Player();
      player.setPosition(second);
      player.setName("Christoffer Svae");
      player.setTeam(team);
      playersService.save(player);

      player = new Player();
      player.setPosition(lead);
      player.setName("Håvard Vad Petersson");
      player.setTeam(team);
      playersService.save(player);

      player = new Player();
      player.setPosition(alternate);
      player.setName("Markus Høiberg");
      player.setTeam(team);
      playersService.save(player);

      team = new Team();
      team.setTeamName("South Korea");
      teamsService.save(team);

      player = new Player();
      player.setPosition(skip);
      player.setName("Kim Chang-min");
      player.setTeam(team);
      playersService.save(player);

      player = new Player();
      player.setPosition(third);
      player.setName("Seong Se-hyeon");
      player.setTeam(team);
      playersService.save(player);

      player = new Player();
      player.setPosition(second);
      player.setName("Oh Eun-su");
      player.setTeam(team);
      playersService.save(player);

      player = new Player();
      player.setPosition(lead);
      player.setName("Lee Ki-bok");
      player.setTeam(team);
      playersService.save(player);

      player = new Player();
      player.setPosition(alternate);
      player.setName("Kim Min-chan");
      player.setTeam(team);
      playersService.save(player);

      team = new Team();
      team.setTeamName("Sweden");
      teamsService.save(team);
      player = new Player();
      player.setPosition(skip);
      player.setName("Niklas Edin");
      player.setTeam(team);
      playersService.save(player);

      player = new Player();
      player.setPosition(third);
      player.setName("Oskar Eriksson");
      player.setTeam(team);
      playersService.save(player);

      player = new Player();
      player.setPosition(second);
      player.setName("Rasmus Wranå");
      player.setTeam(team);
      playersService.save(player);

      player = new Player();
      player.setPosition(lead);
      player.setName("Christoffer Sundgren");
      player.setTeam(team);
      playersService.save(player);

      player = new Player();
      player.setPosition(alternate);
      player.setName("Henrik Leek");
      player.setTeam(team);
      playersService.save(player);

      team = new Team();
      team.setTeamName("Switzerland");
      teamsService.save(team);
      player = new Player();
      player.setPosition(second);
      player.setName("Benoît Schwarz");
      player.setTeam(team);
      playersService.save(player);

      player = new Player();
      player.setPosition(third);
      player.setName("Claudio Pätz");
      player.setTeam(team);
      playersService.save(player);

      player = new Player();
      player.setPosition(skip);
      player.setName("Peter de Cruz");
      player.setTeam(team);
      playersService.save(player);

      player = new Player();
      player.setPosition(lead);
      player.setName("Valentin Tanner");
      player.setTeam(team);
      playersService.save(player);

      player = new Player();
      player.setPosition(alternate);
      player.setName("Dominik Märki");
      player.setTeam(team);
      playersService.save(player);

      team = new Team();
      team.setTeamName("United States");
      teamsService.save(team);
      player = new Player();
      player.setPosition(skip);
      player.setName("John Shuster");
      player.setTeam(team);
      playersService.save(player);

      player = new Player();
      player.setPosition(third);
      player.setName("Tyler George");
      player.setTeam(team);
      playersService.save(player);

      player = new Player();
      player.setPosition(second);
      player.setName("Matt Hamilton");
      player.setTeam(team);
      playersService.save(player);

      player = new Player();
      player.setPosition(lead);
      player.setName("John Landsteiner");
      player.setTeam(team);
      playersService.save(player);

      player = new Player();
      player.setPosition(alternate);
      player.setName("Joe Polo");
      player.setTeam(team);
      playersService.save(player);
    }
  }
}
