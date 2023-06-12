package template;

public class Wolf extends Monster {
    public Wolf(char prefix) {
        super(prefix);
    }

    @Override
    public String getName() {
        return "늑대 "+getPrefix();
    }
}
