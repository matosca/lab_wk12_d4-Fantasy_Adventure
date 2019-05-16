package FanatasyAdventure.Players;


public abstract class Player {

    private int healthPoints;
    private String name;
    private Race race;
    private int wallet;

    public Player(String name, Race race, int wallet) {
        this.name = name;
        this.race = race;
        this.wallet = wallet;
        this.healthPoints = race.getHealthPoints();
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public int getWallet() {
        return wallet;
    }

}
