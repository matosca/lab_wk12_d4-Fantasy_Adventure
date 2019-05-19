package FantasyAdventure.rooms;

import FantasyAdventure.Enemies.Enemy;

public class EnemyRoom extends Room{

    private Enemy enemy;

    public EnemyRoom(int coins, Enemy enemy) {
        super(coins);
        this.enemy = enemy;
    }

    @Override
    public Enemy getEnemy() {
        return enemy;
    }
}
