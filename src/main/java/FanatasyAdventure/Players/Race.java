package FanatasyAdventure.Players;

public enum Race {

    DWARF(150),
    HUMAN(100),
    ELF(80),
    HOBBIT(65),
    DRAGONBORN(200);

    private int healthPoints;

    Race(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
