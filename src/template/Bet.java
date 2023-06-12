package template;

public class Bet extends Monster {
    public Bet(char prefix) {
        super(prefix);
    }

    @Override
    public String getName() {
        return "박쥐 "+getPrefix();
    }
}
