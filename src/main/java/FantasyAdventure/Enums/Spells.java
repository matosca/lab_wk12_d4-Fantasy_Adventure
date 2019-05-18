package FantasyAdventure.Enums;

public enum Spells {

    FIREBALL(10),
    LIGHTNING(13),
    BLIGHT(18),
    INFLICTWOUNDS(23),
    FINGEROFDEATH(25),
    SCORCHINGRAY(17),
    DISINTEGRATE(28);

    private final int damage;

    Spells(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
