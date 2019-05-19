package FantasyAdventure.Rooms;

import FantasyAdventure.Enemies.Enemy;
import FantasyAdventure.Enums.PreciousObjects;
import FantasyAdventure.Players.Player;

import java.util.ArrayList;

public abstract class Room {

    private int coins;
    private Enemy enemy;
    private Player player;
    private PreciousObjects object;
    private ArrayList<Enemy> enemies;

    public Room(int coins) {
        this.coins = coins;
        this.enemy = null;
        this.player = null;
        this.object = null;
        this.enemies = new ArrayList<>();
    }

    public int getCoins() {
        return coins;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
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

    public PreciousObjects getObject() {
        return object;
    }
}
