package template;

public abstract class Monster implements Charactor {
    private char prefix;
    private int hp;

    public Monster(char prefix) {
        this.prefix = prefix;
        this.hp = 50;
    }

    public char getPrefix() {
        return prefix;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public void attack(Charactor charactor) {
        System.out.println(getName() + "이(가) " + charactor.getName() + "를(을) 공격했다.");
    }
}
