// Міні-програма для демонстрації використання ієрархії класів
public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Aragorn", 100, 10, 20);
        Archer archer = new Archer("Legolas", 80, 12, 30);
        Mage mage = new Mage("Gandalf", 120, 15, 50);

        warrior.attack();
        warrior.defend();
        warrior.displayInfo();

        System.out.println();

        archer.attack();
        archer.defend();
        archer.displayInfo();

        System.out.println();

        mage.attack();
        mage.defend();
        mage.displayInfo();
    }
}
