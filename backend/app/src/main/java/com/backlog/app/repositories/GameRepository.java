package com.backlog.app.repositories;
import com.backlog.app.models.Game;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    List<Game> findByStatus(String status);
    List<Game> findByGenre(String genre);
    List<Game> findByPlatform(String platform);

}
