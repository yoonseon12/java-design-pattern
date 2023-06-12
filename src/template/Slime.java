package template;

public class Slime extends Monster {
    public Slime(char prefix) {
        super(prefix);
    }

    @Override
    public String getName() {
        return "슬라임" + getPrefix();
    }
}
