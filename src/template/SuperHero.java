package template;

public class SuperHero extends Hero {
    private boolean isFlying = false;

    public SuperHero(String name) {
        super(name);
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }
}
