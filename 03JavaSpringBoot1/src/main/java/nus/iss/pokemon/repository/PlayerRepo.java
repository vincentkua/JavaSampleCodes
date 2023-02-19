package nus.iss.pokemon.repository;

import org.springframework.stereotype.Repository;

import nus.iss.pokemon.model.Player;

@Repository
public class PlayerRepo {

    private Player player;

    public PlayerRepo() {
        if (player == null) {
            player = new Player();
        }

        player.setName("YangYangYang");
        player.setScore(0);

    }

    public Integer playerScore() {
        return player.getScore();
    };

    public String playerName() {
        return player.getName();
    };

    public void correct() {
        player.setScore(player.getScore() + 1);
    }

    public void wrong() {
        if (player.getScore() <= 0) {
            player.setScore(0);
        } else {
            player.setScore(player.getScore() - 1);
        }

    }

    public void setScore(int score) {
        player.setScore(score);
    }

}
