class Warrior extends GameCharacter {
    int strength;

    public Warrior(String name, int health, int level, int strength) {
        super(name, health, level);
        this.strength = strength;
    }

    @Override
    void attack() {
        System.out.println(name + " attacks with a sword!");
    }

    @Override
    void defend() {
        System.out.println(name + " raises a shield to defend.");
    }
}
