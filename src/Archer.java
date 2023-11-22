class Archer extends GameCharacter {
    int agility;

    public Archer(String name, int health, int level, int agility) {
        super(name, health, level);
        this.agility = agility;
    }

    @Override
    void attack() {
        System.out.println(name + " shoots arrows!");
    }

    @Override
    void defend() {
        System.out.println(name + " dodges attacks.");
    }
}
