package com.launchacademy.teamrosterwithspring.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "positions")
public class Position {

  @Id
  @SequenceGenerator(name="position_generator", sequenceName="positions_id_seq", allocationSize = 1)
  @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="position_generator")
  @Column(name="id", nullable=false, unique=true)
  private Integer id;

  @NotBlank
  @Column(name="name")
  private String name;

  @OneToMany(mappedBy = "position")
  private List<Player> players = new ArrayList<>();

  public void addPlayer(Player player) {
    this.players.add(player);
  }
}
