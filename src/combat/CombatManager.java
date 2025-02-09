package combat;

import enemies.Enemy;
import player.Player;
import level.LevelManager;

public class CombatManager {
    LevelManager levelManager = new LevelManager();
    public void fight(Player player, Enemy enemy) {
        System.out.println(player.getPlayerName() + " engages in combat with " + enemy.getClass().getSimpleName() + "!");
        player.setPlayerHealth(player.getPlayerHealth() - enemy.getDamage());
        player.setPlayerExperience(player.getPlayerExperience() + enemy.getExperience());
        levelManager.getEnemies().remove(enemy);
        System.out.println("After combat: Health = " + player.getPlayerHealth() +
                ", Experience = " + player.getPlayerExperience());
    }
}
