package com.backlog.app.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "games")
@Data
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gameID;
    private String title;
    private String status;
}
