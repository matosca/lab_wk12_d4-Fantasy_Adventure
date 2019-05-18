package FantasyAdventure.Enums;

public enum MythicalCreatures {

    DRAGON(15),
    KELPIE(5),
    OGRE(8),
    BASILISK(12),
    HIPPOGRIFF(16),
    CHIMERA(11);

    private final int defendPoints;

    MythicalCreatures(int defendPoints){
        this.defendPoints = defendPoints;
    }

    public int getDefendPoints() {
        return defendPoints;
    }
}
