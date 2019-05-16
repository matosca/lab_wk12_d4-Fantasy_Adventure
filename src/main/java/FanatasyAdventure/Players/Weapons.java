package FanatasyAdventure.Players;

public enum Weapons {

    SWORD(7),
    AXE(20),
    MACE(18),
    HAMMER(12);


    private int damage;

    Weapons(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
