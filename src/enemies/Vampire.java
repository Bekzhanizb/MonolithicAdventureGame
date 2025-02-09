package enemies;

public class Vampire extends Enemy{
    public Vampire() {
        super(25, 50);
    }

    @Override
    public int getExperience() {
        return getGivenExperience();
    }
}
