package com.launchacademy.teamrosterwithspring.repositories;

import com.launchacademy.teamrosterwithspring.models.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

}
