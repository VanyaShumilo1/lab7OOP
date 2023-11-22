abstract class GameCharacter {
    String name;
    int health;
    int level;

    public GameCharacter(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    abstract void attack();

    abstract void defend();

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Level: " + level);
    }
}
