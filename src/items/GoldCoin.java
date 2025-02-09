package items;

import player.Player;

public class GoldCoin implements Item {
    private int experience = 5;
    ItemManager manager = new ItemManager();

    public int getExperience() {
        return experience;
    }

    @Override
    public void use(Player player) {
        player.setPlayerExperience(player.getPlayerExperience() + getExperience());
        manager.removeItem(player, getClass().getSimpleName());
        System.out.println("You used the gold coin! Now your experience: " + player.getPlayerExperience());
    }
}
