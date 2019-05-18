package FantasyAdventure.Enums;

public enum Weapons {

    SWORD(15),
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
