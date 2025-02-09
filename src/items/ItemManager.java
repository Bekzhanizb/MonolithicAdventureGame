package items;

import player.Player;

public class ItemManager {
    public void pickUpItem(Player player, String name){
        player.getInventory().add(name);
    }
    public void removeItem(Player player, String name){
        player.getInventory().remove(name);
    }
}
