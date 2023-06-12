package strategy;

public class Player {
    private String name;
    private Strategy strategy;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }
}
