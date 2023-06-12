package template;

public class Hero implements Charactor {
    private String name;
    private int hp;

    public Hero(String name) {
        this.name = name;
        this.hp = 100;
    }

    @Override
    public void attack(Charactor charactor) {
        System.out.println(getName() + "이(가) " + charactor.getName() + "를(을) 공격했다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
