package FanatasyAdventure.Players;

public enum Protection {

    SHIELD(10);

    private int armourRating;

    Protection(int armourRating) {
        this.armourRating = armourRating;
    }

    public int getArmourRating() {
        return armourRating;
    }
}
