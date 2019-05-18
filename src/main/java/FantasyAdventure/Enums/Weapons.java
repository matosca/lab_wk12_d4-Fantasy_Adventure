package FantasyAdventure.Enums;

public enum Weapons {

    SWORD(15),
    AXE(20),
    MACE(18),
    HAMMER(12),
    SPEAR(16),
    DAGGER(9);


    private final int damage;

    Weapons(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
