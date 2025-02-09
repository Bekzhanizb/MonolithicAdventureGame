package score;

import player.Player;

public class ScoreManager {
    public int getFinalScore(Player player) {
        return player.getPlayerExperience()*5;
    }
}
