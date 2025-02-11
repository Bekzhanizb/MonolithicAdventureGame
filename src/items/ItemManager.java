package items;

import player.Player;

public class ItemManager {
    public void pickUpItem(Player player, String name){
        player.getInventory().add(name);
    }
    public void removeItem(Player player, String name){
        player.getInventory().remove(name);
    }
    public void displayItems(Player player){
        if(player.getInventory().isEmpty()){
            System.out.println("You don't have any items");
        } else {
            for(int i = 0; i < player.getInventory().size(); i++){
                System.out.println((i+1) + ": " + player.getInventory().get(i));
            }
        }
    } public void useItem(Player player, int item){
        String itemName = player.getInventory().get(item-1);
        switch(itemName){
            case "GoldCoin":
                player.setPlayerExperience(player.getPlayerExperience() + 5);
                break;
            case "HealthElixir":
                player.setPlayerHealth(player.getPlayerHealth() + 20);
                break;
            case "MagicScroll":
                player.setPlayerExperience(player.getPlayerExperience() + 15);
                break;
            default:
                break;
        }
        removeItem(player, itemName);
    }
}
