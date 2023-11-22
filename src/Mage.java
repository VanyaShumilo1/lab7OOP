class Mage extends GameCharacter {
    int magicPower;

    public Mage(String name, int health, int level, int magicPower) {
        super(name, health, level);
        this.magicPower = magicPower;
    }

    @Override
    void attack() {
        System.out.println(name + " casts spell!");
    }

    @Override
    void defend() {
        System.out.println(name + " creates a magical barrier");
    }
}
