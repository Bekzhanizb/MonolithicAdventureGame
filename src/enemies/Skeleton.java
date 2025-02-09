package enemies;

public class Skeleton extends Enemy{
    public Skeleton(){
        super(10, 20);
    }

    @Override
    public int getExperience() {
        return getGivenExperience();
    }
}
