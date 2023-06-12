package strategy;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomStrategy implements Strategy {
    @Override
    public Hand nextHand() {
        int index = new Random().nextInt(3);
        return Hand.getHand(index);
    }
}
