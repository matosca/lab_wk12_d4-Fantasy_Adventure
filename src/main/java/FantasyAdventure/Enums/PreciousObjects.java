package FantasyAdventure.Enums;

public enum PreciousObjects {

    RUBY(5),
    DIAMOND(10),
    GOLDENRING(8);

    private final int value;

    PreciousObjects(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
