package FantasyAdventure.Rooms;

import FantasyAdventure.Enemies.Enemy;
import FantasyAdventure.Players.Player;

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
