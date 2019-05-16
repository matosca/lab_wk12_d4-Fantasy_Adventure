package FanatasyAdventure.rooms;

import FanatasyAdventure.Enemies.Enemy;
import FanatasyAdventure.Players.Player;

public abstract class Room {

    private int coins;
    private Enemy enemy;
    private Player player;

    public Room(int coins) {
        this.coins = coins;
        this.enemy = null;
        this.player = null;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
