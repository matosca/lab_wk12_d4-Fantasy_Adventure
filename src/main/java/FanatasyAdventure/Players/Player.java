package FanatasyAdventure.Players;


import FanatasyAdventure.rooms.Room;

public abstract class Player {

    private int healthPoints;
    private String name;
    private Race race;
    private int wallet;
    private Room currentRoom;

    public Player(String name, Race race, int wallet) {
        this.name = name;
        this.race = race;
        this.wallet = wallet;
        this.healthPoints = race.getHealthPoints();
        this.currentRoom = null;
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

    public void setWallet(int number){
        this.wallet = number;
    }

    public Room getCurrentRoom(){
        return this.currentRoom;
    }

    public void enterRoom(Room room){
        this.currentRoom = room;
    }

    public int getCoins(){
        if (this.currentRoom != null){
            Room room = this.getCurrentRoom();
            this.wallet += room.getCoins();
        }
        return this.wallet;
    }
}
