import level.LevelManager;
import player.Player;
import combat.CombatManager;
import enemies.Enemy;
import items.*;
import score.ScoreManager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MonolithicAdventureGame game = new MonolithicAdventureGame();
        game.startGame();
    }
}

class MonolithicAdventureGame {
    private Player player;
    private LevelManager levelManager;
    private CombatManager combatManager;
    private Scanner scanner;
    private ScoreManager scoreManager;
    private ItemManager itemManager;

    public MonolithicAdventureGame() {
        this.player = new Player();
        this.levelManager = new LevelManager();
        this.combatManager = new CombatManager();
        this.scanner = new Scanner(System.in);
        this.scoreManager = new ScoreManager();
        this.itemManager = new ItemManager();
    }

    public void startGame() {
        System.out.println("Welcome to the Monolithic Adventure Game!");

        while (true) {
            System.out.println("==== Level " + levelManager.getCurrentLevel() + " ====");
            levelManager.setCurrentLevel(levelManager.getCurrentLevel()); // Load current level

            for (Enemy enemy : levelManager.getEnemies()) {
                System.out.println("A Enemy " + enemy.getClass().getSimpleName() + " appears!");
                combatManager.fight(player, enemy);

                if (player.getPlayerHealth() <= 0) {
                    System.out.println("You have been defeated. Game over!\nYour Final Score: " + scoreManager.getFinalScore(player));
                    return;
                }
            }

            for (Item item : levelManager.getItems()) {
                System.out.println("You found a " + item.getClass().getSimpleName() + "!");
                System.out.println("Do you want to use it? (y/n)");
                String choice = scanner.next().toLowerCase();

                if (choice.equals("y")) {
                    item.use(player);
                } else {
                    System.out.println("You decided not to use the " + item.getClass().getSimpleName() + ".");
                    itemManager.pickUpItem(player, item.getClass().getSimpleName());
                }
            }

            if(!player.getInventory().isEmpty()){
                System.out.println("Do you want to use your items? (y/n)");
                String choice = scanner.next().toLowerCase();
                if (choice.equals("y")) {
                    System.out.println("Choose the item you want to use: ");
                    while(true){
                        try {
                            itemManager.displayItems(player);
                            int itemNum = scanner.nextInt();
                            itemManager.useItem(player, itemNum);
                            System.out.println("Do you want to continue using the items? (y/n)");

                            if(scanner.next().equalsIgnoreCase("n") || player.getInventory().isEmpty()){
                                break;
                            }
                        }catch (InputMismatchException e){
                            System.out.println("You have entered an invalid number.");
                            scanner.next();
                        }
                    }
                }if(player.getInventory().isEmpty()){
                    System.out.println("You used all item in your inventory.");
                } else {
                    System.out.println("You decided to keep your items for the next level.");
                }
            }


            System.out.println("Do you want to proceed to the next level? (y/n)");
            String proceed = scanner.next().toLowerCase();
            if (!proceed.equals("y")) {
                System.out.println("You decided to end your journey. Goodbye!\nYour Final Score: " + scoreManager.getFinalScore(player));
                break;
            }

            levelManager.setCurrentLevel(levelManager.getCurrentLevel() + 1);

            if (levelManager.getCurrentLevel() > 4) {
                System.out.println("Congratulations! You have completed all levels!\nYour Final Score: " + scoreManager.getFinalScore(player));
                break;
            }
        }

        scanner.close();
    }
}