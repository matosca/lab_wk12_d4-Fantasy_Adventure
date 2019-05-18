package FantasyAdventure.Enums;

public enum Protection {

    SHIELD(10),
    ARMOUR(12);

    private int armourRating;

    Protection(int armourRating) {
        this.armourRating = armourRating;
    }

    public int getArmourRating() {
        return armourRating;
    }
}
