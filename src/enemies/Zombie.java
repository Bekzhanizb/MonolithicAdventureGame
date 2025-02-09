package enemies;

public class Zombie extends Enemy{
    public Zombie(){
        super(15, 30);
    }

    @Override
    public int getExperience() {
        return getGivenExperience();
    }
}
