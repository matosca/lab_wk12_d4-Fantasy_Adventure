package FantasyAdventure.Rooms;

import FantasyAdventure.Enemies.Enemy;
import FantasyAdventure.Enums.PreciousObjects;

import java.util.ArrayList;

public class UltimateRoom extends Room{

    private ArrayList<Enemy> enemies;
    private PreciousObjects object;

    public UltimateRoom(int coins, PreciousObjects object) {
        super(coins);
        this.object = object;
        this.enemies = new ArrayList<>();
    }

    public PreciousObjects getObject() {
        return object;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public int enemiesCount() {
        return this.enemies.size();
    }

    public void addEnemiesToRoom(Enemy enemy) {
        this.enemies.add(enemy);
    }
}
