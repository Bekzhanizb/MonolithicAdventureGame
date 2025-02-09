package level;

import enemies.*;
import items.*;

import java.util.ArrayList;
import java.util.List;

public class LevelManager {
    private List<Enemy> enemies;
    private List<Item> items;
    private int currentLevel = 1;

    public LevelManager() {
        this.enemies = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
        clearLevel();
        levels();
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public List<Item> getItems() {
        return items;
    }

    private void clearLevel() {
        enemies.clear();
        items.clear();
    }

    public void levels() {
        switch (getCurrentLevel()) {
            case 1:
                enemies.add(new Skeleton());
                enemies.add(new Zombie());
                items.add(new GoldCoin());
                items.add(new GoldCoin());
                break;
            case 2:
                enemies.add(new Skeleton());
                enemies.add(new Zombie());
                enemies.add(new Zombie());
                items.add(new HealthElixir());
                items.add(new HealthElixir());
                items.add(new GoldCoin());
                break;
            case 3:
                enemies.add(new Skeleton());
                enemies.add(new Zombie());
                enemies.add(new Vampire());
                items.add(new HealthElixir());
                items.add(new HealthElixir());
                items.add(new HealthElixir());
                items.add(new GoldCoin());
                items.add(new MagicScroll());
                break;
            case 4:
                enemies.add(new Skeleton());
                enemies.add(new Skeleton());
                enemies.add(new Zombie());
                enemies.add(new Zombie());
                enemies.add(new Vampire());
                items.add(new HealthElixir());
                items.add(new MagicScroll());
                items.add(new MagicScroll());
                break;
            default:
                break;
        }
    }
}