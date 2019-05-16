package FanatasyAdventure.Players;

public enum Shields {

    SHIELD(10);

    private int armourRating;

    Shields(int armourRating) {
        this.armourRating = armourRating;
    }

    public int getShield() {
        return armourRating;
    }
}
