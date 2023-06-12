package template;

public class Wizard extends Hero {
    private int mp = 50;
    public Wizard(String name) {
        super(name);
    }
    @Override
    public void attack(Charactor charactor) {
        mp-=5;
        super.attack(charactor);
    }
}
