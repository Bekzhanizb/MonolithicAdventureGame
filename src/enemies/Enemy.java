package enemies;

public abstract class Enemy {
    private int damage; //Enemy Damage
    private int givenExperience; //obtainable Experience

    public Enemy(int damage,  int givenExperience) {
        this.damage = damage;
        this.givenExperience = givenExperience;
    }

    public int getDamage() {
        return damage;
    }


    public int getGivenExperience() {
        return givenExperience;
    }
    public abstract int getExperience();
}
