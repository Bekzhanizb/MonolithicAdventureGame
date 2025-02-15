package items;

import player.Player;

public class HealthElixir implements Item{
    private int health = 20;
    ItemManager manager = new ItemManager();

    public int getHealth() {
        return health;
    }
    @Override
    public void use(Player player) {
        player.setPlayerHealth(Math.min(player.getPlayerHealth() + getHealth(), 100));
        manager.removeItem(player, getClass().getSimpleName());
        System.out.println("You used the health elixir: " + player.getPlayerHealth());
    }
}
